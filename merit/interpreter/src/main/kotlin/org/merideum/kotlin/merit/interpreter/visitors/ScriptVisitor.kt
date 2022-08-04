package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.ReturnTermination
import org.merideum.kotlin.merit.interpreter.Variable
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.kotlin.merit.interpreter.script.ScriptType
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

/**
 * The root visitor used when executing a Merit script.
 */
class ScriptVisitor(
  val scope: VariableScope,
  val resourceResolver: ResourceResolver,
  val context: ScriptContext
): MeritParserBaseVisitor<MeritValue<*>>() {

  val variableVisitor = VariableVisitor(this)
  val expressionVisitor = ExpressionVisitor(this)
  val functionVisitor = FunctionVisitor(this)

  /**
   * Entrypoint for a script.
   * For a contract call, parameters are already injected into the [VariableScope] when the [ScriptVisitor] is instantiated.
   * Parameters are not allowed on a Request [ScriptType].
   */
  override fun visitScriptDefinition(ctx: MeritParser.ScriptDefinitionContext): MeritValue<Unit> {
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

    return MeritValue.nothing()
  }

  override fun visitImportResource(ctx: MeritParser.ImportResourceContext?): MeritValue<*> {
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

    return MeritValue.nothing()
  }

  override fun visitTypeDeclaration(ctx: MeritParser.TypeDeclarationContext): MeritValue<Type> {
    return MeritValue(Type.fromDeclaration(ctx.type().text))
  }

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue<IntValue> {
    return expressionVisitor.visitIntegerExpression(ctx)
  }

  override fun visitStringExpression(ctx: MeritParser.StringExpressionContext): MeritValue<StringValue> {
    return expressionVisitor.visitStringExpression(ctx)
  }

  override fun visitObjectExpression(ctx: MeritParser.ObjectExpressionContext?): MeritValue<*> {
    return expressionVisitor.visitObjectExpression(ctx)
  }

  override fun visitEmbeddedExpression(ctx: MeritParser.EmbeddedExpressionContext): MeritValue<*> {
    return expressionVisitor.visitEmbeddedExpression(ctx)
  }

  /**
   * Return the variable for the identifier.
   */
  override fun visitSimpleIdentifierExpression(ctx: MeritParser.SimpleIdentifierExpressionContext): MeritValue<Variable<*>> {
    return expressionVisitor.visitSimpleIdentifierExpression(ctx)
  }

  override fun visitFunctionCallExpression(ctx: MeritParser.FunctionCallExpressionContext): MeritValue<*> {
    return functionVisitor.visitFunctionCallExpression(ctx)
  }

  override fun visitObjectFieldReferenceExpression(ctx: MeritParser.ObjectFieldReferenceExpressionContext): MeritValue<*> {
    return expressionVisitor.visitObjectFieldReferenceExpression(ctx)
  }

  override fun visitVariableDeclaration(ctx: MeritParser.VariableDeclarationContext): MeritValue<*> {
    variableVisitor.visitVariableDeclaration(ctx)

    return MeritValue.nothing()
  }

  override fun visitVariableDeclarationAssignment(ctx: MeritParser.VariableDeclarationAssignmentContext): MeritValue<*> {
    variableVisitor.visitVariableDeclarationAssignment(ctx)

    return MeritValue.nothing()
  }

  override fun visitVariableReassignment(ctx: MeritParser.VariableReassignmentContext): MeritValue<*> {
    variableVisitor.visitVariableReassignment(ctx)

    return MeritValue.nothing()
  }

  override fun visitObjectFieldAssignment(ctx: MeritParser.ObjectFieldAssignmentContext): MeritValue<*> {
    return variableVisitor.visitObjectFieldAssignment(ctx)
  }

  /**
   * Returning a value from the script throws [ReturnTermination] with the value.
   * The implementation of [MeritExecutor] should catch it and return the value.
   */
  override fun visitReturnStatement(ctx: MeritParser.ReturnStatementContext): MeritValue<Unit> {
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

  override fun visitAssignment(ctx: MeritParser.AssignmentContext): MeritValue<*> {
    return MeritValue(this.visit(ctx.expression()).value)
  }

  override fun visitText(ctx: MeritParser.TextContext): MeritValue<*> {
    return MeritValue(ctx.TEXT().text)
  }

  override fun visitEscapeSequence(ctx: MeritParser.EscapeSequenceContext): MeritValue<*> {
    return MeritValue(ctx.ESCAPE_SEQUENCE().text)
  }
}
