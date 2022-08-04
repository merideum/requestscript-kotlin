package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.Variable
import org.merideum.kotlin.merit.interpreter.error.TypeMismatchedException
import org.merideum.kotlin.merit.interpreter.error.UnknownVariableIdentifierException
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

class ExpressionVisitor(
  private val parent: ScriptVisitor
): MeritParserBaseVisitor<MeritValue<*>>() {

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue<IntValue> {
    return MeritValue(IntValue(ctx.text.toInt()))
  }

  override fun visitStringExpression(ctx: MeritParser.StringExpressionContext): MeritValue<StringValue> {
    val content = ctx.stringContent().joinToString("") {
      // TODO throw better exception
      when (val stringPart = parent.visit(it).value) {
        is Variable<*> -> {
          stringPart.value?.stringify() ?: throw RuntimeException("Could not stringify null value")
        }
        is TypedValue<*> -> {
          stringPart.stringify()
        }
        is String -> {
          stringPart
        }
        else -> throw RuntimeException("Could not stringify content")
      }
    }

    return MeritValue(StringValue(content))
  }

  /**
   * Merit code that has been embedded into a string.
   *
   * Example:
   * const name = "World"
   * const greeting = "Hello ${name}!"
   */
  override fun visitEmbeddedExpression(ctx: MeritParser.EmbeddedExpressionContext): MeritValue<*> {
    return MeritValue(parent.visit(ctx.expression()).value)
  }

  override fun visitSimpleIdentifierExpression(ctx: MeritParser.SimpleIdentifierExpressionContext): MeritValue<Variable<*>> {
    val expectedIdentifier = ctx.simpleIdentifier().text

    val found = parent.scope.resolveVariable(expectedIdentifier)
      ?: throw UnknownVariableIdentifierException(expectedIdentifier)

    return MeritValue(found)
  }

  override fun visitObjectExpression(ctx: MeritParser.ObjectExpressionContext?): MeritValue<ObjectValue> {
    val objectFields = if (ctx?.objectFields() == null) {
      emptyList()
    } else {
      this.visitObjectFields(ctx.objectFields()).value!!
    }

    return MeritValue(buildObject(objectFields))
  }

  override fun visitObjectFields(ctx: MeritParser.ObjectFieldsContext): MeritValue<List<ObjectField>> {
    val fields = ctx.objectField().map {
      this.visitObjectField(it).value!!
    }

    return MeritValue(fields)
  }

  override fun visitObjectField(ctx: MeritParser.ObjectFieldContext): MeritValue<ObjectField> {
    val name = ctx.simpleIdentifier().text

    val type = if (ctx.typeDeclaration() == null) {
      null
    } else {
      parent.visitTypeDeclaration(ctx.typeDeclaration()).value
    }

    val assignmentValue = when(val assignment = parent.visitAssignment(ctx.assignment()).value) {
      is TypedValue<*> -> assignment
      // TODO throw exception if TypedValue is null because the variable value has not yet been set.
      is Variable<*> -> assignment.value

      // TODO better exception
      else -> throw RuntimeException("Could not get value of type")
    }

    // TODO make sure type declaration, if included, matches the expression value
    if (type != null && type != assignmentValue!!.type)
      throw TypeMismatchedException(type, assignmentValue.type)

    return MeritValue(ObjectField(name, assignmentValue as TypedValue<*>))
  }

  @Suppress("UNCHECKED_CAST")
  override fun visitObjectFieldReferenceExpression(ctx: MeritParser.ObjectFieldReferenceExpressionContext): MeritValue<TypedValue<*>> {
    val caller = when (val callerExpression = parent.visit(ctx.expression()).value) {
      is Variable<*> -> callerExpression.value
      is ObjectValue -> callerExpression
      //TODO throw better exception
      else -> throw RuntimeException("Invalid type for field reference.")
    }
    // TODO should a null object field reference return null and not throw exception?
      ?: throw RuntimeException("Could not get field of null value")

    // TODO throw better exception
    if (caller !is ObjectValue) throw RuntimeException("Invalid type for field reference.")

    val fieldName = ctx.simpleIdentifier().text

    val value = caller.getField(fieldName)

    return MeritValue(value)
  }

  private fun buildObject(fields: List<ObjectField>): ObjectValue {
    val mappedObject = mutableMapOf<String, TypedValue<*>>()

    // TODO check that this is right.
    fields.forEach {
      mappedObject[it.key] = it.value
    }

    return ObjectValue(mappedObject)
  }

  class ObjectField(
    val key: String,
    val value: TypedValue<*>,
  )
}
