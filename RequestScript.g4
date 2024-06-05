grammar RequestScript;

parse
    : (WS* statement WS*)*
    ;

statement
    : importResourceStatement
    | returnStatement
    ;

// import test: Resource
importResourceStatement
    : IMPORT IDENTIFIER COLON resourcePathIdentifier RESOURCE_IDENTIFIER
    ;

returnStatement
    : RETURN expression
    ;

expression
    : expression functionCall #functionCallExpression
    | INTEGER #integerExpression
    | IDENTIFIER #identifier
    ;

functionCall
    : DOT IDENTIFIER PAREN_L functionCallParams? PAREN_R
    ;

functionCallParams
    : functionCallParam (COMMA WS* functionCallParam)*?
    ;

functionCallParam
    : IDENTIFIER COLON expression
    ;

resourcePathIdentifier
    : IDENTIFIER (DOT IDENTIFIER)* DOT
    ;

// Lexer

// Keywords
IMPORT: 'import';
RETURN: 'return';

COLON: ':';
COMMA: ',';
DOT: '.';
PAREN_L: '(';
PAREN_R: ')';

RESOURCE_IDENTIFIER: (CAPITAL_LETTER)(LETTER)*;
IDENTIFIER: (LETTER | '_')(LETTER | '_' | DIGIT)*;
CAPITAL_LETTER: [A-Z];
LOWERCASE_LETTER: [a-z];
LETTER: [a-zA-Z];
INTEGER: [1-9] DIGIT* | '0';
WS: [ \t\r\n]+ -> skip;

fragment DIGIT: [0-9];
