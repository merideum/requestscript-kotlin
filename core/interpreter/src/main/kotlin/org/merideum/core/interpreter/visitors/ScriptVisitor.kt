@file:Suppress("TooManyFunctions")

package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumBaseVisitor
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.*

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
        val resourcePath = ctx.RESOURCE_PATH().text

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
        val value = this.visitExpression(ctx!!.expression())

        returnValue = value.value

        return WrappedValue.nothing()
    }

    override fun visitIntegerExpression(ctx: MerideumParser.IntegerExpressionContext?): WrappedValue<Int> {
        return WrappedValue(ctx!!.INTEGER().text.toInt())
    }
}
