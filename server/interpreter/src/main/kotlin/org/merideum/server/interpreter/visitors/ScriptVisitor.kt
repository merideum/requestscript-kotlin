package org.merideum.server.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.server.interpreter.Modifier
import org.merideum.server.interpreter.ResourceResolver
import org.merideum.server.interpreter.ReturnTermination
import org.merideum.server.interpreter.ScriptContext
import org.merideum.server.interpreter.Variable
import org.merideum.server.interpreter.VariableScope
import org.merideum.server.interpreter.WrappedValue
import org.merideum.server.interpreter.error.ResourceResolutionException
import org.merideum.server.interpreter.script.ScriptType
import org.merideum.server.interpreter.type.IntValue
import org.merideum.server.interpreter.type.ObjectValue
import org.merideum.server.interpreter.type.StringValue
import org.merideum.server.interpreter.type.Type
import org.merideum.server.interpreter.type.TypedValue

/**
 * The root visitor used when executing a Merideum script.
 */
class ScriptVisitor(
  val scope: VariableScope,
  val resourceResolver: ResourceResolver,
  val context: ScriptContext
): MerideumParserBaseVisitor<WrappedValue<*>>() {

  val variableVisitor = VariableVisitor(this)
  val expressionVisitor = ExpressionVisitor(this)
  val functionVisitor = FunctionVisitor(this)

  /**
   * Entrypoint for a script.
   * For a contract call, parameters are already injected into the [VariableScope] when the [ScriptVisitor] is instantiated.
   * Parameters are not allowed on a Request [ScriptType].
   */
  override fun visitScriptDefinition(ctx: MerideumParser.ScriptDefinitionContext): WrappedValue<Unit> {
    val scriptType = ScriptType.fromString(ctx.scriptType().text)

    val scriptParameters = if (ctx.scriptParameterBlock() != null) {
      this.visitScriptParameterBlock(ctx.scriptParameterBlock())
    } else null

    // TODO validate contract script definition
    if (scriptType == ScriptType.REQUEST) {
      // TODO throw named exception
      if (scriptParameters != null) throw RuntimeException("Cannot declare parameters with script type 'request'")
    }

    // Interpret the script, executing all code within the block.
    this.visit(ctx.block())

    return WrappedValue.nothing()
  }

  override fun visitImportResource(ctx: MerideumParser.ImportResourceContext?): WrappedValue<*> {
    if (ctx != null) {
      val resourceIdentifier = ctx.IDENTIFIER().text
      val resourceName = ctx.RESOURCE_NAME().text
      val resourcePath = ctx.resourcePathIdentifier()?.text?.removeSuffix(".")

      val resource = if (resourcePath == null) {
        resourceResolver.resolve(resourceName)
      } else {
        resourceResolver.resolve(resourceName, resourcePath)
      } ?: throw ResourceResolutionException(resourceName)

      scope.declareAndAssignVariable(resourceIdentifier, resource, Modifier.CONST)
    }

    return WrappedValue.nothing()
  }

  override fun visitTypeDeclaration(ctx: MerideumParser.TypeDeclarationContext): WrappedValue<Type> {
    return WrappedValue(Type.fromDeclaration(ctx.type().text))
  }

  override fun visitIntegerExpression(ctx: MerideumParser.IntegerExpressionContext): WrappedValue<IntValue> {
    return expressionVisitor.visitIntegerExpression(ctx)
  }

  override fun visitStringExpression(ctx: MerideumParser.StringExpressionContext): WrappedValue<StringValue> {
    return expressionVisitor.visitStringExpression(ctx)
  }

  override fun visitListExpression(ctx: MerideumParser.ListExpressionContext): WrappedValue<*> {
    return expressionVisitor.visitListExpression(ctx)
  }

  override fun visitObjectExpression(ctx: MerideumParser.ObjectExpressionContext?): WrappedValue<*> {
    return expressionVisitor.visitObjectExpression(ctx)
  }

  override fun visitEmbeddedExpression(ctx: MerideumParser.EmbeddedExpressionContext): WrappedValue<*> {
    return expressionVisitor.visitEmbeddedExpression(ctx)
  }

  /**
   * Return the variable for the identifier.
   */
  override fun visitSimpleIdentifierExpression(ctx: MerideumParser.SimpleIdentifierExpressionContext): WrappedValue<Variable<*>> {
    return expressionVisitor.visitSimpleIdentifierExpression(ctx)
  }

  override fun visitFunctionCallExpression(ctx: MerideumParser.FunctionCallExpressionContext): WrappedValue<*> {
    return functionVisitor.visitFunctionCallExpression(ctx)
  }

  override fun visitObjectFieldReferenceExpression(ctx: MerideumParser.ObjectFieldReferenceExpressionContext): WrappedValue<*> {
    return expressionVisitor.visitObjectFieldReferenceExpression(ctx)
  }

  override fun visitElementExpression(ctx: MerideumParser.ElementExpressionContext): WrappedValue<*> {
    return expressionVisitor.visitElementExpression(ctx)
  }

  // End expressions

  override fun visitVariableDeclaration(ctx: MerideumParser.VariableDeclarationContext): WrappedValue<*> {
    variableVisitor.visitVariableDeclaration(ctx)

    return WrappedValue.nothing()
  }

  override fun visitVariableDeclarationAssignment(ctx: MerideumParser.VariableDeclarationAssignmentContext): WrappedValue<*> {
    variableVisitor.visitVariableDeclarationAssignment(ctx)

    return WrappedValue.nothing()
  }

  override fun visitVariableReassignment(ctx: MerideumParser.VariableReassignmentContext): WrappedValue<*> {
    variableVisitor.visitVariableReassignment(ctx)

    return WrappedValue.nothing()
  }

  override fun visitObjectFieldAssignment(ctx: MerideumParser.ObjectFieldAssignmentContext): WrappedValue<*> {
    return variableVisitor.visitObjectFieldAssignment(ctx)
  }

  /**
   * Returning a value from the script throws [ReturnTermination] with the value.
   * The implementation of [ScriptExecutor] should catch it and return the value.
   */
  override fun visitReturnStatement(ctx: MerideumParser.ReturnStatementContext): WrappedValue<Unit> {
    val returnValue: Map<String, Any?> =
      when (val returnExpression = this.visit(ctx.expression()).value!!) {
        is ObjectValue -> {
          // TODO throw better exception
          returnExpression.get()?.toMap() ?: throw RuntimeException("Unexpected value for return")
        }
      is Variable<*> -> {
        // TODO throw if the variable has not been initialized
        val variableValue = returnExpression.value ?: throw RuntimeException("Cannot return value of uninitialized variable")
        // If the value is a variable, key the value to its variable name.
        mapOf(returnExpression.name to variableValue.get())
      }
      is TypedValue<*> -> {
        // If the value is a "raw" value, then wrap it in a key called 'value'.
        mapOf("value" to returnExpression.get())
      }
      else -> {
        // TODO throw better exception
        throw RuntimeException("Unexpected value for return")
      }
    }

    // End the execution
    throw ReturnTermination(returnValue)
  }

  override fun visitAssignment(ctx: MerideumParser.AssignmentContext): WrappedValue<*> {
    return WrappedValue(this.visit(ctx.expression()).value)
  }

  override fun visitText(ctx: MerideumParser.TextContext): WrappedValue<*> {
    return WrappedValue(ctx.TEXT().text)
  }

  override fun visitEscapeSequence(ctx: MerideumParser.EscapeSequenceContext): WrappedValue<*> {
    return WrappedValue(ctx.ESCAPE_SEQUENCE().text)
  }
}
