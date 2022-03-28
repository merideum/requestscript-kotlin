package org.merideum.meriad.antlr.visitors

import org.merideum.meriad.MeriadBaseVisitor
import org.merideum.meriad.MeriadParser
import org.merideum.meriad.antlr.MeriadValue
import org.merideum.meriad.antlr.VariableScope
import org.merideum.meriad.antlr.toModifier
import org.merideum.meriad.execution.OutputContainer

class MeriadVisitor(val scope: VariableScope, val output: OutputContainer): MeriadBaseVisitor<MeriadValue>() {

  override fun visitIntegerExpression(ctx: MeriadParser.IntegerExpressionContext): MeriadValue {
    return MeriadValue(ctx.text.toInt())
  }

  override fun visitVariableModifier(ctx: MeriadParser.VariableModifierContext): MeriadValue {
    return MeriadValue(ctx.text)
  }

  override fun visitAssignment(ctx: MeriadParser.AssignmentContext): MeriadValue {
    return MeriadValue(this.visit(ctx.expression()).value)
  }

  override fun visitVariableAssignment(ctx: MeriadParser.VariableAssignmentContext): MeriadValue {
    val variableValue: MeriadValue = if (ctx.assignment() == null) {
      MeriadValue.nothing()
    } else this.visit(ctx.assignment())

    val variableName = ctx.IDENTIFIER().text
    val variableMutability = ctx.variableModifier()?.text?.toModifier()

    scope.assignVariable(variableName, variableValue, variableMutability)

    return MeriadValue.nothing()
  }

  override fun visitOutputAssignment(ctx: MeriadParser.OutputAssignmentContext): MeriadValue {
    val outputAssignment: MeriadValue = if (ctx.assignment() == null) {
      MeriadValue.nothing()
    } else this.visit(ctx.assignment())

    val outputName = ctx.IDENTIFIER().text

    // If the outputAssignment is not present, then we assume the IDENTIFIER points to a variable.
    if (outputAssignment == MeriadValue.nothing()) {
      val resolved = scope.resolveVariable(outputName) ?: return MeriadValue.nothing()

      // TODO: throw error if the resolved variable is not initialized.
      if (resolved.initialized) {
        output.add(outputName, resolved.value)
      }
    } else {
      output.add(outputName, outputAssignment.value)
    }

    return MeriadValue.nothing()
  }
}
