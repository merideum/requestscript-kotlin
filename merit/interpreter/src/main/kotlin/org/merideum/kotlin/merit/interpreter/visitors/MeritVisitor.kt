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
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

class MeritVisitor(
  val scope: VariableScope,
  val output: OutputContainer,
  val resourceResolver: ResourceResolver
): MeritParserBaseVisitor<MeritValue<*>>() {

  override fun visitTypeDeclaration(ctx: MeritParser.TypeDeclarationContext): MeritValue<Type> {
    return MeritValue(Type.fromDeclaration(ctx.type.text))
  }

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue<IntValue> {
    return MeritValue(IntValue(ctx.text.toInt()))
  }

  override fun visitStringExpression(ctx: MeritParser.StringExpressionContext): MeritValue<StringValue> {
    val content = ctx.stringContent().joinToString("") {
      // TODO throw better exception
      when (val stringPart = this.visit(it).value) {
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

  override fun visitEmbeddedExpression(ctx: MeritParser.EmbeddedExpressionContext): MeritValue<*> {
    return MeritValue(this.visit(ctx.expression()).value)
  }

  override fun visitText(ctx: MeritParser.TextContext): MeritValue<*> {
    return MeritValue(ctx.TEXT().text)
  }

  override fun visitEscapeSequence(ctx: MeritParser.EscapeSequenceContext): MeritValue<*> {
    return MeritValue(ctx.ESCAPE_SEQUENCE().text)
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

  override fun visitFunctionCallExpression(ctx: MeritParser.FunctionCallExpressionContext): MeritValue<*> {
    val functionCaller = this.visit(ctx.expression()).value

    val caller = if (functionCaller is Variable<*>) {
      functionCaller.value
    } else if (functionCaller is TypedValue<*>) {
      functionCaller
    } else {
      // TODO Replace with better Exception class.
      throw RuntimeException("Could not call function expression.")
    }

    // Cannot call functions of null values.
    if (caller != null) {
      val functionAttributes = this.visit(ctx.functionCall()).value as FunctionCallAttributes
      val parameterValues = functionAttributes.parameters.map {
        /**
         * If the value of a parameter is not a TypedValue, then we need to get the TypedValue.
         */
        val parameterValue = it.value

        when (parameterValue) {
          is Variable<*> -> {
            parameterValue.value?.get()
          }
          is TypedValue<*> -> {
            parameterValue.get()
          }
          else -> {
            parameterValue
          }
        }
      }

      return MeritValue(caller.callFunction(functionAttributes.name, parameterValues))
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
    val parameters = ctx.expression().map { this.visit(it) }

    return MeritValue(parameters)
  }

  override fun visitVariableDeclaration(ctx: MeritParser.VariableDeclarationContext): MeritValue<*> {
    val name = ctx.simpleIdentifier().text
    val type = this.visitTypeDeclaration(ctx.typeDeclaration()).value!!

    type.declareVariable(scope, name)

    return MeritValue.nothing()
  }

  override fun visitVariableDeclarationAssignment(ctx: MeritParser.VariableDeclarationAssignmentContext): MeritValue<*> {
    val name = ctx.simpleIdentifier().text
    val modifier = ctx.variableModifier().text.toModifier()

    // ANTLR4 may still report back a null assignment if the syntax is broken.
    if (ctx.assignment() == null) return MeritValue.nothing()

    val value = this.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      scope.declareAndAssignVariable(name, value, modifier)
    }

    return MeritValue.nothing()
  }

  override fun visitVariableReassignment(ctx: MeritParser.VariableReassignmentContext): MeritValue<*> {
    val name = ctx.simpleIdentifier().text
    val value = this.visitAssignment(ctx.assignment()).value

    if (value is TypedValue<*>) {
      scope.reassignVariable(name, value)
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

      scope.declareAndAssignVariable(resourceIdentifier, resource, Modifier.CONST)
    }

    return MeritValue.nothing()
  }
}
