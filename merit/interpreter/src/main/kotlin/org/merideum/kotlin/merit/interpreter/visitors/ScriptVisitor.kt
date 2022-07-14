package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.FunctionCallAttributes
import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.Variable
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.kotlin.merit.interpreter.script.ScriptType
import org.merideum.kotlin.merit.interpreter.type.IntValue
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
  val output: OutputContainer,
  val resourceResolver: ResourceResolver
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
    return MeritValue(Type.fromDeclaration(ctx.type.text))
  }

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue<IntValue> {
    return expressionVisitor.visitIntegerExpression(ctx)
  }

  override fun visitStringExpression(ctx: MeritParser.StringExpressionContext): MeritValue<StringValue> {
    return expressionVisitor.visitStringExpression(ctx)
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

  override fun visitOutputAssignment(ctx: MeritParser.OutputAssignmentContext): MeritValue<*> {
    val outputAssignment: MeritValue<*> = if (ctx.assignment() == null) {
      MeritValue.nothing()
    } else this.visit(ctx.assignment())

    val outputName = ctx.simpleIdentifier().text

    // If the outputAssignment is not present, then we assume the IDENTIFIER points to a variable.
    if (outputAssignment == MeritValue.nothing()) {
      val resolved = scope.resolveVariable(outputName) ?: return MeritValue.nothing()

      if (resolved.initialized) {
        output.add(outputName, resolved.value!!.get())
      }
      // TODO: throw error if the resolved variable is not initialized.
    } else {
      if (outputAssignment.value is TypedValue<*>) {
        output.add(outputName, outputAssignment.value.get())
      }
    }

    return MeritValue.nothing()
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
