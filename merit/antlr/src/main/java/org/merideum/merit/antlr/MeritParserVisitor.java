// Generated from MeritParser.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeritParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeritParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeritParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MeritParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#scriptDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptDefinition(MeritParser.ScriptDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#scriptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptType(MeritParser.ScriptTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#scriptParameterBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptParameterBlock(MeritParser.ScriptParameterBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#scriptParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptParameters(MeritParser.ScriptParametersContext ctx);
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
	 * Visit a parse tree produced by {@link MeritParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MeritParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAssignment(MeritParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#variableReassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReassignment(MeritParser.VariableReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MeritParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(MeritParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(MeritParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectFieldReferenceExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldReferenceExpression(MeritParser.ObjectFieldReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(MeritParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifierExpression(MeritParser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MeritParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(MeritParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MeritParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(MeritParser.FunctionParametersContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link MeritParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(MeritParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#objectFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFields(MeritParser.ObjectFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeritParser#objectField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectField(MeritParser.ObjectFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code embeddedExpression}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbeddedExpression(MeritParser.EmbeddedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MeritParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escapeSequence}
	 * labeled alternative in {@link MeritParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapeSequence(MeritParser.EscapeSequenceContext ctx);
}