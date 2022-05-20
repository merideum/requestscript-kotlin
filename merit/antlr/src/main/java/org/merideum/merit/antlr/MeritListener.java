// Generated from Merit.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeritParser}.
 */
public interface MeritListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link MeritParser#importDependency}.
	 * @param ctx the parse tree
	 */
	void enterImportDependency(MeritParser.ImportDependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#importDependency}.
	 * @param ctx the parse tree
	 */
	void exitImportDependency(MeritParser.ImportDependencyContext ctx);
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
	 * Enter a parse tree produced by {@link MeritParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MeritParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MeritParser.VariableAssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link MeritParser#dependencyPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDependencyPathIdentifier(MeritParser.DependencyPathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeritParser#dependencyPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDependencyPathIdentifier(MeritParser.DependencyPathIdentifierContext ctx);
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
}