package org.merideum.meriad.antlr.visitors

import org.merideum.meriad.MeriadBaseVisitor
import org.merideum.meriad.MeriadParser
import org.merideum.meriad.antlr.MeriadValue
import org.merideum.meriad.antlr.Mutability
import org.merideum.meriad.antlr.VariableScope

class MeriadVisitor(val scope: VariableScope): MeriadBaseVisitor<MeriadValue>() {

  override fun visitIntegerExpression(ctx: MeriadParser.IntegerExpressionContext): MeriadValue {
    return MeriadValue(ctx.text.toInt(), Mutability.IMMUTABLE)
  }

  override fun visitAssignment(ctx: MeriadParser.AssignmentContext): MeriadValue {
    val variableValue: MeriadValue = this.visit(ctx.expression())
    val variableName = ctx.IDENTIFIER().text

    scope.assignVariable(variableName, variableValue)

    return MeriadValue.nothing()
  }
}
