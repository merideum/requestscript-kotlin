package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.FunctionCallAttributes
import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.Variable
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.kotlin.merit.interpreter.error.UnknownVariableIdentifierException
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritBaseVisitor
import org.merideum.merit.antlr.MeritParser

class MeritVisitor(
  val scope: VariableScope,
  val output: OutputContainer,
  val resourceResolver: ResourceResolver
): MeritBaseVisitor<MeritValue<*>>() {

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue<*> {
    return MeritValue(IntValue(ctx.text.toInt()))
  }

  /**
   * Return the variable for the identifier.
   */
  override fun visitSimpleIdentifierExpression(ctx: MeritParser.SimpleIdentifierExpressionContext): MeritValue<Variable<*>> {
    val expectedIdentifier = ctx.simpleIdentifier().text

    val found = scope.resolveVariable(expectedIdentifier)
      ?: throw UnknownVariableIdentifierException(expectedIdentifier)

    return MeritValue(found)
  }

  override fun visitVariableModifier(ctx: MeritParser.VariableModifierContext): MeritValue<String> {
    return MeritValue(ctx.text)
  }

  override fun visitAssignment(ctx: MeritParser.AssignmentContext): MeritValue<*> {
    return MeritValue(this.visit(ctx.expression()).value)
  }

  override fun visitStandaloneFunctionCall(ctx: MeritParser.StandaloneFunctionCallContext): MeritValue<*> {
    val functionCaller = this.visit(ctx.expression()).value

    if (functionCaller is Variable<*>) {
      val caller = functionCaller.value

      // Cannot call functions of null values.
      if (caller != null) {
        val functionAttributes = this.visit(ctx.functionCall()).value as FunctionCallAttributes
        val parameterValues = functionAttributes.parameters.map {
          /**
           * If the value of a parameter is not a TypedValue, then we need to get the TypedValue.
           */
          val parameterValue = it.value

          if (parameterValue is Variable<*>) {
            parameterValue.value
          } else {
            parameterValue
          }
        }

        caller.callFunction(functionAttributes.name, parameterValues)

        return MeritValue(MeritValue.nothing())
      }

      // TODO Replace with better Exception class.
      throw RuntimeException("Cannot call function of null value.")
    }

    // TODO Replace with better Exception class.
    throw RuntimeException("Could not call function expression.")
  }

  override fun visitFunctionCallExpression(ctx: MeritParser.FunctionCallExpressionContext): MeritValue<*> {
    val functionCaller = this.visit(ctx.expression()).value

    if (functionCaller is Variable<*>) {
      val caller = functionCaller.value

      // Cannot call functions of null values.
      if (caller != null) {
        val functionAttributes = this.visit(ctx.functionCall()).value as FunctionCallAttributes
        val parameterValues = functionAttributes.parameters.map {
          /**
           * If the value of a parameter is not a TypedValue, then we need to get the TypedValue.
           */
          val parameterValue = it.value

          if (parameterValue is Variable<*>) {
            parameterValue.value
          } else {
            parameterValue
          }
        }

        return MeritValue(caller.callFunction(functionAttributes.name, parameterValues))
      }

      // TODO Replace with better Exception class.
      throw RuntimeException("Cannot call function of null value.")
    }

    // TODO Replace with better Exception class.
    throw RuntimeException("Could not call function expression.")
  }

  override fun visitFunctionCall(ctx: MeritParser.FunctionCallContext): MeritValue<FunctionCallAttributes> {
    val name = ctx.simpleIdentifier().text
    val parameters = if (ctx.functionParameters() == null) {
      emptyList()
    } else {
      this.visit(ctx.functionParameters()).value as List<MeritValue<*>>
    }

    return MeritValue(FunctionCallAttributes(name, parameters))
  }

  override fun visitFunctionParameters(ctx: MeritParser.FunctionParametersContext): MeritValue<List<MeritValue<*>>> {
    val parameters = ctx.expression().map { this.visit(it) }

    return MeritValue(parameters)
  }

  override fun visitVariableAssignment(ctx: MeritParser.VariableAssignmentContext): MeritValue<*> {
    val variableValue: MeritValue<*> = if (ctx.assignment() == null) {
      MeritValue.nothing()
    } else this.visit(ctx.assignment())

    val variableName = ctx.simpleIdentifier().text
    val variableMutability = ctx.variableModifier()?.text?.toModifier()

    // If the value of the variable is not a [TypedValue] then the variable value is not assigned.
    if (variableValue.value is TypedValue<*>) {
      scope.assignVariable(variableName, variableValue.value, variableMutability)
    } else {
      scope.assignVariable<Unit>(variableName, null, variableMutability)
    }

    return MeritValue.nothing()
  }

  override fun visitOutputAssignment(ctx: MeritParser.OutputAssignmentContext): MeritValue<*> {
    val outputAssignment: MeritValue<*> = if (ctx.assignment() == null) {
      MeritValue.nothing()
    } else this.visit(ctx.assignment())

    val outputName = ctx.simpleIdentifier().text

    // If the outputAssignment is not present, then we assume the IDENTIFIER points to a variable.
    if (outputAssignment == MeritValue.nothing()) {
      val resolved = scope.resolveVariable(outputName) ?: return MeritValue.nothing()

      if (resolved.initialized) {
        output.add(outputName, resolved.value!!.get())
      }
      // TODO: throw error if the resolved variable is not initialized.
    } else {
      if (outputAssignment.value is TypedValue<*>) {
        output.add(outputName, outputAssignment.value.get())
      }
    }

    return MeritValue.nothing()
  }

  override fun visitImportResource(ctx: MeritParser.ImportResourceContext?): MeritValue<*> {
    if (ctx != null) {
      val resourceIdentifier = ctx.IDENTIFIER().text
      val resourceName = ctx.RESOURCE_NAME().text
      val resourcePath = ctx.resourcePathIdentifier()?.text?.removeSuffix(".")

      val resource = if (resourcePath == null) {
        resourceResolver.resolve(resourceName)
      } else {
        resourceResolver.resolve(resourceName, resourcePath)
      } ?: throw ResourceResolutionException(resourceName)

      scope.assignVariable(resourceIdentifier, resource, Modifier.CONST)
    }

    return MeritValue.nothing()
  }
}
