package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.error.TypeMismatchedException
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

class VariableVisitor(
  private val parent: ScriptVisitor
): MeritParserBaseVisitor<MeritValue<*>>() {

  override fun visitVariableDeclaration(ctx: MeritParser.VariableDeclarationContext): MeritValue<Unit> {
    val name = ctx.simpleIdentifier().text
    val type = parent.visitTypeDeclaration(ctx.typeDeclaration()).value!!

    type.declareVariable(parent.scope, name)

    return MeritValue.nothing()
  }

  override fun visitVariableDeclarationAssignment(ctx: MeritParser.VariableDeclarationAssignmentContext): MeritValue<*> {
    val name = ctx.simpleIdentifier().text
    val modifier = ctx.variableModifier().text.toModifier()

    // ANTLR4 may still report back a null assignment if the syntax is broken.
    if (ctx.assignment() == null) return MeritValue.nothing()

    val value = parent.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      val declaredType = if (ctx.typeDeclaration() != null) {
        parent.visitTypeDeclaration(ctx.typeDeclaration())
      } else null

      if (declaredType != null && value.type != declaredType.value) throw TypeMismatchedException(declaredType.value!!, value.type)

      parent.scope.declareAndAssignVariable(name, value, modifier)
    }

    return MeritValue.nothing()
  }

  override fun visitVariableReassignment(ctx: MeritParser.VariableReassignmentContext): MeritValue<*> {
    val name = ctx.simpleIdentifier().text
    val value = parent.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      parent.scope.reassignVariable(name, value)
    }

    return MeritValue.nothing()
  }

  override fun visitObjectFieldAssignment(ctx: MeritParser.ObjectFieldAssignmentContext): MeritValue<*> {
    val objectName = ctx.variableName.text
    val fieldName = ctx.fieldName.text

    val value = parent.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      // TODO make sure the new value and old value are the same type
      // TODO throw better exception
      val variable = parent.scope.resolveVariable(objectName) ?: throw RuntimeException("Could not find object for assignment")

      val variableValue = variable.value

      // TODO throw exception if the variableValue's type is not ObjectValue
      if (variableValue is ObjectValue) {
        variableValue.setField(fieldName, value)
      }
    }

    return MeritValue.nothing()
  }
}
