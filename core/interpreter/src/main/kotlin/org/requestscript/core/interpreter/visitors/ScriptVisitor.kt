@file:Suppress("TooManyFunctions")

package org.requestscript.core.interpreter.visitors

import org.requestscript.antlr.RequestScriptBaseVisitor
import org.requestscript.antlr.RequestScriptParser
import org.requestscript.core.interpreter.Resource
import org.requestscript.core.interpreter.ResourceResolver
import org.requestscript.core.interpreter.Variable
import org.requestscript.core.interpreter.VariableScope
import org.requestscript.core.interpreter.VariableType
import org.requestscript.core.interpreter.WrappedValue
import org.requestscript.core.interpreter.error.FunctionCallException
import org.requestscript.core.interpreter.error.ReturnTermination

/**
 * The root visitor used when executing a RequestScript script.
 */
class ScriptVisitor(
    val scope: VariableScope,
    val resources: ResourceResolver,
) : RequestScriptBaseVisitor<WrappedValue<*>>() {
    var returnValue: Any? = Unit

    override fun visitStatement(ctx: RequestScriptParser.StatementContext?): WrappedValue<*> {
        return super.visitStatement(ctx)
    }

    override fun visitImportResourceStatement(
        ctx: RequestScriptParser.ImportResourceStatementContext?
    ): WrappedValue<Unit> {
        val identifier = ctx!!.IDENTIFIER()[0].text
        val resourcePath = ctx.resourcePathIdentifier().text + ctx.IDENTIFIER()[1].text

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

    override fun visitReturnStatement(ctx: RequestScriptParser.ReturnStatementContext?): WrappedValue<Unit> {
        val value = this.visit(ctx!!.expression())

        throw ReturnTermination(value.value)
    }

    override fun visitIntegerExpression(ctx: RequestScriptParser.IntegerExpressionContext?): WrappedValue<Int> {
        return WrappedValue(ctx!!.INTEGER().text.toInt())
    }

    override fun visitIdentifier(ctx: RequestScriptParser.IdentifierContext?): WrappedValue<Any?> {
        return WrappedValue(scope.variables[ctx!!.IDENTIFIER().text]!!.value)
    }

    override fun visitFunctionCallExpression(ctx: RequestScriptParser.FunctionCallExpressionContext?): WrappedValue<*> {
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
        ctx: RequestScriptParser.FunctionCallParamsContext?
    ): WrappedValue<Map<String, Any?>> {
        val namedParams = mutableMapOf<String, Any?>()

        ctx!!.functionCallParam().forEach {
            val param = this.visitFunctionCallParam(it).value!!
            namedParams[param.first] = param.second
        }

        return WrappedValue(namedParams)
    }

    override fun visitFunctionCallParam(
        ctx: RequestScriptParser.FunctionCallParamContext?
    ): WrappedValue<Pair<String, Any?>> {
        return WrappedValue(Pair(ctx!!.IDENTIFIER().text, this.visit(ctx.expression()).value))
    }
}
