// Generated from Merideum.g4 by ANTLR 4.13.1
package org.merideum.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MerideumParser}.
 */
public interface MerideumListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link MerideumParser#importResourceStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportResourceStatement(MerideumParser.ImportResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#importResourceStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportResourceStatement(MerideumParser.ImportResourceStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MerideumParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MerideumParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link MerideumParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(MerideumParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(MerideumParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(MerideumParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(MerideumParser.FunctionCallParamContext ctx);
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
}