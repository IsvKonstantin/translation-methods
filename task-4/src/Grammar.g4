grammar Grammar;

// -------------------------------------------------- PARSER ---------------------------------------------------------//

newGrammar
    :   grammarName commonAttributes? grammarRules
    ;

grammarName
    :   GRAMMAR TERM_ID SEMICOLON
    ;

commonAttributes
    :   COMMON L_BRACK (commonAttribute)+ R_BRACK
    ;

grammarRules
    :   grammarRule+
    ;

grammarRule
    :   grammarLexerRule
    |   grammarParserRule
    ;

grammarLexerRule
    :   TERM_ID COLON REGEX CODE? SKIP_R? SEMICOLON
    ;

grammarParserRule
    :   NTERM_ID attributeDeclaration? COLON parserSubRule SEMICOLON
    ;

parserSubRule
    :   parserRuleSection+ CODE?
    |   parserSubRule OR parserSubRule
    ;

parserRuleSection
    :   TERM_ID
    |   NTERM_ID ATTRIBUTE?
    ;

attributeDeclaration
    :   L_BRACK NTERM_ID NTERM_ID R_BRACK
    ;

commonAttribute
    :   NTERM_ID NTERM_ID SEMICOLON
    ;

// -------------------------------------------------- LEXER ----------------------------------------------------------//

GRAMMAR : 'grammar';
COMMON  : 'common';

L_BRACE : '{';
R_BRACE : '}';
L_PARAN : '(';
R_PARAN : ')';
L_BRACK : '[';
R_BRACK : ']';

COMMA     : ',';
COLON     : ':';
SEMICOLON : ';';
DOT       : '.';
OR        : '|';

SKIP_R     : '-> skip';
TERM_ID    : [A-Z][a-zA-Z0-9_]*;
NTERM_ID   : [a-z][a-zA-Z0-9_]*;
ATTRIBUTE  : '('.*?')';
CODE       : '{'.*?'}';
REGEX      : '"'.*?'"';

WS : [ \t\r\n]+ -> skip;
