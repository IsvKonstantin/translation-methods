grammar JavaClass;

// -------------------------------------------------- PARSER ---------------------------------------------------------//

javaClass
    :   accessModifier? nonAccessModifiers? CLASS IDENTIFIER (EXTENDS type)? (IMPLEMENTS classImpls)? L_BRACE classBody R_BRACE
    ;

classImpls
    :   type (COMMA type)*
    ;

classBody
    :   (field | constructor | method)*
    ;

field
    :   accessModifier? nonAccessModifiers? type (L_BRACK R_BRACK)* IDENTIFIER (assignmentOp assignmentValue)? SEMICOLON
    ;

constructor
    :   accessModifier? IDENTIFIER L_PARAN arguments R_PARAN L_BRACE constructorBody R_BRACE
    ;

method
    :   accessModifier? nonAccessModifiers? type IDENTIFIER L_PARAN arguments R_PARAN L_BRACE methodBody R_BRACE
    ;

methodBody
    :   codeBlock*
    ;

codeBlock
    :   forLoop
    |   whileLoop
    |   doWhileLoop
    |   ifElseStatement
    |   statement
    ;

constructorBody
    :   (SUPER L_PARAN methodParams R_PARAN SEMICOLON)? methodBody
    ;

argument
    :   FINAL? type IDENTIFIER
    ;

arguments
    :   (argument (COMMA argument)*)?
    ;

methodParams
    :   (expression (COMMA expression)*)?
    ;

methodCall
    :   IDENTIFIER L_PARAN methodParams R_PARAN
    |   IDENTIFIER DOT methodCall
    ;

arrayAccess
    :   IDENTIFIER (L_BRACK expression R_BRACK)+
    ;

assignmentValue
    :   (expression | NEW type ((L_BRACK expression R_BRACK)* | L_PARAN methodParams R_PARAN))
    ;

assignment
    :   IDENTIFIER assignmentOp assignmentValue
    |   arrayAccess assignmentOp assignmentValue
    |   FINAL? type (L_BRACK R_BRACK)* IDENTIFIER (assignmentOp assignmentValue)?
    ;

ifElseStatement
    :   IF L_PARAN expression R_PARAN L_BRACE methodBody R_BRACE (ELSE L_BRACE methodBody R_BRACE)?
    ;

whileLoop
    :   WHILE L_PARAN expression R_PARAN L_BRACE methodBody R_BRACE
    ;

forLoop
    :   FOR L_PARAN assignment SEMICOLON expression SEMICOLON assignment R_PARAN L_BRACE methodBody R_BRACE
    ;

doWhileLoop
    :   DO L_BRACE methodBody R_BRACE WHILE L_PARAN expression R_PARAN SEMICOLON
    ;

statement
    :   (assignment | methodCall | jumpStatement) SEMICOLON
    ;

jumpStatement
    :   BREAK
    |   CONTINUE
    |   RETURN expression
    ;

expression
    :   expression BINARY_OP expression
    |   L_PARAN expression R_PARAN
    |   UNARY_OP expression
    |   bool
    |   methodCall
    |   arrayAccess
    |   IDENTIFIER
    |   LITERAL
    ;

bool
    :   TRUE
    |   FALSE
    ;

type
    :   IDENTIFIER (DOT IDENTIFIER)* (L_BRACK R_BRACK)*
    |   PRIMITIVE (L_BRACK R_BRACK)*
    ;

accessModifier
    :   PUBLIC
    |   PROTECTED
    |   PRIVATE
    ;

nonAccessModifiers
    :   (FINAL | STATIC | ABSTRACT)+
    ;

assignmentOp
    :   ASSIGN
    |   ASSIGN_ADD
    |   ASSIGN_DIV
    |   ASSIGN_MUL
    |   ASSIGN_SUB
    ;

// -------------------------------------------------- LEXER ----------------------------------------------------------//

PUBLIC    : 'public';
PRIVATE   : 'private';
PROTECTED : 'protected';

CLASS      : 'class';
SUPER      : 'super';
EXTENDS    : 'extends';
IMPLEMENTS : 'implements';
STATIC     : 'static';
FINAL      : 'final';
ABSTRACT   : 'abstract';
NEW        : 'new';

L_BRACE: '{';
R_BRACE: '}';
L_PARAN: '(';
R_PARAN: ')';
L_BRACK: '[';
R_BRACK: ']';

COMMA     : ',';
SEMICOLON : ';';
DOT       : '.';

IF       : 'if';
ELSE     : 'else';
FOR      : 'for';
DO       : 'do';
WHILE    : 'while';
BREAK    : 'break';
CONTINUE : 'continue';
RETURN   : 'return';

TRUE      : 'true';
FALSE     : 'false';
PRIMITIVE : 'char' | 'byte' | 'int' | 'short' | 'long' | 'float' | 'double' | 'boolean';

LITERAL    : [+-]?([0-9]*[.])?[0-9]+ | '"'.*?'"' | 'null';
IDENTIFIER : [a-zA-Z] ([a-zA-Z] | [0-9_])*;

ASSIGN     : '=';
ASSIGN_ADD : '+=';
ASSIGN_SUB : '-=';
ASSIGN_MUL : '*=';
ASSIGN_DIV : '/=';
UNARY_OP   : '!' | '++' | '--';
BINARY_OP  : '+' | '-' | '*' | '/' | '&&' | '||' | '^' | '&' | '|' | '==' | '!=' | '<' | '>' | '<=' | '>=' | '%';

WS : [ \t\r\n]+ -> skip;
