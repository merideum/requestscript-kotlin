package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.error.TypeMismatchedException
import org.merideum.core.interpreter.toModifier
import org.merideum.core.interpreter.type.ObjectValue
import org.merideum.core.interpreter.type.TypedValue

class VariableVisitor(
  private val parent: ScriptVisitor
): MerideumParserBaseVisitor<WrappedValue<*>>() {

  override fun visitVariableDeclaration(ctx: MerideumParser.VariableDeclarationContext): WrappedValue<Unit> {
    val name = ctx.simpleIdentifier().text
    val type = parent.visitTypeDeclaration(ctx.typeDeclaration()).value!!

    type.declareVariable(parent.scope, name)

    return WrappedValue.nothing()
  }

  override fun visitVariableDeclarationAssignment(ctx: MerideumParser.VariableDeclarationAssignmentContext): WrappedValue<*> {
    val name = ctx.simpleIdentifier().text
    val modifier = ctx.variableModifier().text.toModifier()

    // ANTLR4 may still report back a null assignment if the syntax is broken.
    if (ctx.assignment() == null) return WrappedValue.nothing()

    val value = parent.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      val declaredType = if (ctx.typeDeclaration() != null) {
        parent.visitTypeDeclaration(ctx.typeDeclaration())
      } else null

      if (declaredType != null && value.type != declaredType.value) throw TypeMismatchedException(declaredType.value!!, value.type)

      parent.scope.declareAndAssignVariable(name, value, modifier)
    }

    return WrappedValue.nothing()
  }

  override fun visitVariableReassignment(ctx: MerideumParser.VariableReassignmentContext): WrappedValue<*> {
    val name = ctx.simpleIdentifier().text
    val value = parent.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      parent.scope.reassignVariable(name, value)
    }

    return WrappedValue.nothing()
  }

  override fun visitObjectFieldAssignment(ctx: MerideumParser.ObjectFieldAssignmentContext): WrappedValue<*> {
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

    return WrappedValue.nothing()
  }
}
