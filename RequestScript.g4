grammar RequestScript;

parse
    : (WS* scriptDefinition WS*)*
    ;

scriptDefinition
    : scriptType IDENTIFIER scriptParameters? BRACE_L (statement)* BRACE_R
    ;

scriptType
    : REQUEST
    | CONTRACT
    ;

scriptParameters
    : PAREN_L scriptParameter (COMMA scriptParameter)? PAREN_R
    ;

 scriptParameter
    : IDENTIFIER typeDeclaration
    ;

statement
    : importResourceStatement
    | returnStatement
    ;

// import test: Resource
importResourceStatement
    : IMPORT IDENTIFIER COLON resourcePathIdentifier IDENTIFIER
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

typeDeclaration
    : COLON type
    ;

type
    : INT
    | STRING
    ;

// Lexer

// Keywords
IMPORT: 'import';
RETURN: 'return';
REQUEST: 'request';
CONTRACT: 'contract';
INT: 'int';
STRING: 'string';

COLON: ':';
COMMA: ',';
DOT: '.';
PAREN_L: '(';
PAREN_R: ')';
BRACE_L: '{';
BRACE_R: '}';

IDENTIFIER: (LETTER | '_')(LETTER | '_' | DIGIT)*;
CAPITAL_LETTER: [A-Z];
LOWERCASE_LETTER: [a-z];
LETTER: [a-zA-Z];
INTEGER: [1-9] DIGIT* | '0';
WS: [ \t\r\n]+ -> skip;

fragment DIGIT: [0-9];
