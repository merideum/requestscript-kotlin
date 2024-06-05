// Generated from RequestScript.g4 by ANTLR 4.13.1
package org.requestscript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RequestScriptParser}.
 */
public interface RequestScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(RequestScriptParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(RequestScriptParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RequestScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RequestScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#importResourceStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportResourceStatement(RequestScriptParser.ImportResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#importResourceStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportResourceStatement(RequestScriptParser.ImportResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(RequestScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(RequestScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(RequestScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(RequestScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(RequestScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(RequestScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(RequestScriptParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(RequestScriptParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RequestScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RequestScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(RequestScriptParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(RequestScriptParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(RequestScriptParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(RequestScriptParser.FunctionCallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestScriptParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterResourcePathIdentifier(RequestScriptParser.ResourcePathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestScriptParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitResourcePathIdentifier(RequestScriptParser.ResourcePathIdentifierContext ctx);
}