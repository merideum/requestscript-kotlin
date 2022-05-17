grammar Merit;

parse: block EOF;

block: (statement)*;

statement: variableAssignment | outputAssignment;

outputAssignment: OUTPUT WS* IDENTIFIER WS* assignment?;

variableAssignment:
	variableModifier? WS* IDENTIFIER WS* assignment?;

assignment: (ASSIGN WS* expression);

expression: INTEGER # integerExpression;

variableModifier: CONST | VAR;

ASSIGN: '=';

OUTPUT: 'output';

CONST: 'const';

VAR: 'var';

IDENTIFIER: (LETTER | '_') (LETTER | '_' | DIGIT)*;

LETTER: [a-zA-Z];

INTEGER: [1-9] DIGIT* | '0';

fragment DIGIT: [0-9];

WS: [ \t\r\n]+ -> skip;
