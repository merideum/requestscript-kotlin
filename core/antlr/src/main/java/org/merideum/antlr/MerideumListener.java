// Generated from java-escape by ANTLR 4.11.1
package org.merideum.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MerideumParser}.
 */
public interface MerideumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MerideumParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(MerideumParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(MerideumParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(MerideumParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(MerideumParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#scriptDefinition}.
	 * @param ctx the parse tree
	 */
	void enterScriptDefinition(MerideumParser.ScriptDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#scriptDefinition}.
	 * @param ctx the parse tree
	 */
	void exitScriptDefinition(MerideumParser.ScriptDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#requestDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRequestDefinition(MerideumParser.RequestDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#requestDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRequestDefinition(MerideumParser.RequestDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(MerideumParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(MerideumParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#contractParameters}.
	 * @param ctx the parse tree
	 */
	void enterContractParameters(MerideumParser.ContractParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#contractParameters}.
	 * @param ctx the parse tree
	 */
	void exitContractParameters(MerideumParser.ContractParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(MerideumParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(MerideumParser.ParameterDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link MerideumParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(MerideumParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(MerideumParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAssignment(MerideumParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAssignment(MerideumParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MerideumParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MerideumParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldAssignment(MerideumParser.ObjectFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectFieldAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldAssignment(MerideumParser.ObjectFieldAssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(MerideumParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(MerideumParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectFieldCall}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldCall(MerideumParser.ObjectFieldCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectFieldCall}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldCall(MerideumParser.ObjectFieldCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MerideumParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MerideumParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterList(MerideumParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitList(MerideumParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(MerideumParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(MerideumParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code object}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObject(MerideumParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code object}
	 * labeled alternative in {@link MerideumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObject(MerideumParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code embeddedIdentifier}
	 * labeled alternative in {@link MerideumParser#stringContents}.
	 * @param ctx the parse tree
	 */
	void enterEmbeddedIdentifier(MerideumParser.EmbeddedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code embeddedIdentifier}
	 * labeled alternative in {@link MerideumParser#stringContents}.
	 * @param ctx the parse tree
	 */
	void exitEmbeddedIdentifier(MerideumParser.EmbeddedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link MerideumParser#stringContents}.
	 * @param ctx the parse tree
	 */
	void enterText(MerideumParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link MerideumParser#stringContents}.
	 * @param ctx the parse tree
	 */
	void exitText(MerideumParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(MerideumParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(MerideumParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MerideumParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MerideumParser.TypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link MerideumParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(MerideumParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(MerideumParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MerideumParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MerideumParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#functionVariableParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVariableParameter(MerideumParser.FunctionVariableParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionVariableParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVariableParameter(MerideumParser.FunctionVariableParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#functionNamedParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNamedParameter(MerideumParser.FunctionNamedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#functionNamedParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNamedParameter(MerideumParser.FunctionNamedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(MerideumParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(MerideumParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectFields}.
	 * @param ctx the parse tree
	 */
	void enterObjectFields(MerideumParser.ObjectFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectFields}.
	 * @param ctx the parse tree
	 */
	void exitObjectFields(MerideumParser.ObjectFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectField}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(MerideumParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectField}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(MerideumParser.ObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#objectFieldValueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldValueAssignment(MerideumParser.ObjectFieldValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#objectFieldValueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldValueAssignment(MerideumParser.ObjectFieldValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(MerideumParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(MerideumParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#listElements}.
	 * @param ctx the parse tree
	 */
	void enterListElements(MerideumParser.ListElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#listElements}.
	 * @param ctx the parse tree
	 */
	void exitListElements(MerideumParser.ListElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerideumParser#listElement}.
	 * @param ctx the parse tree
	 */
	void enterListElement(MerideumParser.ListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerideumParser#listElement}.
	 * @param ctx the parse tree
	 */
	void exitListElement(MerideumParser.ListElementContext ctx);
}