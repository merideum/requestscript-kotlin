// Generated from /Users/christopherpoulsen/dev/git/merideum-kotlin/Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(Parser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importResource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportResource(Parser.ImportResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#outputAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputAssignment(Parser.OutputAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAssignment(Parser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableReassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReassignment(Parser.VariableReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(Parser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(Parser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIdentifierExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifierExpression(Parser.SimpleIdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(Parser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(Parser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Parser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#resourcePathIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourcePathIdentifier(Parser.ResourcePathIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(Parser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringContent(Parser.StringContentContext ctx);
}