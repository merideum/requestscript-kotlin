@file:Suppress("TooManyFunctions")

package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParser.ScriptDefinitionContext
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.core.interpreter.Modifier
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.ReturnTermination
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.Variable
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.error.ResourceResolutionException
import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptRuntimeException
import org.merideum.core.interpreter.error.ScriptSyntaxException
import org.merideum.core.interpreter.script.ScriptType
import org.merideum.core.interpreter.type.IntValue
import org.merideum.core.interpreter.type.ObjectValue
import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue

/**
 * The root visitor used when executing a Merideum script.
 */
class ScriptVisitor(
    val scope: VariableScope,
    val resourceResolver: ResourceResolver,
    val context: ScriptContext
) : MerideumParserBaseVisitor<WrappedValue<*>>() {

    val variableVisitor = VariableVisitor(this)
    val expressionVisitor = ExpressionVisitor(this)
    val functionVisitor = FunctionVisitor(this)

    /**
     * Entrypoint for a script.
     * Parameters are already injected into the [VariableScope] when the [ScriptVisitor] is instantiated.
     * Parameters are not allowed on a Request [ScriptType].
     */
    override fun visitScriptDefinition(ctx: ScriptDefinitionContext): WrappedValue<Unit> {
        // Validate the script definition and if necessary, add parameters to the VariableScope
        validateAndVisitScriptDefinition(ctx)

        // Interpret the script, executing all code within the block.
        this.visit(ctx.block())

        // If this line was reached during a successful execution, then there was no return statement.
        return WrappedValue.nothing()
    }

    private fun validateAndVisitScriptDefinition(scriptDefinitionContext: ScriptDefinitionContext) {
        val scriptType = ScriptType.fromString(scriptDefinitionContext.scriptType().text)

        context.scriptName = if (scriptDefinitionContext.simpleIdentifier() == null) {
            throw ScriptSyntaxException("An identifier is required for the request", ScriptErrorType.SCRIPT_DEFINITION)
        } else {
            scriptDefinitionContext.simpleIdentifier().text
        }

        val scriptParametersContext = scriptDefinitionContext.scriptParameters()

        // TODO validate contract script definition
        if (scriptType == ScriptType.REQUEST) {
            // TODO throw named exception
            if (scriptParametersContext != null) {
                throw ScriptSyntaxException(
                    "Cannot declare parameters with script type 'request'",
                    ScriptErrorType.SCRIPT_DEFINITION
                )
            }
        } else if (scriptType == ScriptType.CONTRACT) {
            // Get every script parameter and add each as a CONST variable.
            visitScriptParameters(scriptParametersContext)
        }
    }

    override fun visitScriptParameters(ctx: MerideumParser.ScriptParametersContext?): WrappedValue<Unit> {
        ctx!!.scriptParameter().forEach(::visitScriptParameter)

        return WrappedValue.nothing()
    }

    override fun visitScriptParameter(ctx: MerideumParser.ScriptParameterContext): WrappedValue<Unit> {
        val name = ctx.simpleIdentifier().text

        // TODO check that the types match.
        val type = this.visitTypeDeclaration(ctx.typeDeclaration()).value!!
        val parameterValue = context.parameters.getOrElse(name) {
            throw ScriptRuntimeException("Value not present for parameter: $name", ScriptErrorType.SCRIPT_DEFINITION)
        }

        @Suppress("SwallowedException")
        val typedValue = try {
            type.newValue(parameterValue)
        } catch (e: ClassCastException) {
            throw ScriptRuntimeException(
                "The type of the value does not match the type declaration for parameter: $name",
                ScriptErrorType.SCRIPT_DEFINITION
            )
        }

        scope.declareAndAssignVariable(name, typedValue, Modifier.CONST)

        return WrappedValue.nothing()
    }

    override fun visitImportResource(ctx: MerideumParser.ImportResourceContext?): WrappedValue<*> {
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

        return WrappedValue.nothing()
    }

    override fun visitTypeDeclaration(ctx: MerideumParser.TypeDeclarationContext): WrappedValue<Type> {
        return WrappedValue(Type.fromDeclaration(ctx.type().text))
    }

    override fun visitIntegerExpression(ctx: MerideumParser.IntegerExpressionContext): WrappedValue<IntValue> {
        return expressionVisitor.visitIntegerExpression(ctx)
    }

    override fun visitStringExpression(ctx: MerideumParser.StringExpressionContext): WrappedValue<StringValue> {
        return expressionVisitor.visitStringExpression(ctx)
    }

    override fun visitListExpression(ctx: MerideumParser.ListExpressionContext): WrappedValue<*> {
        return expressionVisitor.visitListExpression(ctx)
    }

    override fun visitObjectExpression(ctx: MerideumParser.ObjectExpressionContext?): WrappedValue<*> {
        return expressionVisitor.visitObjectExpression(ctx)
    }

    override fun visitEmbeddedExpression(ctx: MerideumParser.EmbeddedExpressionContext): WrappedValue<*> {
        return expressionVisitor.visitEmbeddedExpression(ctx)
    }

    /**
     * Return the variable for the identifier.
     */
    override fun visitSimpleIdentifierExpression(
        ctx: MerideumParser.SimpleIdentifierExpressionContext
    ): WrappedValue<Variable<*>> {
        return expressionVisitor.visitSimpleIdentifierExpression(ctx)
    }

    override fun visitFunctionCallExpression(ctx: MerideumParser.FunctionCallExpressionContext): WrappedValue<*> {
        return functionVisitor.visitFunctionCallExpression(ctx)
    }

    override fun visitObjectFieldReferenceExpression(
        ctx: MerideumParser.ObjectFieldReferenceExpressionContext
    ): WrappedValue<*> {
        return expressionVisitor.visitObjectFieldReferenceExpression(ctx)
    }

    override fun visitElementExpression(ctx: MerideumParser.ElementExpressionContext): WrappedValue<*> {
        return expressionVisitor.visitElementExpression(ctx)
    }

    // End expressions

    override fun visitVariableDeclaration(ctx: MerideumParser.VariableDeclarationContext): WrappedValue<*> {
        variableVisitor.visitVariableDeclaration(ctx)

        return WrappedValue.nothing()
    }

    override fun visitVariableDeclarationAssignment(
        ctx: MerideumParser.VariableDeclarationAssignmentContext
    ): WrappedValue<*> {
        variableVisitor.visitVariableDeclarationAssignment(ctx)

        return WrappedValue.nothing()
    }

    override fun visitVariableReassignment(ctx: MerideumParser.VariableReassignmentContext): WrappedValue<*> {
        variableVisitor.visitVariableReassignment(ctx)

        return WrappedValue.nothing()
    }

    override fun visitObjectFieldAssignment(ctx: MerideumParser.ObjectFieldAssignmentContext): WrappedValue<*> {
        return variableVisitor.visitObjectFieldAssignment(ctx)
    }

    /**
     * Returning a value from the script throws [ReturnTermination] with the value.
     * The implementation of [ScriptExecutor] should catch it and return the value.
     *
     * The value is always a JSON object (for consistency) with the following rules:
     *      * If the return value is an object, then we return the object itself, as a shorthand.
     *        Ex:
     *          const myVar = {
     *              "foo" = "asdf"
     *          }
     *          return myVar
     *
     *        Becomes:
     *          {
     *             "output": {
     *                "foo": "asdf"
     *             }
     *          }
     *      * If the return value is a variable,
     *        then we return the value of the variable under the key with its variable name.
     *
     *        Ex:
     *        const myVar = 1234
     *        return myVar
     *
     *        Becomes:
     *        {
     *          "output": {
     *            "myVar": 1234
     *          }
     *        }
     *
     *      * If the return value is a "raw" value, and not an object, return the value with the key "value".
     *        Ex:
     *        return "asdf"
     *
     *        Becomes:
     *        {
     *            "output": {
     *                "value": "asdf"
     *            }
     *        }
     */
    override fun visitReturnStatement(ctx: MerideumParser.ReturnStatementContext): WrappedValue<Unit> {
        val returnValue = when (val returnExpression = this.visit(ctx.expression()).value!!) {
            is Variable<*> -> {
                val variableValue = returnExpression.value
                    ?: throw ScriptSyntaxException(
                        "Cannot return value of uninitialized variable",
                        ScriptErrorType.VARIABLE
                    )

                // If the value is a variable, key the value to its variable name.
                variableValue.get()
            }

            is TypedValue<*> -> {
                // If the value is a "raw" value, then wrap it in a key called 'value'.
                returnExpression.get()
            }

            else -> {
                throw ScriptSyntaxException("Unexpected value for return", ScriptErrorType.RETURN)
            }
        }

        // End the execution
        throw ReturnTermination(mapOf("return" to returnValue))
    }

    override fun visitAssignment(ctx: MerideumParser.AssignmentContext): WrappedValue<*> {
        return WrappedValue(this.visit(ctx.expression()).value)
    }

    override fun visitText(ctx: MerideumParser.TextContext): WrappedValue<*> {
        return WrappedValue(ctx.TEXT().text)
    }

    override fun visitEscapeSequence(ctx: MerideumParser.EscapeSequenceContext): WrappedValue<*> {
        return WrappedValue(ctx.ESCAPE_SEQUENCE().text)
    }
}
