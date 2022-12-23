// Generated from java-escape by ANTLR 4.11.1
package org.merideum.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MerideumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MerideumParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MerideumParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MerideumParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#scriptDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptDefinition(MerideumParser.ScriptDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#scriptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptType(MerideumParser.ScriptTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#scriptParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptParameters(MerideumParser.ScriptParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#scriptParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptParameter(MerideumParser.ScriptParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MerideumParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#importResource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportResource(MerideumParser.ImportResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MerideumParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MerideumParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MerideumParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAssignment(MerideumParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#variableReassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReassignment(MerideumParser.VariableReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldAssignment(MerideumParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MerideumParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(MerideumParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(MerideumParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectFieldReferenceExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldReferenceExpression(MerideumParser.ObjectFieldReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpression(MerideumParser.ElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(MerideumParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(MerideumParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifierExpression(MerideumParser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(MerideumParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MerideumParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(MerideumParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(MerideumParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourcePathIdentifier(MerideumParser.ResourcePathIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(MerideumParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(MerideumParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MerideumParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(MerideumParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(MerideumParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#objectFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFields(MerideumParser.ObjectFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#objectField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectField(MerideumParser.ObjectFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#listElementAssignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElementAssignments(MerideumParser.ListElementAssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#listElementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElementAssignment(MerideumParser.ListElementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code embeddedExpression}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbeddedExpression(MerideumParser.EmbeddedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MerideumParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escapeSequence}
	 * labeled alternative in {@link MerideumParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapeSequence(MerideumParser.EscapeSequenceContext ctx);
}