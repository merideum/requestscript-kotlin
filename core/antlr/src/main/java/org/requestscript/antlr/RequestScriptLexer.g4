lexer grammar RequestScriptLexer;

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
