package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.core.interpreter.Variable
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.error.TypeMismatchedException
import org.merideum.core.interpreter.error.UnknownVariableIdentifierException
import org.merideum.core.interpreter.type.IntValue
import org.merideum.core.interpreter.type.ObjectValue
import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue
import org.merideum.core.interpreter.type.list.ListValue

class ExpressionVisitor(
    private val parent: ScriptVisitor
) : MerideumParserBaseVisitor<WrappedValue<*>>() {

    override fun visitIntegerExpression(ctx: MerideumParser.IntegerExpressionContext): WrappedValue<IntValue> {
        return WrappedValue(IntValue(ctx.text.toInt()))
    }

    override fun visitStringExpression(ctx: MerideumParser.StringExpressionContext): WrappedValue<StringValue> {
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

        return WrappedValue(StringValue(content))
    }

    /**
     * Merideum code that has been embedded into a string.
     *
     * Example:
     * const name = "World"
     * const greeting = "Hello ${name}!"
     */
    override fun visitEmbeddedExpression(ctx: MerideumParser.EmbeddedExpressionContext): WrappedValue<*> {
        return WrappedValue(parent.visit(ctx.expression()).value)
    }

    override fun visitSimpleIdentifierExpression(ctx: MerideumParser.SimpleIdentifierExpressionContext): WrappedValue<Variable<*>> {
        val expectedIdentifier = ctx.simpleIdentifier().text

        val found = parent.scope.resolveVariable(expectedIdentifier)
            ?: throw UnknownVariableIdentifierException(expectedIdentifier)

        return WrappedValue(found)
    }

    override fun visitListExpression(ctx: MerideumParser.ListExpressionContext): WrappedValue<TypedValue<*>> {
        val elements =
            visitListElementAssignments(ctx.listElementAssignments()).value ?: return WrappedValue(
                null
            )

        // Check that the list elements are the same type
        val elementsAreSame = elements.groupBy { it.type }.size == 1

        // TODO Throw better exception
        val innerType = if (elementsAreSame) {
            elements.first().type
        } else throw RuntimeException("Lists must be singleton")

        // TODO throw better exception
        val listType =
            innerType.listType() ?: throw RuntimeException("Could not create list from inner type $innerType")

        // TODO make sure this cast succeeds
        return WrappedValue(listType.newValue(elements))
    }

    override fun visitListElementAssignments(ctx: MerideumParser.ListElementAssignmentsContext): WrappedValue<List<TypedValue<*>>> {
        val elements = ctx.listElementAssignment().map { visitListElementAssignment(it).value!! }

        return WrappedValue(elements)
    }

    override fun visitListElementAssignment(ctx: MerideumParser.ListElementAssignmentContext): WrappedValue<TypedValue<*>> {
        val expression = parent.visit(ctx.expression()).value!!

        val value = if (expression is Variable<*>) {
            expression.value
        } else if (expression is TypedValue<*>) {
            expression
        } else {
            // TODO throw better exception
            throw RuntimeException("Could not get value from expression")
        }
        return WrappedValue(value)
    }

    override fun visitObjectExpression(ctx: MerideumParser.ObjectExpressionContext?): WrappedValue<ObjectValue> {
        val objectFields = if (ctx?.objectFields() == null) {
            emptyList()
        } else {
            this.visitObjectFields(ctx.objectFields()).value!!
        }

        return WrappedValue(buildObject(objectFields))
    }

    override fun visitObjectFields(ctx: MerideumParser.ObjectFieldsContext): WrappedValue<List<ObjectField>> {
        val fields = ctx.objectField().map {
            this.visitObjectField(it).value!!
        }

        return WrappedValue(fields)
    }

    override fun visitObjectField(ctx: MerideumParser.ObjectFieldContext): WrappedValue<ObjectField> {
        val name = ctx.simpleIdentifier().text

        val type = if (ctx.typeDeclaration() == null) {
            null
        } else {
            parent.visitTypeDeclaration(ctx.typeDeclaration()).value
        }

        val assignmentValue = when (val assignment = parent.visitAssignment(ctx.assignment()).value) {
            is TypedValue<*> -> assignment
            // TODO throw exception if TypedValue is null because the variable value has not yet been set.
            is Variable<*> -> assignment.value

            // TODO better exception
            else -> throw RuntimeException("Could not get value of type")
        }

        // TODO make sure type declaration, if included, matches the expression value
        if (type != null && type != assignmentValue!!.type)
            throw TypeMismatchedException(type, assignmentValue.type)

        return WrappedValue(ObjectField(name, assignmentValue as TypedValue<*>))
    }

    override fun visitObjectFieldReferenceExpression(ctx: MerideumParser.ObjectFieldReferenceExpressionContext): WrappedValue<TypedValue<*>> {
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

        return WrappedValue(value)
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

    override fun visitElementExpression(ctx: MerideumParser.ElementExpressionContext): WrappedValue<TypedValue<*>> {
        val value = when (val result = parent.visit(ctx.value).value!!) {
            is Variable<*> -> result.value
            else -> result
        }

        val indexValue = when (val elementIndex = parent.visit(ctx.index).value!!) {
            is TypedValue<*> -> {
                elementIndex
            }

            is Variable<*> -> {
                elementIndex.value
            }

            else -> {
                // TODO throw better error
                throw RuntimeException("Cannot use value as index")
            }
        }

        val elementValue = if (value is ListValue<*, *>) {
            if (indexValue!!.type == Type.INT) {
                value.getValue(indexValue.get() as Int)
            } else {
                // TODO throw better error
                throw RuntimeException("Only type 'int' allowed for list index")
            }
        } else if (value is ObjectValue) {
            if (indexValue!!.type == Type.STRING) {
                value.getField(indexValue.get() as String)
            } else {
                // TODO throw better error
                throw RuntimeException("Only type 'string' allowed for object index")
            }
        } else {
            // TODO throw better error
            throw RuntimeException("Could not index expression")
        }

        return WrappedValue(elementValue)
    }
}
