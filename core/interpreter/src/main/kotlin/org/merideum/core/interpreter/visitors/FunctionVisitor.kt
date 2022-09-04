package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.core.interpreter.FunctionCallAttributes
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.Variable
import org.merideum.core.interpreter.type.TypedValue

class FunctionVisitor(
  private val parent: ScriptVisitor
): MerideumParserBaseVisitor<WrappedValue<*>>() {

  override fun visitFunctionCallExpression(ctx: MerideumParser.FunctionCallExpressionContext): WrappedValue<*> {
    val caller = getFunctionCaller(parent.visit(ctx.expression()).value)

    // Cannot call functions of null values.
    if (caller != null) {
      val functionAttributes = this.visitFunctionCall(ctx.functionCall()).value as org.merideum.core.interpreter.FunctionCallAttributes
      val parameterValues = mapFunctionParameterValues(functionAttributes.parameters)

      return WrappedValue(
        caller.callFunction(
          parent.context,
          functionAttributes.name,
          parameterValues
        )
      )
    } else {
      // TODO Replace with better Exception class.
      throw RuntimeException("Cannot call function of null value.")
    }
  }

  override fun visitFunctionCall(ctx: MerideumParser.FunctionCallContext): WrappedValue<org.merideum.core.interpreter.FunctionCallAttributes> {
    val name = ctx.simpleIdentifier().text
    val parameters = if (ctx.functionParameters() == null) {
      emptyList()
    } else {
      this.visitFunctionParameters(ctx.functionParameters()).value!!
    }

    return WrappedValue(
      org.merideum.core.interpreter.FunctionCallAttributes(
        name,
        parameters
      )
    )
  }

  override fun visitFunctionParameters(ctx: MerideumParser.FunctionParametersContext): WrappedValue<List<WrappedValue<*>>> {
    val parameters = ctx.expression().map { parent.visit(it) }

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

  private fun mapFunctionParameterValues(parameters: List<WrappedValue<*>>): List<TypedValue<*>> {
    return parameters.map {
      when (val parameterValue = it.value) {
        is Variable<*> -> {
          parameterValue.value
        }
        is TypedValue<*> -> {
          parameterValue
        }
        else -> throw RuntimeException("Could not map function parameter value")
      } as TypedValue<*>
    }
  }
}
