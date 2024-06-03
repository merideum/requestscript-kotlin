// Generated from Merideum.g4 by ANTLR 4.13.1
package org.merideum.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MerideumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MerideumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MerideumParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MerideumParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MerideumParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#importResourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportResourceStatement(MerideumParser.ImportResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MerideumParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MerideumParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#integerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(MerideumParser.IntegerExpressionContext ctx);
}