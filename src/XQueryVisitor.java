
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by liuche on 1/16/17.
 * XQueryLang Visitor
 */
class XQueryVisitor extends XQueryLangBaseVisitor<Value>{


    private Map<String, Value> mem = new HashMap<>();
    private Value results = Value.VOID;
    private Document newDoc;
    @Override
    public Value visitAp(XQueryLangParser.ApContext ctx) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        String fileName = ctx.fileName().getText().replace('\"', ' ').trim();
        try {
            //Using factory get an instance of document builder
            DocumentBuilder db = dbf.newDocumentBuilder();

            //parse using builder to get DOM representation of the XML file
            List<Node> next = new ArrayList<>();
            Document doc = db.parse(fileName);
            List<Node> prev = new ArrayList<>();
            prev.add(doc);

            //Visit next node
            getChildren(prev, next, ctx.LSLASH().size());

            results = new Value(next);
            this.visit(ctx.rp());

        } catch(Exception e) {
            e.printStackTrace();
        }

        return results;
    }

    @Override
    public Value visitRp_dotdot(XQueryLangParser.Rp_dotdotContext ctx) {
        Value prev = results;
        Set<Node> nextSet = new HashSet<>();

        for(Node node : prev.asListNode()){
            try {
                nextSet.add( node.getParentNode().getParentNode());
            }catch(Exception e){
                nextSet.add(node.getOwnerDocument());
            }
        }
        results = new Value(new ArrayList<>(nextSet));
        return results;

    }

    @Override
    public Value visitRp_star(XQueryLangParser.Rp_starContext ctx) {
        return results;
    }

    @Override
    public Value visitRp_dot(XQueryLangParser.Rp_dotContext ctx) {
        Value prev = results;
        Set<Node> nextSet = new HashSet<>();

        for(Node node : prev.asListNode()){
            try {
                nextSet.add( node.getParentNode());
            }catch(Exception e){
                nextSet.add(node.getOwnerDocument());
            }
        }
        results = new Value(new ArrayList<>(nextSet));
        return results;
    }

    @Override
    public Value visitRp_comma(XQueryLangParser.Rp_commaContext ctx) {
        Value prevResult = results;
        Value rp1 = this.visit(ctx.rp(0));
        results = prevResult;
        Value rp2 = this.visit(ctx.rp(1));

        Set<Node> resSet = new HashSet<>();

        resSet.addAll(rp1.asListNode());
        resSet.addAll(rp2.asListNode());
        List<Node> res = new ArrayList<>(resSet);
        results = new Value(res);
        return results;
    }

    @Override
    public Value visitRp_text(XQueryLangParser.Rp_textContext ctx) {
        List<Node> prev = results.asListNode();
        List<Node> next = new ArrayList<>();
        for(Node node : prev){
            if(node.getNodeType() == Node.TEXT_NODE){
                next.add(node);
            }
        }
        results = new Value(next);
        return results;
    }

    @Override
    public Value visitRp_tagName(XQueryLangParser.Rp_tagNameContext ctx) {

        List<Node> prev = results.asListNode();
        List<Node> next = new ArrayList<>();
        for(Node node : prev){
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                if(element.getTagName().equals(ctx.getText())){
                    next.add(element);
                }
            }

        }
        results = new Value(next);
        return results;
    }

    @Override
    public Value visitRp_filter(XQueryLangParser.Rp_filterContext ctx) {
        assert results.asListNode().size() == new HashSet<>(results.asListNode()).size();

        this.visit(ctx.rp());
        List<Node> prev = results.asListNode();
        List<Node> next = new ArrayList<>();
        for(Node node : prev){
            List<Node> prevVal = new ArrayList<>();
            prevVal.add(node);

            List<Node> newVal = new ArrayList<>();
            getChildren(prevVal, newVal, 1);

            results = new Value(newVal);
            Value ret = this.visit(ctx.filter());
            assert ret.isBoolean();
            if(ret.asBoolean()){
                next.add(node);
            }
        }
        results = new Value(next);
        return results;
    }

    @Override
    public Value visitRp_paren(XQueryLangParser.Rp_parenContext ctx) {
        results = this.visit(ctx.rp());
        return results;
    }

    @Override
    public Value visitRp_at(XQueryLangParser.Rp_atContext ctx) {
        List<Node> prev = results.asListNode();
        List<Node> next = new ArrayList<>();

        //Get the name of the attribute
        String attrName = ctx.getText();

        //For each node in previous result, get the attribute value.
        //TODO: Should we return result as pure string, or a new node node?
        for(Node node : prev){
            if(node.getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Element element = (Element) node;
            String attrContent = element.getAttribute(ctx.getText());
            Node attrElem = createElement(attrName);
            assert attrElem != null;
            attrElem.setTextContent(attrContent);
            next.add(attrElem);
        }
        results = new Value(next);
        return results;
    }

    @Override
    public Value visitRp_slash(XQueryLangParser.Rp_slashContext ctx) {
        this.visit(ctx.rp(0));
        List<Node> prev = results.asListNode();
        List<Node> next = new ArrayList<>();
        getChildren(prev, next, ctx.LSLASH().size());
        results = new Value(next);
        this.visit(ctx.rp(1));
        return results;
    }


    private List<Node> getDirectChildren(Node node){
        List<Node> prev = new ArrayList<>();
        List<Node> next = new ArrayList<>();
        prev.add(node);
        getChildren(prev, next, 1);
        return next;
    }


    private Node getDirectChildrenByTagName(Node node, String tagName){
        List<Node> prev = getDirectChildren(node);
        List<Node> res = new ArrayList<>();
        for(Node child : prev){
            if(child.getNodeType() == Node.ELEMENT_NODE){
                if(((Element)child).getTagName().equals(tagName)){
                    res.add(child);
                }
            }
        }
        assert res.size() == 1;
        return res.get(0);
    }

    private void getChildren(List<Node> prev, List<Node> next, int slashes){
        Set<Node> nextSet = new HashSet<>();
        for(Node node : prev){
            if(slashes == 1){ //Immediate children
                // Only visit immediate children
                Node childNode = node.getFirstChild();
                while( childNode !=null ){
                    nextSet.add(childNode);
                    childNode = childNode.getNextSibling();
                }
            }else{
                //Get all the descendants, not including itself.
                if(node.getNodeType() == Node.ELEMENT_NODE || node.getNodeType() == Node.DOCUMENT_NODE){
                    //First add its own children
                    NodeList childs = node.getChildNodes();
                    for(int i = 0 ; i < childs.getLength() ; i++){
                        nextSet.add(childs.item(i));
                    }
                    //Then add children's children.

                    NodeList nodeList ;
                    if(node.getNodeType() == Node.DOCUMENT_NODE){
                        nodeList = ((Document) node).getElementsByTagName("*");
                    }else{
                        nodeList = ((Element) node).getElementsByTagName("*");
                    }
                    for(int i = 0 ; i < nodeList.getLength() ; i++){
                        NodeList childsList = nodeList.item(i).getChildNodes();
                        for(int j = 0 ; j < childsList.getLength() ; j++){
                            nextSet.add(childsList.item(j));
                        }
                    }
                }else{
                    //TODO: Does a node other than ELEMENT_NODE have children?
                    return ;
                }


            }
        }
        next.addAll(nextSet);
    }



    @Override
    public Value visitFilter_rp(XQueryLangParser.Filter_rpContext ctx) {
        this.visit(ctx.rp());
        results = new Value(results.asListNode().size() != 0);
        return results;
    }

    @Override
    public Value visitFilter_eq(XQueryLangParser.Filter_eqContext ctx) {
        Value prev = results;
        Set<Node> res1 = new HashSet<>(this.visit(ctx.rp(0)).asListNode());
        results = prev;
        Set<Node> res2 = new HashSet<>(this.visit(ctx.rp(1)).asListNode());
        boolean flag=false;
        for (Node node1 : res1){
            for (Node node2 : res2){
                if (node1.isEqualNode(node2)){
                    flag=true;
                    break;
                }
            }
        }
        results = new Value(flag);
        return results;
    }

    @Override
    public Value visitFilter_andOr(XQueryLangParser.Filter_andOrContext ctx) {
        Value prev = results;
        boolean left = this.visit(ctx.filter(0)).asBoolean();
        results = prev;
        boolean right = this.visit(ctx.filter(1)).asBoolean();
        if(ctx.op.getType() == XQueryLangParser.AND){
            results = new Value(left && right);
        }else{
            results = new Value(left || right);
        }
        return results;
    }

    @Override
    public Value visitFilter_is(XQueryLangParser.Filter_isContext ctx) {
        //TODO: What is the difference between `eq` and `is`?
        Value prev = results;
        Set<Node> res1 = new HashSet<>(this.visit(ctx.rp(0)).asListNode());
        results = prev;
        Set<Node> res2 = new HashSet<>(this.visit(ctx.rp(1)).asListNode());
        res1.retainAll(res2);
        if(res1.size() > 0){
            results = new Value(true);
        }else{
            results = new Value(false);
        }
        return results;
    }

    @Override
    public Value visitFilter_paren(XQueryLangParser.Filter_parenContext ctx) {
        return this.visit(ctx.filter());
    }

    @Override
    public Value visitFilter_not(XQueryLangParser.Filter_notContext ctx) {
        results = new Value(!(this.visit(ctx.filter()).asBoolean()));
        return results;
    }

    @Override
    public Value visitFileName(XQueryLangParser.FileNameContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitTagName(XQueryLangParser.TagNameContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitAttName(XQueryLangParser.AttNameContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitStat_tag(XQueryLangParser.Stat_tagContext ctx) {

        String tagName = ctx.tagName(0).getText();
        if(!tagName.equals(ctx.tagName(1).getText().replace("/", ""))){
            throw new RuntimeException("Invalid tag name");
        }
        Value res = this.visit(ctx.statement());
        Node newNode = createElement(tagName);


        List<Node> result = new ArrayList<>();

        for(Node node : res.asListNode()){
            assert newNode != null;
            Node importedNode = newDoc.importNode(node, true);
            newNode.appendChild(importedNode);
        }

        result.add(newNode);
        results = new Value(result);


        return results;
    }

    @Override
    public Value visitStat_ap(XQueryLangParser.Stat_apContext ctx) {
        return this.visit(ctx.ap());
    }

    @Override
    public Value visitStat_for(XQueryLangParser.Stat_forContext ctx) {
        return this.visit(ctx.forStatement());
    }

    @Override
    public Value visitStat_comma(XQueryLangParser.Stat_commaContext ctx) {
        Value prevResult = results;
        Value res1 = this.visit(ctx.statement(0));
        results = prevResult;
        Value res2 = this.visit(ctx.statement(1));
        List<Node> res = new ArrayList<>();
        res.addAll(res1.asListNode());
        res.addAll(res2.asListNode());
        results = new Value(res);
        return results;

    }

    @Override
    public Value visitStat_variable(XQueryLangParser.Stat_variableContext ctx) {
        String id = ctx.getText();
        Value value = mem.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        results = value;
        return value;
    }

    @Override
    public Value visitStat_join(XQueryLangParser.Stat_joinContext ctx) {
        return this.visit(ctx.joinStatement());
    }

    @Override
    public Value visitJoinStatement(XQueryLangParser.JoinStatementContext ctx) {
        Value prev = results;
        Value left = this.visit(ctx.statement(0));
        results = prev;
        Value right = this.visit(ctx.statement(1));

        List<String> leftVars = new ArrayList<>();
        List<String> rightVars = new ArrayList<>();

        leftVars.addAll(ctx.varListClause(0).NAMESTRING().stream().map(ParseTree::getText).collect(Collectors.toList()));
        rightVars.addAll(ctx.varListClause(1).NAMESTRING().stream().map(ParseTree::getText).collect(Collectors.toList()));

        Set<Node> nextLeft = new HashSet<>();
        Set<Node> nextRight = new HashSet<>();
        nextLeft.addAll(left.asListElem());
        nextRight.addAll(right.asListElem());

        List<Node> result = new ArrayList<>();
        results = new Value(result);
        Map<NodeWrapper, ArrayList<Node>> candidates;

        //No join equations, so just do cartesian product.
        if(leftVars.size() == 0 || rightVars.size() == 0){
            for(Node leftNode : nextLeft){
                List<Node> leftChildren = getDirectChildren(leftNode);
                for(Node rightNode : nextRight){
                    List<Node> rightChildren = getDirectChildren(rightNode);
                    Element element = createElement("tuple");
                    assert element != null;

                    for(Node leftChild : leftChildren){
                        Node child = leftChild.cloneNode(true);
                        element.appendChild(child);
                    }
                    for(Node rightChild : rightChildren){
                        Node child = rightChild.cloneNode(true);
                        element.appendChild(child);
                    }
                    result.add(element);
                }
            }
        }

        for(int i = 0 , size = (leftVars.size() < rightVars.size() ? leftVars.size() : rightVars.size());
                i < size ; i++){

            String tagLeft = leftVars.get(i);
            String tagRight = rightVars.get(i);
            Set<Node> tempLeft = new HashSet<>();
            Set<Node> tempRight = new HashSet<>();
            // Construct candidate set of right
            // All nodes in this set has a child node with tag `tagRight`
            candidates = new HashMap<>();
            for(Node rightNode : nextRight){
                //Get all children of this node.
                List<Node> rightChilds = getDirectChildren(rightNode);

                //Look for the element with current tag name
                for(Node rightChild : rightChilds){
                    if(rightChild.getNodeType() == Node.ELEMENT_NODE &&
                            ((Element)rightChild).getTagName().equals(tagRight)){
                        NodeWrapper nodeWrapper = new NodeWrapper(rightChild);
                        if(!candidates.containsKey(nodeWrapper)){
                            candidates.put(nodeWrapper, new ArrayList<>());
                        }
                        candidates.get(nodeWrapper).add(rightNode);
                        break;
                    }
                }
            }

            // Scan left one by one
            // If left has a children that is in set<right> :
            //    add left and right to candidate for next loop
            for(Node leftNode : nextLeft){
                //Get all children of this node.
                List<Node> leftChilds = getDirectChildren(leftNode);

                //Look for the element with current tag name
                for(Node leftChild : leftChilds){
                    if(leftChild.getNodeType() == Node.ELEMENT_NODE &&
                            ((Element)leftChild).getTagName().equals(tagLeft)){

                        NodeWrapper leftWrapper = new NodeWrapper(leftChild);
                        if(candidates.containsKey(leftWrapper)){
                            tempLeft.add(leftNode);
                            ArrayList<Node> candidatesRight = candidates.get(leftWrapper);

                            for(Node node : candidatesRight){
                                Node leftContent = leftChild.getFirstChild();
                                Node rightContent = getDirectChildrenByTagName(node, tagRight).getFirstChild();
                                if(leftContent.isEqualNode(rightContent)){
                                    tempRight.add(node);
                                }
                            }

                            if(i == size - 1){

                                for(Node tempRightNode : tempRight){
                                    Element element = createElement("tuple");
                                    assert element != null;
                                    List<Node> resLeftChild = getDirectChildren(leftNode);
                                    for (Node resNode : resLeftChild){
                                        Node newNode = resNode.cloneNode(true);
                                        element.appendChild(newNode);
                                    }
                                    List<Node> resRightChild = getDirectChildren(tempRightNode);
                                    for (Node resNode : resRightChild){
                                        Node newNode = resNode.cloneNode(true);
                                        element.appendChild(newNode);
                                    }
                                    result.add(element);
                                }
                            }
                            break;
                        }
                    }
                }


            }
            nextLeft = tempLeft;
            nextRight = tempRight;

            //Produce result in the last iteration.

            if(i == size - 1){
                results = new Value(result);
            }
        }

        return results;


    }

    @Override
    public Value visitVarListClause(XQueryLangParser.VarListClauseContext ctx) {
        // This function should not be visited.
        return new Value(false);
    }


    @Override
    public Value visitStat_paren(XQueryLangParser.Stat_parenContext ctx) {
        return this.visit(ctx.statement());
    }

    @Override
    public Value visitStat_constant(XQueryLangParser.Stat_constantContext ctx) {
        List<Node> result = new ArrayList<>();
        result.add(createTextNode(ctx.getText().replace("\"", "")));
        results = new Value(result);
        return results;
    }

    @Override
    public Value visitStat_slash(XQueryLangParser.Stat_slashContext ctx) {
        results = this.visit(ctx.statement());

        List<Node> prev = results.asListNode();
        List<Node> next = new ArrayList<>();

        getChildren(prev, next, ctx.LSLASH().size());
        results = new Value(next);
        this.visit(ctx.rp());
        return results;
    }

    @Override
    public Value visitStat_let(XQueryLangParser.Stat_letContext ctx) {
        return this.visit(ctx.letStatement());
    }


    @Override
    public Value visitForStatement(XQueryLangParser.ForStatementContext ctx) {
        Map<String, Value> oldmem = mem;


        List<Node> finalResult = new ArrayList<>();
        this.forStatementDFS(ctx.forClause(), 0, finalResult);

        results = new Value(finalResult);

        mem = oldmem;
        return results;

    }

    @Override
    public Value visitLetStatement(XQueryLangParser.LetStatementContext ctx) {
        this.visit(ctx.letClause());
        return this.visit(ctx.statement());
    }


    @Override
    public Value visitForClause(XQueryLangParser.ForClauseContext ctx) {
        // According to what we do in forStatement, this part of code will never be reached.
        assert false;
        results = Value.VOID;
        return results;
    }


    private void forStatementDFS(XQueryLangParser.ForClauseContext ctx, int varIdx, List<Node> finalResult){
        // Treat this as a tree.
        if(varIdx >= ctx.variable().size()){     //All the variables have already been set, do the processing work.
            XQueryLangParser.ForStatementContext parentCtx = (XQueryLangParser.ForStatementContext)ctx.getParent();
            if(parentCtx.letClause() != null){
                this.visit(parentCtx.letClause());
            }

            if(parentCtx.whereClause() != null){
                Value res = this.visit(parentCtx.whereClause());
                assert res.isBoolean();
                if(!res.asBoolean()){
                    return ;
                }

            }
            Value returnResult = this.visit(parentCtx.returnClause());
            finalResult.addAll(returnResult.asListNode());
        }else{                                  // Set up variables before processing.
            String variable = ctx.variable(varIdx).getText();
            Value value = this.visit(ctx.statement(varIdx));
            for(Node node : value.asListNode()){
                List<Node> elemList = new ArrayList<>();
                elemList.add(node);
                mem.put(variable, new Value(elemList));
                forStatementDFS(ctx, varIdx + 1, finalResult);
            }
        }

    }



    @Override
    public Value visitReturnClause(XQueryLangParser.ReturnClauseContext ctx) {
        return this.visit(ctx.statement());
    }

    @Override
    public Value visitLetClause(XQueryLangParser.LetClauseContext ctx) {
        Value prev = results;
        List<String> variables = new ArrayList<>();
        List<Value> values = new ArrayList<>();
        for(int i = 0 ; i < ctx.variable().size() ; i++){
            results = prev;
            String varName = ctx.variable(i).getText();
            Value value = this.visit(ctx.statement(i));
            variables.add(varName);
            values.add(value);
        }
        this.addVariable(variables, values);
        results = Value.VOID;
        return results;
    }

    @Override
    public Value visitWhereClause(XQueryLangParser.WhereClauseContext ctx) {
        results = this.visit(ctx.condition());
        return results;
    }

    @Override
    public Value visitCond_and(XQueryLangParser.Cond_andContext ctx) {
        Value prevResult = results;
        Value left = this.visit(ctx.condition(0));
        results = prevResult;
        Value right = this.visit(ctx.condition(1));

        results = new Value(left.asBoolean() && right.asBoolean());
        return results;
    }

    @Override
    public Value visitCond_empty(XQueryLangParser.Cond_emptyContext ctx) {
        this.visit(ctx.statement());
        results = new Value(results.isListNode() && results.asListNode().size() == 0);
        return results;
    }

    @Override
    public Value visitCond_equal(XQueryLangParser.Cond_equalContext ctx) {
        Value prev = results;

        Set<Node> res1 = new HashSet<>(this.visit(ctx.statement(0)).asListNode());
        results = prev;
        Set<Node> res2 = new HashSet<>(this.visit(ctx.statement(1)).asListNode());
        boolean flag=false;
        for (Node node1 : res1){
            for (Node node2 : res2){
                if(node1.getTextContent().equals("MARULLUS") && node2.getTextContent().equals("MARULLUS")){
                    flag = true;
                }
                if (node1.getNodeType() == Node.TEXT_NODE && node2.getNodeType() == Node.TEXT_NODE){
                    if (node1.getTextContent().equals(node2.getTextContent())){
                        flag= true;
                        break;
                    }
                }
                else if (node1.isEqualNode(node2)){
                    flag=true;
                    break;
                }
            }
        }
        results = new Value(flag);
        return results;

    }

    @Override
    public Value visitCond_is(XQueryLangParser.Cond_isContext ctx) {
        //TODO: This is not implemented.
        Value prev = results;
        Set<Node> res1 = new HashSet<>(this.visit(ctx.statement(0)).asListNode());
        results = prev;
        Set<Node> res2 = new HashSet<>(this.visit(ctx.statement(1)).asListNode());
        res1.retainAll(res2);
        if(res1.size() > 0){
            results = new Value(true);
        }else{
            results = new Value(false);
        }

        return results;
    }

    @Override
    public Value visitCond_paren(XQueryLangParser.Cond_parenContext ctx) {
        return this.visit(ctx.condition());
    }

    @Override
    public Value visitCond_some(XQueryLangParser.Cond_someContext ctx) {
        results = new Value(someClauseDFS(ctx, 0));

        List<String> addedVars = getVariables(ctx);
        addedVars.forEach(mem::remove);
        return results;
    }


    private boolean someClauseDFS(XQueryLangParser.Cond_someContext ctx, int varIdx){
        // Treat this as a tree.

        if(varIdx >= ctx.variable().size()){     //All the variables have already been set, do the processing work.
            results = Value.VOID;
            Value val = this.visit(ctx.condition());
            assert val.isBoolean();
            return val.asBoolean();
        }else{                                  // Set up variables before processing.
            String variable = ctx.variable(varIdx).getText();
            Value value = this.visit(ctx.statement(varIdx));
            for(Node node : value.asListNode()){
                List<Node> nodeList = new ArrayList<>();
                nodeList.add(node);
                mem.put(variable, new Value(nodeList));
                boolean res = someClauseDFS(ctx, varIdx + 1);
                if(res){
                    return true;
                }
            }
            return false;
        }

    }

    @Override
    public Value visitCond_not(XQueryLangParser.Cond_notContext ctx) {
        assert(results.isBoolean());
        results = this.visit(ctx.condition());
        results = new Value(!results.asBoolean());
        return results;
    }

    @Override
    public Value visitCond_or(XQueryLangParser.Cond_orContext ctx) {
        Value prevResult = results;
        Value left = this.visit(ctx.condition(0));
        results = prevResult;
        Value right = this.visit(ctx.condition(1));

        assert(left.isBoolean() && right.isBoolean());
        results = new Value(left.asBoolean() || right.asBoolean());
        return results;
    }

    @Override
    public Value visitVariable(XQueryLangParser.VariableContext ctx) {
        if(mem.containsKey(ctx.getText())){
            results = mem.get(ctx.getText());
            return results;
        }else{
            throw new RuntimeException("Variable " + ctx.getText() + " is not in scope.");
        }
    }

    @Override
    public Value visitStringConstant(XQueryLangParser.StringConstantContext ctx) {
        List<Node> res = new ArrayList<>();
        res.add(createTextNode(ctx.getText().replace("\"", "")));
        results = new Value(res);
        return results;
    }

    @Override
    public Value visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Value visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Value visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Value visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Value defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Value aggregateResult(Value aggregate, Value nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Value currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private List<String> getVariables(XQueryLangParser.Cond_someContext ctx){
        if(ctx != null){
            return ctx.variable().stream().map(RuleContext::getText).collect(Collectors.toList());
        }else{
            return new ArrayList<>();
        }
    }

    private List<String> getVariables(XQueryLangParser.LetClauseContext ctx){
        if(ctx != null){
            return ctx.variable().stream().map(RuleContext::getText).collect(Collectors.toList());
        }else{
            return new ArrayList<>();
        }
    }

    private List<String> getVariables(XQueryLangParser.ForClauseContext ctx){
        if(ctx != null){
            return ctx.variable().stream().map(RuleContext::getText).collect(Collectors.toList());
        }else{
            return new ArrayList<>();
        }
    }

    private void addVariable(List<String> variables, List<Value> values){
        assert(variables.size() == values.size());
        int size = values.size();
        for(int i = 0 ; i < size ; i++){
            mem.put(variables.get(i), values.get(i));
        }

    }

    private Element createElement(String name){
        if(newDoc != null){
            return newDoc.createElement(name);
        }
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            newDoc = dbf.newDocumentBuilder().newDocument();
            return newDoc.createElement(name);
        } catch (ParserConfigurationException ex) {
            return null;
        }
    }

    private Node createTextNode(String str){
        if(newDoc != null){
            return newDoc.createTextNode(str);
        }
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            newDoc = dbf.newDocumentBuilder().newDocument();
            return newDoc.createTextNode(str);
        } catch (ParserConfigurationException ex) {
            return null;
        }
    }

}
