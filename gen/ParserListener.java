// Generated from /Users/christopherpoulsen/dev/git/merideum-kotlin/Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(Parser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(Parser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importResource}.
	 * @param ctx the parse tree
	 */
	void enterImportResource(Parser.ImportResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importResource}.
	 * @param ctx the parse tree
	 */
	void exitImportResource(Parser.ImportResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#outputAssignment}.
	 * @param ctx the parse tree
	 */
	void enterOutputAssignment(Parser.OutputAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#outputAssignment}.
	 * @param ctx the parse tree
	 */
	void exitOutputAssignment(Parser.OutputAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAssignment(Parser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAssignment(Parser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableReassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableReassignment(Parser.VariableReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableReassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableReassignment(Parser.VariableReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(Parser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(Parser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(Parser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(Parser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifierExpression(Parser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifierExpression(Parser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(Parser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(Parser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(Parser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(Parser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterResourcePathIdentifier(Parser.ResourcePathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitResourcePathIdentifier(Parser.ResourcePathIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(Parser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(Parser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(Parser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(Parser.StringContentContext ctx);
}