package com.example.mu; /**
 * Created by liuche on 1/12/17.
 */
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        MuLexer lexer = new MuLexer(new ANTLRFileStream("/Users/liuche/IdeaProjects/XQuery/src/test.mu"));
        MuParser parser = new MuParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}