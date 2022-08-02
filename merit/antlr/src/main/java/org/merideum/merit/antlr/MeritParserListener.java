// Generated from MeritParser.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeritParser}.
 */
public interface MeritParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MeritParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MeritParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MeritParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#scriptDefinition}.
	 * @param ctx the parse tree
	 */
	void enterScriptDefinition(MeritParser.ScriptDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#scriptDefinition}.
	 * @param ctx the parse tree
	 */
	void exitScriptDefinition(MeritParser.ScriptDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#scriptType}.
	 * @param ctx the parse tree
	 */
	void enterScriptType(MeritParser.ScriptTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#scriptType}.
	 * @param ctx the parse tree
	 */
	void exitScriptType(MeritParser.ScriptTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#scriptParameterBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptParameterBlock(MeritParser.ScriptParameterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#scriptParameterBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptParameterBlock(MeritParser.ScriptParameterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#scriptParameters}.
	 * @param ctx the parse tree
	 */
	void enterScriptParameters(MeritParser.ScriptParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#scriptParameters}.
	 * @param ctx the parse tree
	 */
	void exitScriptParameters(MeritParser.ScriptParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MeritParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MeritParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#importResource}.
	 * @param ctx the parse tree
	 */
	void enterImportResource(MeritParser.ImportResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#importResource}.
	 * @param ctx the parse tree
	 */
	void exitImportResource(MeritParser.ImportResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MeritParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MeritParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MeritParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MeritParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MeritParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MeritParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAssignment(MeritParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAssignment(MeritParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#variableReassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableReassignment(MeritParser.VariableReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#variableReassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableReassignment(MeritParser.VariableReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldAssignment(MeritParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldAssignment(MeritParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#elementIndexAssignment}.
	 * @param ctx the parse tree
	 */
	void enterElementIndexAssignment(MeritParser.ElementIndexAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#elementIndexAssignment}.
	 * @param ctx the parse tree
	 */
	void exitElementIndexAssignment(MeritParser.ElementIndexAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MeritParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MeritParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(MeritParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(MeritParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(MeritParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(MeritParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectFieldReferenceExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldReferenceExpression(MeritParser.ObjectFieldReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectFieldReferenceExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldReferenceExpression(MeritParser.ObjectFieldReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementIndexExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterElementIndexExpression(MeritParser.ElementIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementIndexExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitElementIndexExpression(MeritParser.ElementIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(MeritParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(MeritParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(MeritParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(MeritParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifierExpression(MeritParser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifierExpression(MeritParser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(MeritParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(MeritParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MeritParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MeritParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(MeritParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(MeritParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(MeritParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(MeritParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterResourcePathIdentifier(MeritParser.ResourcePathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitResourcePathIdentifier(MeritParser.ResourcePathIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(MeritParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(MeritParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MeritParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MeritParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MeritParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MeritParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(MeritParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(MeritParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(MeritParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(MeritParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#objectFields}.
	 * @param ctx the parse tree
	 */
	void enterObjectFields(MeritParser.ObjectFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#objectFields}.
	 * @param ctx the parse tree
	 */
	void exitObjectFields(MeritParser.ObjectFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#objectField}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(MeritParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#objectField}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(MeritParser.ObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#listElementAssignments}.
	 * @param ctx the parse tree
	 */
	void enterListElementAssignments(MeritParser.ListElementAssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#listElementAssignments}.
	 * @param ctx the parse tree
	 */
	void exitListElementAssignments(MeritParser.ListElementAssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#listElementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterListElementAssignment(MeritParser.ListElementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#listElementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitListElementAssignment(MeritParser.ListElementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeritParser#elementIndex}.
	 * @param ctx the parse tree
	 */
	void enterElementIndex(MeritParser.ElementIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#elementIndex}.
	 * @param ctx the parse tree
	 */
	void exitElementIndex(MeritParser.ElementIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code embeddedExpression}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterEmbeddedExpression(MeritParser.EmbeddedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code embeddedExpression}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitEmbeddedExpression(MeritParser.EmbeddedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterText(MeritParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitText(MeritParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escapeSequence}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterEscapeSequence(MeritParser.EscapeSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escapeSequence}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitEscapeSequence(MeritParser.EscapeSequenceContext ctx);
}