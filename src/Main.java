import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

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
        XQueryLangLexer lexer = new XQueryLangLexer(new ANTLRFileStream("/Users/liuche/IdeaProjects/XQuery/xqueries.txt"));
        XQueryLangParser parser = new XQueryLangParser(new CommonTokenStream(lexer));
        XQueryLangParser.StatementContext statement = parser.statement();
        XQueryVisitor visitor = new XQueryVisitor();
        Value results = visitor.visit(statement);
/*

            OutputFormat format = new OutputFormat(dom);
			format.setIndenting(true);

			//to generate output to console use this serializer
			//XMLSerializer serializer = new XMLSerializer(System.out, format);


			//to generate a file output use fileoutputstream instead of system.out
			XMLSerializer serializer = new XMLSerializer(
			new FileOutputStream(new File("output.xml")), format);

			serializer.serialize(dom);

 */
        Document doc = null;
        for(Element element : results.asListElem()){
            if(doc == null){
                doc = element.getOwnerDocument();
            }
            doc.appendChild(element);
        }

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