package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.DependencyResolver
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.error.DependencyResolutionException
import org.merideum.merit.antlr.MeritBaseVisitor
import org.merideum.merit.antlr.MeritParser

class MeritVisitor(
  val scope: VariableScope,
  val output: OutputContainer,
  val dependencyResolver: DependencyResolver
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

  override fun visitImportDependency(ctx: MeritParser.ImportDependencyContext?): MeritValue {
    if (ctx != null) {
      val dependencyIdentifier = ctx.IDENTIFIER().text
      val dependencyName = ctx.DEPENDENCY_NAME().text
      val dependencyPath = ctx.dependencyPathIdentifier()?.text
        ?.removeSuffix(".")

      val dependency = if (dependencyPath == null) {
        dependencyResolver.resolve(dependencyName)
      } else {
        dependencyResolver.resolve(dependencyName, dependencyPath)
      } ?: throw DependencyResolutionException(dependencyName)

      scope.assignVariable(dependencyIdentifier, MeritValue(dependency), Modifier.CONST)
    }

    return MeritValue.nothing()
  }
}
