// Generated from Merit.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeritParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeritVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeritParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MeritParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MeritParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#importResource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportResource(MeritParser.ImportResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MeritParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#outputAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputAssignment(MeritParser.OutputAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(MeritParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MeritParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(MeritParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(MeritParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourcePathIdentifier(MeritParser.ResourcePathIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(MeritParser.SimpleIdentifierContext ctx);
}