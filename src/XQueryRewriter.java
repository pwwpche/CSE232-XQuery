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
   set up a group for it. And if there are other variables that references this var,
   categorize them into the same group.

   If there are "Where" clauses that belongs to
*
*
* */
public class XQueryRewriter {

    private HashMap<Integer, ArrayList< Pair<String, String> > >groupVars;
    private HashMap<Integer, ArrayList<String >> groupWhere;
    private String finalReturnString;

    private HashMap<String, Integer> varToGroup;
    private HashMap<Pair<Integer, Integer>, ArrayList<Pair<String, String>> > edgeToEqualPair;

    XQueryRewriter(){
        finalReturnString = "";
        groupVars = new HashMap<>();
        varToGroup = new HashMap<>();
        groupWhere = new HashMap<>();
        edgeToEqualPair = new HashMap<>();
    }

    public void construct(XQueryLangParser.StatementContext statement){
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

            // Get which group this variable should belong to.
            Integer groupIdx;
            if(statementStr.startsWith("doc")){
                // Statement contains 'DOC' as prefix. This is a new group. Create one.
                groupIdx = groupVars.size();
                groupVars.put(groupIdx, new ArrayList<>());
                groupWhere.put(groupIdx, new ArrayList<>());

            }else{
                // Look for which group current variable belongs to by looking at its prefix variable.
                int slashPos = statementStr.indexOf('/') == -1 ? statementStr.length() : statementStr.indexOf('/');
                String prefixVar = statementStr.substring(0, slashPos);
                groupIdx = varToGroup.get(prefixVar);
            }
            groupVars.get(groupIdx).add(varStatement);
            varToGroup.put(varName, groupIdx);
        }


        //Analyze WHERE clause.
        XQueryLangParser.ConditionContext condition = whereClauseContext.condition();
        dfs(condition);

        //Analyse RETURN clause
        finalReturnString = returnClauseContext.getText().replace("return", "return ");
//        for (Object entry : varToGroup.entrySet()) {
//            String varName = ((Map.Entry<String, Integer>)entry).getKey();
//            if (finalReturnString.contains(varName)) {
//                String newVarName = "$tuple/" + varName.substring(1) + "/*";
//                finalReturnString = finalReturnString.replace(varName, newVarName);
//            }
//        }
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
                Integer varIdx1 = varToGroup.get(eqStr1);
                Integer varIdx2 = varToGroup.get(eqStr2);

                //Swap indices so smaller goes before larger one.
                if(varIdx1 > varIdx2){
                    Integer tmp = varIdx1; varIdx1 = varIdx2; varIdx2 = tmp;
                    String tmp2 = eqStr1; eqStr1 = eqStr2; eqStr2 = tmp2;
                }
                Pair<Integer, Integer> edge = Pair.mkPair(varIdx1, varIdx2);
                Pair<String, String> eqVars = Pair.mkPair(eqStr1, eqStr2);

                // First check if this join is for the same group.
                if(varIdx1.equals(varIdx2)){
                    groupWhere.get(varIdx1).add(condition.getText());
                }else{
                    //If end of join edges belongs to different group,
                    // then add an edge between these two groups.
                    if(!edgeToEqualPair.containsKey(edge)){
                        edgeToEqualPair.put(edge, new ArrayList<>());
                    }
                    edgeToEqualPair.get(edge).add(eqVars);
                }



            }else{
                // This is a "$variable = Constant" statement.
                // No need to add join edges between groups.
                Integer groupIdx;
                if(eqStr1.startsWith("$")){
                    groupIdx = varToGroup.get(eqStr1);
                }else{
                    groupIdx = varToGroup.get(eqStr2);
                }
                groupWhere.get(groupIdx).add(condition.getText());
            }
        }


    }

    public String output(){
        if(groupVars.size() < 1){
            return "Can't peform join rewriting.";
        }

        String initFor = "for $tuple in ";
        HashMap<Pair<Integer, Integer>, ArrayList<Pair<String, String>> > oldEdgeToEquaPair = edgeToEqualPair;

        //Most naive rewriting
        String prevJoin = getGroupFWR(0);
        for(int end = 1, size = groupVars.size() ; end < size ; end++){
            ArrayList<Pair<String, String>> merged = new ArrayList<>();
            for(int start = 0 ; start < end ; start++){
                Pair<Integer, Integer> edge = Pair.mkPair(start, end);
                if(edgeToEqualPair.containsKey(edge)){
                    merged.addAll(edgeToEqualPair.get(edge));
                }
            }

            String currentJoin = "join ( \n";
            currentJoin += prevJoin + ",\n";
            currentJoin += getGroupFWR(end) + ",\n";

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

    private String getGroupFWR(int group){

        //Process FOR and Return
        String result = "for ", returnString = "";
        ArrayList<Pair<String, String>> varStatements = groupVars.get(group);
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
        ArrayList<String> whereClauses = groupWhere.get(group);
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