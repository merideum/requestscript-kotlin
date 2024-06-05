@file:Suppress("TooManyFunctions")

package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumBaseVisitor
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.Variable
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.VariableType
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.error.FunctionCallException
import org.merideum.core.interpreter.error.ReturnTermination

/**
 * The root visitor used when executing a Merideum script.
 */
class ScriptVisitor(
    val scope: VariableScope,
    val resources: ResourceResolver,
) : MerideumBaseVisitor<WrappedValue<*>>() {
    var returnValue: Any? = Unit

    override fun visitStatement(ctx: MerideumParser.StatementContext?): WrappedValue<*> {
        return super.visitStatement(ctx)
    }

    override fun visitImportResourceStatement(ctx: MerideumParser.ImportResourceStatementContext?): WrappedValue<Unit> {
        val identifier = ctx!!.IDENTIFIER().text
        val resourcePath = ctx.resourcePathIdentifier().text + ctx.RESOURCE_IDENTIFIER().text

        val resource = resources.get(resourcePath)

        if (resource != null) {
            scope.declareVariable(
                Variable(
                    identifier,
                    resource,
                    VariableType.RESOURCE,
                )
            )
        }

        return WrappedValue(Unit)
    }

    override fun visitReturnStatement(ctx: MerideumParser.ReturnStatementContext?): WrappedValue<Unit> {
        val value = this.visit(ctx!!.expression())

        throw ReturnTermination(value.value)
    }

    override fun visitIntegerExpression(ctx: MerideumParser.IntegerExpressionContext?): WrappedValue<Int> {
        return WrappedValue(ctx!!.INTEGER().text.toInt())
    }

    override fun visitIdentifier(ctx: MerideumParser.IdentifierContext?): WrappedValue<Any?> {
        return WrappedValue(scope.variables[ctx!!.IDENTIFIER().text]!!.value)
    }

    override fun visitFunctionCallExpression(ctx: MerideumParser.FunctionCallExpressionContext?): WrappedValue<*> {
        val resource = this.visit(ctx!!.expression()).value

        if (resource is Resource) {
            val functionParams = if (ctx.functionCall().functionCallParams() != null) {
                this.visitFunctionCallParams(ctx.functionCall().functionCallParams()).value!!
            } else {
                emptyMap()
            }

            return WrappedValue(resource.callFunction(ctx.functionCall().IDENTIFIER().text, functionParams))
        }

        throw FunctionCallException("Function call expression expected")
    }

    override fun visitFunctionCallParams(
        ctx: MerideumParser.FunctionCallParamsContext?
    ): WrappedValue<Map<String, Any?>> {
        val namedParams = mutableMapOf<String, Any?>()

        ctx!!.functionCallParam().forEach {
            val param = this.visitFunctionCallParam(it).value!!
            namedParams[param.first] = param.second
        }

        return WrappedValue(namedParams)
    }

    override fun visitFunctionCallParam(
        ctx: MerideumParser.FunctionCallParamContext?
    ): WrappedValue<Pair<String, Any?>> {
        return WrappedValue(Pair(ctx!!.IDENTIFIER().text, this.visit(ctx.expression()).value))
    }
}
