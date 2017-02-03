//(absolute path) ap → doc(fileName)/rp
//                      | doc(fileName)//rp
//(relative path) rp → tagName | ∗ | . | .. | text() | @attName
//                      | (rp) | rp1/rp2 | rp1//rp2 | rp[f] | rp1, rp2
//(path filter) f → rp | rp1 = rp2 | rp1 eq rp2 | rp1 == rp2 | rp1 is rp2
//                      | (f) | f1 and f2 | f1 or f2 | not f

//COMPILE:
//  java -Xmx500M -cp "library/antlr-4.6-complete.jar:$CLASSPATH" org.antlr.v4.Tool src/XQueryLang.g4 -visitor


//HINTS:
//   ***********************
//   Order of the lexers matters
//   Like: QUOTE : '"' goes before STRING : '"' ... '"', QUOTE will be matched prior to STRING rule.
//   StackOverflow:
//      http://stackoverflow.com/questions/29777778/antlr-4-5-mismatched-input-x-expecting-x
//   ***********************

/*

    Problem: A node is used in a different document than the one that created it.
    Solution: http://stackoverflow.com/questions/3184268/org-w3c-dom-domexception-wrong-document-err-a-node-is-used-in-a-different-docu
*/



grammar XQueryLang;





ap
 : DOC LPAREN fileName RPAREN LSLASH? LSLASH rp
 ;


rp
 : tagName                          #rp_tagName
 | STAR                             #rp_star
 | DOT                              #rp_dot
 | DOT DOT                          #rp_dotdot
 | TEXT LPAREN RPAREN               #rp_text
 | AT attName                       #rp_at
 | LPAREN rp RPAREN                 #rp_paren
 | rp (LSLASH)? LSLASH rp           #rp_slash
 | rp LBRACKET filter RBRACKET      #rp_filter
 | rp COMMA rp                      #rp_comma
 ;

filter
 : rp                               #filter_rp
 | rp op=(EQUAL|EQ) rp              #filter_eq
 | rp op=(DEQUAL|IS) rp             #filter_is
 | LPAREN filter RPAREN             #filter_paren
 | filter op=(AND|OR) filter        #filter_andOr
 | NOT filter                       #filter_not
 ;


fileName
 : PATHSTRING
 ;

tagName
 : NAMESTRING
 ;

attName
 : NAMESTRING
 ;

//XQ → Var | StringConstant | ap
//    | (XQ1) | XQ1, XQ2 | XQ1/rp| XQ1//rp
//    | <tagname>{XQ1}</tagname>
//    | forClause letClause whereClause returnClause
//    | letClause XQ1
//forClause → for Var1 in XQ1, Var2 in XQ2, . . . , Varn in XQn
//letClause →  | let Varn+1 := XQn+1, . . . , Varn+k := XQn+k
//whereClause →  | where Cond
//returnClause → return XQ1
//Cond → XQ1 = XQ2 | XQ1 eq XQ2
//    | XQ1 == XQ2 | XQ1 is XQ2
//    | empty(XQ1)
//    | some Var1 in XQ1, . . . , Varn in XQn satisfies Cond
//    | (Cond1) | Cond1 and Cond2 | Cond1 or Cond2 | not Cond1


statement
 : variable                                                         #stat_variable
 | stringConstant                                                   #stat_constant
 | ap                                                               #stat_ap
 | LESS tagName GREATER LBRACE statement RBRACE LESS LSLASH tagName GREATER       #stat_tag
 | LPAREN statement RPAREN                                          #stat_paren
 | statement COMMA statement                                        #stat_comma
 | statement LSLASH LSLASH? rp                                      #stat_slash
 | forStatement                                                     #stat_for
 | letStatement                                                     #stat_let
 ;

forStatement
 : forClause letClause? whereClause? returnClause
 ;

letStatement
 : letClause statement
 ;

forClause
 : FOR (variable IN statement COMMA)* variable IN statement
 ;

returnClause
 : RETURN statement
 ;

letClause
 : LET (variable ASSIGN statement COMMA)* variable ASSIGN statement
 ;

whereClause
 : WHERE condition
 ;

condition
 : statement op=(EQUAL|EQ) statement                #cond_equal
 | statement op=(DEQUAL|IS) statement               #cond_is
 | EMPTY? LPAREN statement RPAREN                   #cond_paren
 | SOME (variable IN statement COMMA)* variable
        IN statement SATISFIES condition            #cond_some
 | condition AND condition                          #cond_and
 | condition OR condition                           #cond_or
 | NOT condition                                    #cond_not
 ;


variable
 : '$' NAMESTRING
 ;

stringConstant
 : STRING
 ;

FOR
 : 'for'
 ;

LET
 : 'let'
 ;

IN
 : 'in'
 ;

RETURN
 : 'return'
 ;


IS
 : 'is'
 ;

EMPTY
 : 'empty'
 ;

SOME
 : 'some'
 ;

SATISFIES
 : 'satisfies'
 ;

EQ
 : 'eq'
 ;

WHERE
 : 'where'
 ;

DOC
 : 'doc'
 ;

TEXT
 : 'text'
 ;

AND
 : 'and'
 ;

OR
 : 'or'
 ;

NOT
 : 'not'
 ;

NAMESTRING
 : [A-Za-z0-9_]+
 ;

VARSTRING
 : ([A-Za-z]|[_])[A-Za-z0-9]*
 ;

LPAREN
 : '('
 ;

RPAREN
 : ')'
 ;

LBRACKET
 : '['
 ;

RBRACKET
 : ']'
 ;

LBRACE
 : '{'
 ;

RBRACE
 : '}'
 ;

LESS
 : '<'
 ;

GREATER
 : '>'
 ;

DEQUAL
 : '=='
 ;

ASSIGN
 : ':='
 ;

EQUAL
 : '='
 ;


AT
 : '@'
 ;

DOT
 : '.'
 ;

COMMA
 : ','
 ;

STAR
 : '*'
 ;

LSLASH
 : '/'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

PATHSTRING
 : '"' [A-Za-z0-9./_]* '"'
 ;


STRING
 : '"' (~["\r\n] | '""')* '"'
 ;