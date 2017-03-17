import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by liuche on 3/1/17.
 *
 */



/*
*
* for $b in doc("input")/book,
    $a in doc("input")/entry,
    $tb in $b/title,
    $ta in $a/title
    where $tb eq $ta
    return
        <book-with-prices>
            { $tb,
            <price-review>{ $a/price }</price-review>,
            <price>{ $b/price }</price> }
        </book-with-prices>

   Rewritten as:
   for $tuple in join ( for $b in doc("input")/book,
                        $tb in $b/title
                        return <tuple> <b> {$b} </b> <tb> {$tb} </tb> </tuple>,

                        for $a in doc("input")/entry,
                        $ta in $a/title
                        return <tuple> <a> {$a} </a> <ta> {$ta} </ta> </tuple>,
                        [tb], [ta] )
    return
        <book-with-prices>
            { $tuple/tb / *,
            <price-review>{ $tuple/a/* / price }</price-review>,
                    <price>{ $tuple/b/* / price }</price> }
        </book-with-prices>

   Basic Idea:

   For each variable definition like VARNAME in AP,
   set up a table for it. And if there are other variables that references this var,
   categorize them into the same table.

   If there are "Where" clauses that belongs to only one join table, add it to that table.
   If some WhereClause joins different tables, add an edge between them.
*
*
* */
class XQueryRewriter {

    private ArrayList<JoinTable> tables;

    private String finalReturnString;

    private HashMap<String, Integer> varToTable;

    private HashMap<Pair<Integer, Integer>, ArrayList<Pair<String, String>> > edgeToEqualPair;

    XQueryRewriter(){
        finalReturnString = "";
        tables = new ArrayList<>();
        varToTable = new HashMap<>();
        edgeToEqualPair = new HashMap<>();
    }

    void construct(XQueryLangParser.StatementContext statement){
        if( !(statement instanceof XQueryLangParser.Stat_forContext) ){
            return ;
        }
        XQueryLangParser.ForClauseContext forClauseContext = ((XQueryLangParser.Stat_forContext) statement).forStatement().forClause();
        XQueryLangParser.WhereClauseContext whereClauseContext = ((XQueryLangParser.Stat_forContext) statement).forStatement().whereClause();
        XQueryLangParser.ReturnClauseContext returnClauseContext = ((XQueryLangParser.Stat_forContext) statement).forStatement().returnClause();


        // Analyze FOR clause.
        for(int i = 0 , size = forClauseContext.variable().size() ;
                i < size ; i++){
            String varName = forClauseContext.variable(i).getText();
            String statementStr = forClauseContext.statement(i).getText();

            // Combine variable with its corresponding statement definition.
            Pair<String, String> varStatement = Pair.mkPair(varName, statementStr);

            // Get which table this variable should belong to.
            Integer tableIdx;
            if(statementStr.startsWith("doc")){
                // Statement contains 'DOC' as prefix. This is a new table. Create one.
                tableIdx = tables.size();
                tables.add(new JoinTable(tableIdx));
            }else{
                // Look for which table current variable belongs to by looking at its prefix variable.
                int slashPos = statementStr.indexOf('/') == -1 ? statementStr.length() : statementStr.indexOf('/');
                String prefixVar = statementStr.substring(0, slashPos);
                tableIdx = varToTable.get(prefixVar);
            }
            tables.get(tableIdx).vars.add(varStatement);
            varToTable.put(varName, tableIdx);
        }


        //Analyze WHERE clause.
        XQueryLangParser.ConditionContext condition = whereClauseContext.condition();
        dfs(condition);

        //Analyse RETURN clause
        finalReturnString = returnClauseContext.getText().replace("return", "return ");
        finalReturnString = finalReturnString.replaceAll("\\$([A-Za-z0-9_]+)", "\\$tuple/$1/*");


    }

