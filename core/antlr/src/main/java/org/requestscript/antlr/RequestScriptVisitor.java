// Generated from RequestScript.g4 by ANTLR 4.13.1
package org.requestscript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RequestScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RequestScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(RequestScriptParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#scriptDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptDefinition(RequestScriptParser.ScriptDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#scriptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptType(RequestScriptParser.ScriptTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#scriptParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptParameters(RequestScriptParser.ScriptParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#scriptParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptParameter(RequestScriptParser.ScriptParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RequestScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#importResourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportResourceStatement(RequestScriptParser.ImportResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(RequestScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(RequestScriptParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(RequestScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link RequestScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(RequestScriptParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RequestScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#functionCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParams(RequestScriptParser.FunctionCallParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#functionCallParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParam(RequestScriptParser.FunctionCallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourcePathIdentifier(RequestScriptParser.ResourcePathIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(RequestScriptParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RequestScriptParser.TypeContext ctx);
}