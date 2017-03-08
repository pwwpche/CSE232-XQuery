import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by liuche on 1/19/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        XQueryLangLexer lexer = new XQueryLangLexer(new ANTLRFileStream("/Users/liuche/IdeaProjects/XQuery/playQuery.txt"));
        XQueryLangParser parser = new XQueryLangParser(new CommonTokenStream(lexer));
        XQueryLangParser.StatementContext statement = parser.statement();


//        XQueryRewriter rewriter = new XQueryRewriter();
//        rewriter.construct(statement);
//        System.out.println(rewriter.output());

        XQueryVisitor visitor = new XQueryVisitor();
        Value results = visitor.visit(statement);


        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc;
        try {
            doc = dbf.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            return ;
        }
        Element ele = doc.createElement("ele");
        for(Node element : results.asListNode()){
            Node importedNode = doc.importNode(element, true);
            ele.appendChild(importedNode);
        }
        doc.appendChild(ele);
        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("/Users/liuche/IdeaProjects/XQuery/xqueries.xml"));

        transformer.transform(source, result);

        System.out.println("File saved!");
        return ;
    }
}