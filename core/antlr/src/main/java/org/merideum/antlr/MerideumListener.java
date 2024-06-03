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
	 * Enter a parse tree produced by {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MerideumParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MerideumParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#integerExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(MerideumParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#integerExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(MerideumParser.IntegerExpressionContext ctx);
}