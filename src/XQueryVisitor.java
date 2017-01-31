
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
    private Document doc;
    @Override
    public Value visitAp(XQueryLangParser.ApContext ctx) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        String fileName = ctx.fileName().getText().replace('\"', ' ').trim();
        try {
            //Using factory get an instance of document builder
            DocumentBuilder db = dbf.newDocumentBuilder();

            //parse using builder to get DOM representation of the XML file
            List<Element> next = new ArrayList<>();
            doc = db.parse(fileName);
            doc.getDocumentElement().normalize();

            //Visit next node
            if(ctx.LSLASH().size() == 1){ //Immediate children
                // Only visit immediate children
                next.add(doc.getDocumentElement());
            }else{
                NodeList nodes = doc.getElementsByTagName("*");
                for(int i = 0 ; i < nodes.getLength() ; i++){
                    if(nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
                        next.add((Element) nodes.item(i));
                    }
                }
            }
            //TODO: What if we have doc("...")/text()?

//            if(ctx.rp().getText().equals("text()")){
//                next.clear();
//                next.add(doc);
//            }

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
        Set<Element> nextSet = new HashSet<>();

        for(Element element : prev.asListElem()){
            results = prev;
            List<Element> nextList = new ArrayList<>();
            nextList.add((Element) element.getParentNode().getParentNode());
            nextSet.addAll(nextList);
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
        Set<Element> nextSet = new HashSet<>();

        for(Element element : prev.asListElem()){
            results = prev;
            List<Element> nextList = new ArrayList<>();
            nextList.add((Element) element.getParentNode());
            nextSet.addAll(nextList);
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

        Set<Element> resSet = new HashSet<>();

        resSet.addAll(rp1.asListElem());
        resSet.addAll(rp2.asListElem());
        List<Element> res = new ArrayList<>(resSet);
        results = new Value(res);
        return results;
    }

    @Override
    public Value visitRp_text(XQueryLangParser.Rp_textContext ctx) {
        List<Element> prev = results.asListElem();
        String res = "";
        for(Element element : prev){
            res += element.getTextContent();
        }
        results = new Value(res);
        return results;
    }

    @Override
    public Value visitRp_tagName(XQueryLangParser.Rp_tagNameContext ctx) {
        List<Element> prev = results.asListElem();
        List<Element> next = new ArrayList<>();
        for(Element element : prev){
            if(element.getTagName().equals(ctx.getText())){
                next.add(element);
            }
        }
        results = new Value(next);
        return results;
    }

    @Override
    public Value visitRp_filter(XQueryLangParser.Rp_filterContext ctx) {
        assert results.asListElem().size() == new HashSet<>(results.asListElem()).size();

        this.visit(ctx.rp());
        List<Element> prev = results.asListElem();
        List<Element> next = new ArrayList<>();
        for(Element element : prev){
            List<Element> prevVal = new ArrayList<>();
            prevVal.add(element);
            List<Element> newVal = new ArrayList<>();
            getChildren(prevVal, newVal, 1);
            results = new Value(newVal);
            Value ret = this.visit(ctx.filter());
            assert ret.isBoolean();
            if(ret.asBoolean()){
                next.add(element);
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
        List<Element> prev = results.asListElem();
        List<Element> next = new ArrayList<>();

        //Get the name of the attribute
        String attrName = ctx.getText();

        //For each node in previous result, get the attribute value.
        //TODO: Should we return result as pure string, or a new element node?
        for(Element element : prev){
            String attrContent = element.getAttribute(ctx.getText());
            Element attrElem = createElement(attrName);
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
        List<Element> prev = results.asListElem();
        List<Element> next = new ArrayList<>();
        getChildren(prev, next, ctx.LSLASH().size());
        if(ctx.rp(1).getText().equals("text()")){
            next = prev;
        }
        results = new Value(next);
        this.visit(ctx.rp(1));
        return results;
    }

    private void getChildren(List<Element> prev, List<Element> next, int slashes){
        Set<Element> nextSet = new HashSet<>();
        for(Element element : prev){
            if(slashes == 1){ //Immediate children
                // Only visit immediate children
                Node childNode = element.getFirstChild();
                while( childNode !=null ){
                    if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNode;
                        nextSet.add(childElement);
                    }
                    childNode = childNode.getNextSibling();
                }
            }else{
                NodeList nodes = element.getElementsByTagName("*");
                for(int i = 0 ; i < nodes.getLength() ; i++){
                    if(nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
                        nextSet.add((Element) nodes.item(i));
                    }
                }
            }
        }
        next.addAll(nextSet);
    }



    @Override
    public Value visitFilter_rp(XQueryLangParser.Filter_rpContext ctx) {
        this.visit(ctx.rp());
        results = new Value(results.asListElem().size() != 0);
        return results;
    }

    @Override
    public Value visitFilter_eq(XQueryLangParser.Filter_eqContext ctx) {
        Value prev = results;
        Set<Element> res1 = new HashSet<>(this.visit(ctx.rp(0)).asListElem());
        results = prev;
        Set<Element> res2 = new HashSet<>(this.visit(ctx.rp(1)).asListElem());
        res1.retainAll(res2);
        results = new Value(res1.size() > 0);
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
        Set<Element> res1 = new HashSet<>(this.visit(ctx.rp(0)).asListElem());
        results = prev;
        Set<Element> res2 = new HashSet<>(this.visit(ctx.rp(1)).asListElem());
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
        Element newElement = createElement(tagName);
        if(newVal.isListElem()){
            List<Element> childs = newVal.asListElem();
            for(Element element : childs){
                assert newElement != null;
                newElement.appendChild(element);
            }
            childs.clear();
            childs.add(newElement);
            results = new Value(childs);
        }else if(newVal.isString()){
            assert newElement != null;
            newElement.setTextContent(newVal.asString());
            List<Element> res = new ArrayList<>();
            res.add(newElement);
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
        List<Element> res = new ArrayList<>();
        res.addAll(res1.asListElem());
        res.addAll(res2.asListElem());
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

        List<Element> prev = results.asListElem();
        List<Element> next = new ArrayList<>();

        getChildren(prev, next, ctx.LSLASH().size());
        if(ctx.rp().getText().equals("text()")){
            next = prev;
        }
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
        List<Element> finalResult = new ArrayList<>();
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


    private void forStatementDFS(XQueryLangParser.ForClauseContext ctx, int varIdx, List<Element> finalResult){
        // TODO: Perhaps we need to perform a DFS on the values of each variables.
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
            finalResult.addAll(returnResult.asListElem());
        }else{                                  // Set up variables before processing.
            String variable = ctx.variable(varIdx).getText();
            Value value = this.visit(ctx.statement(varIdx));
            for(Element element : value.asListElem()){
                List<Element> elemList = new ArrayList<>();
                elemList.add(element);
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

        results = new Value(left.compareValue(right));
        return results;
    }

    @Override
    public Value visitCond_is(XQueryLangParser.Cond_isContext ctx) {
        return super.visitCond_is(ctx);
    }

    @Override
    public Value visitCond_paren(XQueryLangParser.Cond_parenContext ctx) {
        return this.visit(ctx.statement());
    }

    @Override
    public Value visitCond_some(XQueryLangParser.Cond_someContext ctx) {
        //TODO: THIS IS NOT IMPLEMENTED.
        List<String> addedVars = getVariables(ctx);
        addedVars.forEach(mem::remove);
        results = new Value(true);
        return results;
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
        if(doc != null){
            return doc.createElement(name);
        }
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            Document doc = dbf.newDocumentBuilder().newDocument();
            return doc.createElement(name);
        } catch (ParserConfigurationException ex) {
            return null;
        }
    }
}
