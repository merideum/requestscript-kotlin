// Generated from java-escape by ANTLR 4.11.1
package org.merideum.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MerideumParser}.
 */
public interface MerideumParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MerideumParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MerideumParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MerideumParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#scriptDefinition}.
	 * @param ctx the parse tree
	 */
	void enterScriptDefinition(MerideumParser.ScriptDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#scriptDefinition}.
	 * @param ctx the parse tree
	 */
	void exitScriptDefinition(MerideumParser.ScriptDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#scriptType}.
	 * @param ctx the parse tree
	 */
	void enterScriptType(MerideumParser.ScriptTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#scriptType}.
	 * @param ctx the parse tree
	 */
	void exitScriptType(MerideumParser.ScriptTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#scriptParameters}.
	 * @param ctx the parse tree
	 */
	void enterScriptParameters(MerideumParser.ScriptParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#scriptParameters}.
	 * @param ctx the parse tree
	 */
	void exitScriptParameters(MerideumParser.ScriptParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#scriptParameter}.
	 * @param ctx the parse tree
	 */
	void enterScriptParameter(MerideumParser.ScriptParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#scriptParameter}.
	 * @param ctx the parse tree
	 */
	void exitScriptParameter(MerideumParser.ScriptParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MerideumParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MerideumParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#importResource}.
	 * @param ctx the parse tree
	 */
	void enterImportResource(MerideumParser.ImportResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#importResource}.
	 * @param ctx the parse tree
	 */
	void exitImportResource(MerideumParser.ImportResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MerideumParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MerideumParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MerideumParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MerideumParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MerideumParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MerideumParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAssignment(MerideumParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAssignment(MerideumParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#variableReassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableReassignment(MerideumParser.VariableReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#variableReassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableReassignment(MerideumParser.VariableReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldAssignment(MerideumParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldAssignment(MerideumParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MerideumParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MerideumParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(MerideumParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(MerideumParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(MerideumParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(MerideumParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectFieldReferenceExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldReferenceExpression(MerideumParser.ObjectFieldReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectFieldReferenceExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldReferenceExpression(MerideumParser.ObjectFieldReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterElementExpression(MerideumParser.ElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitElementExpression(MerideumParser.ElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(MerideumParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(MerideumParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(MerideumParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(MerideumParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifierExpression(MerideumParser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifierExpression(MerideumParser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(MerideumParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(MerideumParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MerideumParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MerideumParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(MerideumParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(MerideumParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(MerideumParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(MerideumParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterResourcePathIdentifier(MerideumParser.ResourcePathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitResourcePathIdentifier(MerideumParser.ResourcePathIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(MerideumParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(MerideumParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MerideumParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MerideumParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MerideumParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MerideumParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(MerideumParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(MerideumParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(MerideumParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(MerideumParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectFields}.
	 * @param ctx the parse tree
	 */
	void enterObjectFields(MerideumParser.ObjectFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectFields}.
	 * @param ctx the parse tree
	 */
	void exitObjectFields(MerideumParser.ObjectFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectField}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(MerideumParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectField}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(MerideumParser.ObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#listElementAssignments}.
	 * @param ctx the parse tree
	 */
	void enterListElementAssignments(MerideumParser.ListElementAssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#listElementAssignments}.
	 * @param ctx the parse tree
	 */
	void exitListElementAssignments(MerideumParser.ListElementAssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#listElementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListElementAssignment(MerideumParser.ListElementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#listElementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListElementAssignment(MerideumParser.ListElementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code embeddedExpression}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterEmbeddedExpression(MerideumParser.EmbeddedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code embeddedExpression}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitEmbeddedExpression(MerideumParser.EmbeddedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterText(MerideumParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitText(MerideumParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escapeSequence}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterEscapeSequence(MerideumParser.EscapeSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escapeSequence}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitEscapeSequence(MerideumParser.EscapeSequenceContext ctx);
}