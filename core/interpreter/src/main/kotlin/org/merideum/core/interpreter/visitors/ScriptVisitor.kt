@file:Suppress("TooManyFunctions")

package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
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
    override fun visitScriptDefinition(ctx: MerideumParser.ScriptDefinitionContext): WrappedValue<Unit> {
        val scriptType = ScriptType.fromString(ctx.scriptType().text)

        if (ctx.simpleIdentifier() == null) {
            throw ScriptSyntaxException("An identifier is required for the request", ScriptErrorType.SCRIPT_DEFINITION)
        }

        val scriptParametersBlock = ctx.scriptParameterBlock()

        // TODO validate contract script definition
        if (scriptType == ScriptType.REQUEST) {
            // TODO throw named exception
            if (scriptParametersBlock != null) {
                throw ScriptSyntaxException(
                    "Cannot declare parameters with script type 'request'",
                    ScriptErrorType.SCRIPT_DEFINITION
                )
            }
        } else if (scriptType == ScriptType.CONTRACT) {
            // Get every script parameter and add each as a CONST variable.
            visitScriptParameterBlock(scriptParametersBlock)
        }

        // Interpret the script, executing all code within the block.
        this.visit(ctx.block())

        return WrappedValue.nothing()
    }

    override fun visitScriptParameterBlock(ctx: MerideumParser.ScriptParameterBlockContext): WrappedValue<Unit> {
        visitScriptParameters(ctx.scriptParameters())

        return WrappedValue.nothing()
    }

    override fun visitScriptParameters(ctx: MerideumParser.ScriptParametersContext?): WrappedValue<Unit> {
        ctx!!.scriptParameter().forEach(::visitScriptParameter)

        return WrappedValue.nothing()
    }

    override fun visitScriptParameter(ctx: MerideumParser.ScriptParameterContext): WrappedValue<Unit> {
        val name = ctx.simpleIdentifier().text

        // TODO check that the types match.
        val type = this.visitTypeDeclaration(ctx.typeDeclaration()).value!!
        val parameterValue = context.parameters[name]

        scope.declareAndAssignVariable(name, type.newValue(parameterValue), Modifier.CONST)

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
        val returnValue: Map<String, Any?> =
            when (val returnExpression = this.visit(ctx.expression()).value!!) {
                /**
                 * If the return is an object,
                 * then we return the object at the root level instead of nested in a property.
                  */
                is ObjectValue -> {
                    returnExpression.get()
                        ?: throw ScriptSyntaxException("Unexpected value for return", ScriptErrorType.RETURN)
                }

                is Variable<*> -> {
                    val variableValue = returnExpression.value
                        ?: throw ScriptSyntaxException(
                            "Cannot return value of uninitialized variable",
                            ScriptErrorType.VARIABLE
                        )

                    // If the value is a variable, key the value to its variable name.
                    mapOf(returnExpression.name to variableValue.get())
                }

                is TypedValue<*> -> {
                    // If the value is a "raw" value, then wrap it in a key called 'value'.
                    mapOf("value" to returnExpression.get())
                }

                else -> {
                    throw ScriptSyntaxException("Unexpected value for return", ScriptErrorType.RETURN)
                }
            }

        // End the execution
        throw ReturnTermination(returnValue)
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
