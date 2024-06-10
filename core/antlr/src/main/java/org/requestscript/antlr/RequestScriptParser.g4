parser grammar RequestScriptParser;

options {
    tokenVocab = RequestScriptLexer;
}

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
