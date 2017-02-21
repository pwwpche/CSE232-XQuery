
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


    private final Map<String, Value> mem = new HashMap<>();
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
        for (Node node1:res1){
            for (Node node2:res2){
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
        Value newVal = this.visit(ctx.statement());
        Node newNode = createElement(tagName);

        if(newVal.isListElem()){
            List<Node> childs = newVal.asListNode();
            for(Node node : childs){
                assert newNode != null;
                Node importedNode = newDoc.importNode(node, true);
                newNode.appendChild(importedNode);
            }
            childs.clear();
            childs.add(newNode);
            results = new Value(childs);
        }else if(newVal.isString()){
            assert newNode != null;
            newNode.setTextContent(newVal.asString());
            List<Node> res = new ArrayList<>();
            res.add(newNode);
            results = new Value(res);
        }

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
    public Value visitStat_paren(XQueryLangParser.Stat_parenContext ctx) {
        return this.visit(ctx.statement());
    }

    @Override
    public Value visitStat_constant(XQueryLangParser.Stat_constantContext ctx) {
        results = new Value(ctx.getText().replace("\"", ""));
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
        List<String> addedVars = this.getVariables(ctx.forClause());
        addedVars.addAll(this.getVariables(ctx.letClause()));
        List<Node> finalResult = new ArrayList<>();
        this.forStatementDFS(ctx.forClause(), 0, finalResult);

        results = new Value(finalResult);
        addedVars.forEach(mem::remove);
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
        Value right = this.visit(ctx.condition(0));

        assert(left.isBoolean() && right.isBoolean());
        results = new Value(left.asBoolean() && right.asBoolean());
        return results;
    }

    @Override
    public Value visitCond_equal(XQueryLangParser.Cond_equalContext ctx) {
        Value prevResult = results;
        Value left = this.visit(ctx.statement(0));
        results = prevResult;
        Value right = this.visit(ctx.statement(1));

        //Special handler for string comparision
        String leftStr, rightStr;
        if(left.isString() || right.isString()){
            if(left.isListNode()){
                if(left.asListNode().size() == 1
                        && left.asListNode().get(0).getNodeType() == Node.TEXT_NODE){
                    leftStr = left.asListNode().get(0).getTextContent();
                }else{
                    results = new Value(false);
                    return results;
                }
            }else{
                leftStr = left.asString();
            }

            if(right.isListNode()){
                if(right.asListNode().size() != 1
                        || right.asListNode().get(0).getNodeType() != Node.TEXT_NODE){
                    results = new Value(false);
                    return results;
                }else{
                    rightStr = right.asListNode().get(0).getTextContent();
                }
            }else{
                rightStr = right.asString();
            }
            results = new Value(leftStr.equals(rightStr));
            return results;

        }
        results = new Value(left.compareValue(right));
        return results;
    }

    @Override
    public Value visitCond_is(XQueryLangParser.Cond_isContext ctx) {
        //TODO: This is not implemented.
        return super.visitCond_is(ctx);
    }

    @Override
    public Value visitCond_paren(XQueryLangParser.Cond_parenContext ctx) {
        this.visit(ctx.statement());
        results = new Value(results.isListNode() && results.asListNode().size() == 0);
        return results;
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
        Value right = this.visit(ctx.condition(0));

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
        results = new Value(ctx.getText().replace("\"", ""));
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
            if(mem.containsKey(variables.get(i))){
                throw new RuntimeException("Variable " + variables.get(i) + " already in scope.");
            }
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
}