    // Method for assisting WHERE clause analysis.
    private void dfs(XQueryLangParser.ConditionContext condition){
        if(condition instanceof XQueryLangParser.Cond_andContext){
            XQueryLangParser.Cond_andContext andContext = (XQueryLangParser.Cond_andContext) condition;
            dfs(andContext.condition(0));
            dfs(andContext.condition(1));
        }else if(condition instanceof XQueryLangParser.Cond_equalContext){
            XQueryLangParser.Cond_equalContext equalContext = (XQueryLangParser.Cond_equalContext) condition;
            String eqStr1 = equalContext.statement(0).getText();
            String eqStr2 = equalContext.statement(1).getText();
            if(eqStr1.startsWith("$") && eqStr2.startsWith("$")){
                //Join these two vars together.
                Integer varIdx1 = varToTable.get(eqStr1);
                Integer varIdx2 = varToTable.get(eqStr2);

                //Swap indices so smaller goes before larger one.
                if(varIdx1 > varIdx2){
                    Integer tmp = varIdx1; varIdx1 = varIdx2; varIdx2 = tmp;
                    String tmp2 = eqStr1; eqStr1 = eqStr2; eqStr2 = tmp2;
                }
                Pair<Integer, Integer> edge = Pair.mkPair(varIdx1, varIdx2);
                Pair<String, String> eqVars = Pair.mkPair(eqStr1, eqStr2);

                // First check if this join is for the same table.
                if(varIdx1.equals(varIdx2)){
                    tables.get(varIdx1).whereStats.add(condition.getText().replace("eq", " eq "));
                }else{
                    //If end of join edges belongs to different table,
                    // then add an edge between these two tables.
                    if(!edgeToEqualPair.containsKey(edge)){
                        edgeToEqualPair.put(edge, new ArrayList<>());
                    }
                    edgeToEqualPair.get(edge).add(eqVars);
                }



            }else{
                // This is a "$variable = Constant" statement.
                // No need to add join edges between tables.
                Integer tableIdx;
                if(eqStr1.startsWith("$")){
                    tableIdx = varToTable.get(eqStr1);
                }else{
                    tableIdx = varToTable.get(eqStr2);
                }
                //String addedText = condition.getText().replaceAll("\\$([A-Za-z0-9_]+)", "\\$$1\\/text\\(\\)");
                //tables.get(tableIdx).whereStats.add(addedText);
                tables.get(tableIdx).whereStats.add(condition.getText().replace("eq", " eq "));
            }
        }


    }

    String output(){
        if(tables.size() < 1){
            return "Can't peform join rewriting.";
        }

        String initFor = "for $tuple in ";

        //Most naive rewriting
        String prevJoin = getTableFWR(tables.get(0));

        for(int end = 1, size = tables.size() ; end < size ; end++){
            ArrayList<Pair<String, String>> merged = new ArrayList<>();
            for(int start = 0 ; start < end ; start++){
                Pair<Integer, Integer> edge = Pair.mkPair(start, end);
                if(edgeToEqualPair.containsKey(edge)){
                    merged.addAll(edgeToEqualPair.get(edge));
                }
            }

            String currentJoin = "join ( \n";
            currentJoin += prevJoin + ",\n";
            currentJoin += getTableFWR(tables.get(end)) + ",\n";

            String leftVars = "", rightVars = "";
            for(Pair<String, String> pairVars: merged){
                leftVars += pairVars.getV0().substring(1) + ", ";
                rightVars += pairVars.getV1().substring(1) + ", ";
            }

            // Remove last comma symbol.
            if(leftVars.length() > 0){
                leftVars = leftVars.substring(0, leftVars.length() - 2);
                rightVars = rightVars.substring(0, rightVars.length() - 2);
            }
            currentJoin += "[" + leftVars + "], [" + rightVars + "]";
            currentJoin += ")";
            prevJoin = currentJoin;
        }



        return initFor + prevJoin + "\n" + finalReturnString;
    }


