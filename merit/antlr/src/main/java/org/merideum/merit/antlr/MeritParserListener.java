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
	 * Enter a parse tree produced by {@link MeritParser#outputAssignment}.
	 * @param ctx the parse tree
	 */
	void enterOutputAssignment(MeritParser.OutputAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#outputAssignment}.
	 * @param ctx the parse tree
	 */
	void exitOutputAssignment(MeritParser.OutputAssignmentContext ctx);
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