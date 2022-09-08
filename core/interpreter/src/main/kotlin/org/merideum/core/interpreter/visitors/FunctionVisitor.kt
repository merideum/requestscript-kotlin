package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.core.interpreter.FunctionCallAttributes
import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.FunctionParameter
import org.merideum.core.interpreter.Variable
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptRuntimeException
import org.merideum.core.interpreter.error.syntaxError
import org.merideum.core.interpreter.type.TypedValue

class FunctionVisitor(
    private val parent: ScriptVisitor
) : MerideumParserBaseVisitor<WrappedValue<*>>() {

    override fun visitFunctionCallExpression(ctx: MerideumParser.FunctionCallExpressionContext): WrappedValue<*> {
        val caller = getFunctionCaller(parent.visit(ctx.expression()).value)

        // Cannot call functions of null values.
        if (caller != null) {
            val functionAttributes =
                this.visitFunctionCall(ctx.functionCall()).value as FunctionCallAttributes
            val parameterValues = mapFunctionParameterValues(functionAttributes.parameters)

            return WrappedValue(
                caller.callFunction(
                    FunctionCallContext(
                        functionAttributes.name,
                        parameterValues,
                        parent.context,
                        ctx
                    )
                )
            )
        } else {
            throw syntaxError("Cannot call function of null value.", ScriptErrorType.FUNCTION_CALL, ctx)
        }
    }

    override fun visitFunctionCall(
        ctx: MerideumParser.FunctionCallContext
    ): WrappedValue<FunctionCallAttributes> {
        val name = ctx.simpleIdentifier().text
        val parameters = if (ctx.functionParameters() == null) {
            emptyList()
        } else {
            this.visitFunctionParameters(ctx.functionParameters()).value!!
        }

        return WrappedValue(
            FunctionCallAttributes(
                name,
                parameters
            )
        )
    }

    override fun visitFunctionParameters(
        ctx: MerideumParser.FunctionParametersContext
    ): WrappedValue<List<FunctionParameter>> {
        val parameters = ctx.expression().map {
            FunctionParameter(
                parent.visit(it),
                ctx.start.line,
                ctx.start.charPositionInLine
            )
        }

        return WrappedValue(parameters)
    }

    private fun getFunctionCaller(callerExpression: Any?): TypedValue<*>? {
        return when (callerExpression) {
            is Variable<*> -> {
                callerExpression.value
            }

            is TypedValue<*> -> {
                callerExpression
            }

            else -> null
        }
    }

    private fun mapFunctionParameterValues(parameters: List<FunctionParameter>): List<TypedValue<*>> {
        return parameters.map {
            when (val parameterValue = it.value.value) {
                is Variable<*> -> {
                    parameterValue.value
                }

                is TypedValue<*> -> {
                    parameterValue
                }

                else -> throw ScriptRuntimeException(
                    "Could not get value from parameter",
                    ScriptErrorType.FUNCTION_PARAMETER,
                    it.lineNumber,
                    it.linePosition
                )
            } as TypedValue<*>
        }
    }
}
