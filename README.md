
# UCSD CSE232 Database System Implementation
An XQuery processor based on ANTLR 4.11 on Java. 

# Project Description:
======
Our class project is the construction of an XQuery processor. We consider a subset/modification of XML’s data model, XQuery, and XQuery’s type system as described in this note. The processor receives an XQuery, parses it into an abstract tree representation, optimizes it and finally executes the optimized plan.

*Milestone 1 (Naïve Evaluation) [due in week 7]: A straightforward query execution engine receives the simplified XQuery and an input XML file and evaluates the query using a recursive evaluation routine which, given an XQuery expression (path, concatenation, element creation, etc) and a list of input nodes, produces a list of output nodes. For the XQuery parser, we recommend the jjtree tool provided with the javacc (Java Compiler Compiler) software, available for download here. Provided with a grammar, jjtree generates a compiler which automatically constructs abstract syntax trees of  its input expressions.

*Milestone 2 (Efficient Evaluation): Implement a join operator as defined in Section 7 of this note. Implement an algorithm which detects the fact that the FOR and WHERE clause computation can be implemented using the join operator. You may assume that the input XQueries to be optimized are in the simplified "Core" syntax given in the note. No need to first normalize your queries to this form.

# Getting Started
======
There is a useful tutorial about how to play with ANTLR. 

Here is the link:  [If/else statements in ANTLR using listeners](http://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners)

* For ANTLR Plugin, if you use Intellij IDEA, you can download it from IDEA plugin repository. Press 'CMD' + ',' to open Setting page, and search for plugin, open that window and search for `ANTLR grammer plugin`. Then this is it. 

* Download antlr-complete-4.[version].jar from ANTLR official website, and put it into your project directory. 

* For auto generate ANTLR classes, use the following command:

`java -Xmx500M -cp "library/antlr-4.6-complete.jar:$CLASSPATH" org.antlr.v4.Tool src/XQueryLang.g4 -visitor`

* For testing ANTLR rules, right click the name of that rule, and select "Test Rule `RULE`", then the parse tree will be shown on the right of the ANTLR Preview tab. 


