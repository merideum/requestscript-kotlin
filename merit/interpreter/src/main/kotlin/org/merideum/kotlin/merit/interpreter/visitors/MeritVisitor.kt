package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.merit.antlr.MeritBaseVisitor
import org.merideum.merit.antlr.MeritParser

class MeritVisitor(
  val scope: VariableScope,
  val output: OutputContainer,
  val resourceResolver: ResourceResolver
): MeritBaseVisitor<MeritValue>() {

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue {
    return MeritValue(ctx.text.toInt())
  }

  override fun visitVariableModifier(ctx: MeritParser.VariableModifierContext): MeritValue {
    return MeritValue(ctx.text)
  }

  override fun visitAssignment(ctx: MeritParser.AssignmentContext): MeritValue {
    return MeritValue(this.visit(ctx.expression()).value)
  }

  override fun visitVariableAssignment(ctx: MeritParser.VariableAssignmentContext): MeritValue {
    val variableValue: MeritValue = if (ctx.assignment() == null) {
      MeritValue.nothing()
    } else this.visit(ctx.assignment())

    val variableName = ctx.simpleIdentifier().text
    val variableMutability = ctx.variableModifier()?.text?.toModifier()

    scope.assignVariable(variableName, variableValue, variableMutability)

    return MeritValue.nothing()
  }

  override fun visitOutputAssignment(ctx: MeritParser.OutputAssignmentContext): MeritValue {
    val outputAssignment: MeritValue = if (ctx.assignment() == null) {
      MeritValue.nothing()
    } else this.visit(ctx.assignment())

    val outputName = ctx.simpleIdentifier().text

    // If the outputAssignment is not present, then we assume the IDENTIFIER points to a variable.
    if (outputAssignment == MeritValue.nothing()) {
      val resolved = scope.resolveVariable(outputName) ?: return MeritValue.nothing()

      // TODO: throw error if the resolved variable is not initialized.
      if (resolved.initialized) {
        output.add(outputName, resolved.value)
      }
    } else {
      output.add(outputName, outputAssignment.value)
    }

    return MeritValue.nothing()
  }

  override fun visitImportResource(ctx: MeritParser.ImportResourceContext?): MeritValue {
    if (ctx != null) {
      val resourceIdentifier = ctx.IDENTIFIER().text
      val resourceName = ctx.RESOURCE_NAME().text
      val resourcePath = ctx.resourcePathIdentifier()?.text
        ?.removeSuffix(".")

      val resource = if (resourcePath == null) {
        resourceResolver.resolve(resourceName)
      } else {
        resourceResolver.resolve(resourceName, resourcePath)
      } ?: throw ResourceResolutionException(resourceName)

      scope.assignVariable(resourceIdentifier, MeritValue(resource), Modifier.CONST)
    }

    return MeritValue.nothing()
  }
}
