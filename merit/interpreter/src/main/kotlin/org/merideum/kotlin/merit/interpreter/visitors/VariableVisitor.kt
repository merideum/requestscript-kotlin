package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.error.TypeMismatchedException
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.interpreter.type.ListType
import org.merideum.kotlin.merit.interpreter.type.value.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.value.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

class VariableVisitor(
  private val parent: ScriptVisitor
): MeritParserBaseVisitor<MeritValue<*>>() {

  override fun visitVariableDeclaration(ctx: MeritParser.VariableDeclarationContext): MeritValue<Unit> {
    val name = ctx.simpleIdentifier().text
    val type = visitTypeDeclaration(ctx.typeDeclaration()).value!!

    parent.scope.declareVariable(name, type)

    return MeritValue.nothing()
  }

  override fun visitVariableDeclarationAssignment(ctx: MeritParser.VariableDeclarationAssignmentContext): MeritValue<*> {
    val name = ctx.simpleIdentifier().text
    val modifier = ctx.variableModifier().text.toModifier()

    // TODO throw error
    // ANTLR4 may still report back a null assignment if the syntax is broken.
    if (ctx.assignment() == null) return MeritValue.nothing()

    val value = parent.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      val declaredType = if (ctx.typeDeclaration() != null) {
        visitTypeDeclaration(ctx.typeDeclaration())
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

    // TODO make sure the new value and old value are the same type.
    if (value is TypedValue<*>) {
      // TODO throw better exception
      val variable = parent.scope.resolveVariable(objectName) ?: throw RuntimeException("Could not find object for assignment")

      val variableValue = variable.value
      if (variableValue is ObjectValue) {
        variableValue.setField(fieldName, value)
      }
      // TODO else throw exception because only objects have fields
    }

    return MeritValue.nothing()
  }

  override fun visitTypeDeclaration(ctx: MeritParser.TypeDeclarationContext): MeritValue<Type> {
    val typeDeclaration = visitType(ctx.type()).value!!
    return MeritValue(typeDeclaration)
  }

  override fun visitType(ctx: MeritParser.TypeContext): MeritValue<Type> {
    val typeValue = if (ctx.basicType() != null) {
      visitBasicType(ctx.basicType()).value!!
    } else if (ctx.listType() != null){
      visitListType(ctx.listType()).value!!
    } else throw RuntimeException()

    return MeritValue(typeValue)
  }

  override fun visitBasicType(ctx: MeritParser.BasicTypeContext): MeritValue<Type> {
    return MeritValue(Type.fromKey(ctx.text))
  }

  override fun visitListType(ctx: MeritParser.ListTypeContext): MeritValue<Type> {
    val innerType = visitType(ctx.type()).value!!

    return MeritValue(ListType(innerType))
  }
}
