package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.FunctionCallAttributes
import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.Variable
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

class FunctionVisitor(
  private val parent: ScriptVisitor
): MeritParserBaseVisitor<MeritValue<*>>() {

  override fun visitFunctionCallExpression(ctx: MeritParser.FunctionCallExpressionContext): MeritValue<*> {
    val caller = getFunctionCaller(parent.visit(ctx.expression()).value)

    // Cannot call functions of null values.
    if (caller != null) {
      val functionAttributes = this.visitFunctionCall(ctx.functionCall()).value as FunctionCallAttributes
      val parameterValues = mapFunctionParameterValues(functionAttributes.parameters)

      return MeritValue(caller.callFunction(parent.context, functionAttributes.name, parameterValues))
    } else {
      // TODO Replace with better Exception class.
      throw RuntimeException("Cannot call function of null value.")
    }
  }

  override fun visitFunctionCall(ctx: MeritParser.FunctionCallContext): MeritValue<FunctionCallAttributes> {
    val name = ctx.simpleIdentifier().text
    val parameters = if (ctx.functionParameters() == null) {
      emptyList()
    } else {
      this.visitFunctionParameters(ctx.functionParameters()).value!!
    }

    return MeritValue(FunctionCallAttributes(name, parameters))
  }

  override fun visitFunctionParameters(ctx: MeritParser.FunctionParametersContext): MeritValue<List<MeritValue<*>>> {
    val parameters = ctx.expression().map { parent.visit(it) }

    return MeritValue(parameters)
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

  private fun mapFunctionParameterValues(parameters: List<MeritValue<*>>): List<TypedValue<*>> {
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
