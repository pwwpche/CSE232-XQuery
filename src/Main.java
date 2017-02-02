import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

/**
 * Created by liuche on 1/19/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        XQueryLangLexer lexer = new XQueryLangLexer(new ANTLRFileStream("/Users/xinyangli/IdeaProjects/CSE232XQuery/xqueries.txt"));
        XQueryLangParser parser = new XQueryLangParser(new CommonTokenStream(lexer));
        XQueryLangParser.StatementContext statement = parser.statement();
        XQueryVisitor visitor = new XQueryVisitor();
        Value results = visitor.visit(statement);

        for(Element element : results.asListElem()){
            Document document = element.getOwnerDocument();
            DOMImplementationLS domImplLS = (DOMImplementationLS) document
                    .getImplementation();
            LSSerializer serializer = domImplLS.createLSSerializer();
            String str = serializer.writeToString(element);
            System.out.println(str);
        }
        return ;
    }
}