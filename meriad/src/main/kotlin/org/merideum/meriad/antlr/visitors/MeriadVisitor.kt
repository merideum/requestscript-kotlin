package org.merideum.meriad.antlr.visitors

import org.merideum.meriad.MeriadBaseVisitor
import org.merideum.meriad.MeriadParser
import org.merideum.meriad.antlr.MeriadValue
import org.merideum.meriad.antlr.VariableScope
import org.merideum.meriad.antlr.toModifier

class MeriadVisitor(val scope: VariableScope): MeriadBaseVisitor<MeriadValue>() {

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
    val variableValue: MeriadValue = this.visit(ctx.assignment())
    val variableName = ctx.IDENTIFIER().text
    val variableMutability = ctx.variableModifier()?.text?.toModifier()

    scope.assignVariable(variableName, variableValue, variableMutability)

    return MeriadValue.nothing()
  }
}
