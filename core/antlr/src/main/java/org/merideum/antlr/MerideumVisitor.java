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
public interface MerideumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MerideumParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(MerideumParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(MerideumParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#scriptDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptDefinition(MerideumParser.ScriptDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#requestDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequestDefinition(MerideumParser.RequestDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(MerideumParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#contractParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractParameters(MerideumParser.ContractParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(MerideumParser.ParameterDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link MerideumParser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(MerideumParser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAssignment(MerideumParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(MerideumParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldAssignment(MerideumParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MerideumParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MerideumParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectFieldCall}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldCall(MerideumParser.ObjectFieldCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MerideumParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MerideumParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MerideumParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code object}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(MerideumParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code embeddedIdentifier}
	 * labeled alternative in {@link MerideumParser#stringContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbeddedIdentifier(MerideumParser.EmbeddedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link MerideumParser#stringContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MerideumParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(MerideumParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(MerideumParser.TypeDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link MerideumParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MerideumParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#functionVariableParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVariableParameter(MerideumParser.FunctionVariableParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#functionNamedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNamedParameter(MerideumParser.FunctionNamedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(MerideumParser.ObjectDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link MerideumParser#objectFieldValueAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldValueAssignment(MerideumParser.ObjectFieldValueAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(MerideumParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#listElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElements(MerideumParser.ListElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerideumParser#listElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElement(MerideumParser.ListElementContext ctx);
}