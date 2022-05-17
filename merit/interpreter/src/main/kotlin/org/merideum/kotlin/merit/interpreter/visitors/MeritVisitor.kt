package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.merit.antlr.MeritBaseVisitor
import org.merideum.merit.antlr.MeritParser

class MeritVisitor(val scope: VariableScope, val output: OutputContainer): MeritBaseVisitor<MeritValue>() {

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

    val variableName = ctx.IDENTIFIER().text
    val variableMutability = ctx.variableModifier()?.text?.toModifier()

    scope.assignVariable(variableName, variableValue, variableMutability)

    return MeritValue.nothing()
  }

  override fun visitOutputAssignment(ctx: MeritParser.OutputAssignmentContext): MeritValue {
    val outputAssignment: MeritValue = if (ctx.assignment() == null) {
      MeritValue.nothing()
    } else this.visit(ctx.assignment())

    val outputName = ctx.IDENTIFIER().text

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
}