    String output_better(){

        if(tables.size() < 1){
            return "Can't peform join rewriting.";
        }

        String initFor = "for $tuple in ";

        //Union-find
        ArrayList<Integer> groupIdx = new ArrayList<>();
        for(int i = 0 , size = tables.size() ; i < size ; i++){
            groupIdx.add(i);
        }

        for(Pair<Integer, Integer> edge: edgeToEqualPair.keySet()){
            int left = edge.getV0(), right = edge.getV1();
            if(qFind(groupIdx, left) != qFind(groupIdx, right)){
                qUnion(groupIdx, left, right);
            }

        }

        // Collect tables into groups.
        // Tables are "connected" within each group, and are "disjointed" among groups.
        HashMap<Integer, ArrayList<JoinTable>> tableToGroup = new HashMap<>();
        for(int i = 0 , size = groupIdx.size() ; i < size ; i++){
            int rootTableIdx = qFind(groupIdx, i);
            if(!tableToGroup.containsKey(rootTableIdx)){
                tableToGroup.put(rootTableIdx, new ArrayList<>());
            }

            tableToGroup.get(rootTableIdx).add(tables.get(i));
        }

        //Groups with less fields are considered smaller
        ArrayList<ArrayList<JoinTable>> joinTables = new ArrayList<>();
        joinTables.addAll(tableToGroup.values());
        Collections.sort(joinTables, (o1, o2) -> {
            // Count how many fields are there in each group.
            int sumVars1 = 0, sumVars2 = 0;
            for(JoinTable t : o1){
                sumVars1 += t.vars.size();
            }

            for(JoinTable t : o2){
                sumVars2 += t.vars.size();
            }
            return sumVars1 - sumVars2;
        });

        String totalJoin = "";
        for (ArrayList<JoinTable> tableGroup : joinTables){
            if(tableGroup.size()  == 0){
                continue;
            }

            //Join the tables with most selection conditions first
            Collections.sort(tableGroup, (o1, o2) -> o1.index - o2.index);

            String inGroupJoin = getTableFWR(tableGroup.get(0));

            for(int end = 1 , size = tableGroup.size() ; end < size ; end++){
                ArrayList<Pair<String, String>> mergedPairs = new ArrayList<>();
                for(int start = 0 ; start < end ; start++){

                    Pair<Integer, Integer> edge = Pair.mkPair(tableGroup.get(start).index, tableGroup.get(end).index);
                    if(edge.getV0() > edge.getV1()){
                        int v0 = edge.getV0(), v1 = edge.getV1();
                        edge = Pair.mkPair(v1, v0);
                    }

                    if(edgeToEqualPair.containsKey(edge)){
                        mergedPairs.addAll(edgeToEqualPair.get(edge));
                    }
                }
                inGroupJoin = getJoinStr(inGroupJoin, tableGroup.get(end), mergedPairs);
            }

            if(totalJoin.equals("")){
                totalJoin = inGroupJoin;
            }else{
                //Join with empty arguments
                totalJoin = "join (\n " + totalJoin + ",\n"
                        + inGroupJoin + ", \n" + " [], [] ) \n";
            }
        }


        return initFor + totalJoin + "\n" + finalReturnString;

    }

    private int qFind(ArrayList<Integer> groupIdx, int left){
        ArrayList<Integer> path = new ArrayList<>();
        while(groupIdx.get(left) != left){
            path.add(left);
            left = groupIdx.get(left);
        }
        for(int node : path){
            groupIdx.set(node, left);
        }
        return left;
    }

    private void qUnion(ArrayList<Integer> groupIdx, int left, int right){
        int leftRoot = qFind(groupIdx, left);
        int rightRoot = qFind(groupIdx, right);
        groupIdx.set(rightRoot, leftRoot);
    }

    private String getJoinStr(String prevJoin, JoinTable curTable, ArrayList<Pair<String, String>> mergedPairs){
        String currentJoin = "join ( \n";
        currentJoin += prevJoin + ",\n";
        currentJoin += getTableFWR(curTable) + ",\n";

        String leftVars = "", rightVars = "";
        for(Pair<String, String> pairVars: mergedPairs){
            leftVars += pairVars.getV0().substring(1) + ", ";
            rightVars += pairVars.getV1().substring(1) + ", ";
        }

        // Remove last comma symbol.
        if(leftVars.length() > 0){
            leftVars = leftVars.substring(0, leftVars.length() - 2);
            rightVars = rightVars.substring(0, rightVars.length() - 2);
        }
        currentJoin += "[" + leftVars + "], [" + rightVars + "]";
        currentJoin += ")";

        return currentJoin;
    }

    private String getTableFWR(JoinTable table){

        //Process FOR and Return
        String result = "for ", returnString = "";
        ArrayList<Pair<String, String>> varStatements = table.vars;
        for(Pair<String, String> entry : varStatements){
            String varName = entry.getV0();
            String varNoPrefix = varName.substring(1, varName.length());
            String statement = entry.getV1();
            result += varName + " in " + statement + ",\n";
            returnString += "<" + varNoPrefix + ">{" + varName + "} </" + varNoPrefix + ">,\n";
        }
        //Remove last comma symbol
        result = result.substring(0, result.length() - 2);
        result = result + "\n";
        returnString = returnString.substring(0, returnString.length() - 2);
        returnString += "\n";

        //Add addition WHERE if exists
        ArrayList<String> whereClauses = table.whereStats;
        if(whereClauses.size() > 0){
            result += "where ";
            for(String entry : whereClauses){
                result += entry + "\n";
            }
        }

        result += "return <tuple> {" + returnString + "} </tuple>\n";
        return result;
    }


}


/*
*  Weird case:
*
    for $a in document

        $b in document
        $c in $b

        $d in document
        $e in $d


        $f in document
        $g in $f

        $h in document
        $i in $h
        $j in $h

    where
        $c = $e
        $c = $g
        $e = $g
        $i = $j
    return


    2 -> 3
    2 -> 4
    3 -> 4

    //Is it a Cartesian Join
    5 -> 5


    (2,3)




* */