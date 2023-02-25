package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumBaseVisitor
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.FunctionCallAttributes
import org.merideum.core.interpreter.Modifier
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.type.BuiltInTypes
import org.merideum.core.interpreter.type.MerideumTypedValue
import org.merideum.core.interpreter.type.TypeRegistry
import org.merideum.core.interpreter.type.wrap
import org.merideum.core.interpreter.wrap
import java.lang.RuntimeException

class RequestVisitor(
    private val typeRegistry: TypeRegistry,
    private val variableScope: VariableScope
): MerideumBaseVisitor<WrappedValue<*>>() {

    override fun visitVariableDeclarationAssignment(ctx: MerideumParser.VariableDeclarationAssignmentContext?): WrappedValue<*> {
        if (ctx == null) throw RuntimeException("Syntax error in variable declaration")

        val modifier = ctx.modifier().text

        val identifier = ctx.IDENTIFIER().text

        val variableValue = visit(ctx.expression()).value as MerideumTypedValue

        if (ctx.typeDeclaration() != null) {
            val declaredType = visitTypeDeclaration(ctx.typeDeclaration()).value!!

            if (variableValue.type.name != declaredType) throw RuntimeException("Declared type does not match expression value")
        }

        variableScope.declareAndAssignVariable(identifier, variableValue, Modifier.fromKeyword(modifier))

        return WrappedValue.nothing()
    }

    override fun visitVariableAssignment(ctx: MerideumParser.VariableAssignmentContext?): WrappedValue<*> {
        if (ctx == null) throw RuntimeException("Syntax error in variable assignment")

        val identifier = ctx.IDENTIFIER().text

        val resolvedVariable = variableScope.resolveVariable(identifier) ?: throw RuntimeException("Variable '$identifier' has not been declared")

        val variableValue = visit(ctx.expression()).value as MerideumTypedValue

        if (variableValue.type.name != resolvedVariable.value.type.name) throw RuntimeException("Cannot assign value to variable of different type.")

        variableScope.reassignVariable(identifier, variableValue)

        return WrappedValue.nothing()
    }

    override fun visitTypeDeclaration(ctx: MerideumParser.TypeDeclarationContext?): WrappedValue<String> {
        if (ctx == null) throw RuntimeException("Syntax error in variable declaration")

        return WrappedValue(ctx.TYPE().text)
    }

    override fun visitInt(ctx: MerideumParser.IntContext?): WrappedValue<MerideumTypedValue> {
        if (ctx == null) throw RuntimeException("Syntax error in 'int' expression")

        val intType = typeRegistry.get("int")!!

        return MerideumTypedValue(intType, ctx.INT().text.toInt()).wrap()
    }

    override fun visitString(ctx: MerideumParser.StringContext?): WrappedValue<*> {
        if (ctx == null) throw RuntimeException("Syntax error in 'string' expression")

        val stringValue = ctx.stringContents().joinToString("") {
            visit(it).value as String
        }

        return WrappedValue(MerideumTypedValue(typeRegistry.get(BuiltInTypes.STRING.keyword)!!, stringValue))
    }

    override fun visitText(ctx: MerideumParser.TextContext?): WrappedValue<String> {
        if (ctx == null) throw RuntimeException("Syntax error in ' tring' expression")

        return WrappedValue(ctx.TEXT().text)
    }

    override fun visitEmbeddedIdentifier(ctx: MerideumParser.EmbeddedIdentifierContext?): WrappedValue<String> {
        if (ctx == null) throw RuntimeException("Syntax error in 'embedded string' expression")

        val identifier = ctx.IDENTIFIER().text

        val variable = variableScope.resolveVariable(identifier)
            ?: throw RuntimeException("Variable not found for identifier '$identifier")

        return WrappedValue(variable.value.toString())
    }

    override fun visitIdentifier(ctx: MerideumParser.IdentifierContext?): WrappedValue<MerideumTypedValue> {
        if (ctx == null) throw RuntimeException("Syntax error in 'identifier' expression")

        val identifier = ctx.IDENTIFIER().text

        val variable = variableScope.resolveVariable(identifier)
            ?: throw RuntimeException("Variable not found for identifier '$identifier'")

        return variable.value.wrap()
    }

    override fun visitFunction(ctx: MerideumParser.FunctionContext?): WrappedValue<MerideumTypedValue> {
        if (ctx == null) throw RuntimeException("Syntax error in 'function call' expression")

        val caller = visit(ctx.expression()).value

        if (caller !is MerideumTypedValue) throw RuntimeException("Cannot call function of expression")

        val functionCallAttributes = visitFunctionCall(ctx.functionCall()).value!!

        // Call the function
        val functionResultValue = if (caller.type.name != "resource") {
            val function = caller.type.functions[functionCallAttributes.name]
                ?: throw RuntimeException("Function '${functionCallAttributes.name} not found for ${caller.type.name}")
            function.invoke(functionCallAttributes.parameters)
        } else throw RuntimeException("Resource function calls are not yet supported")

        return functionResultValue.wrap()
    }

    override fun visitFunctionCall(ctx: MerideumParser.FunctionCallContext?): WrappedValue<FunctionCallAttributes> {
        if (ctx == null) throw RuntimeException("Syntax error in 'function call' expression")

        val functionName = ctx.IDENTIFIER().text

        val parameters = if (ctx.functionParameters() == null) {
            emptyMap()
        } else visitFunctionParameters(ctx.functionParameters()).value!!

        return FunctionCallAttributes(functionName, parameters).wrap()
    }

    override fun visitFunctionParameters(ctx: MerideumParser.FunctionParametersContext?): WrappedValue<Map<String, MerideumTypedValue>> {
        if (ctx == null) throw RuntimeException("Syntax error in 'function parameters'")

        val parameters = mutableMapOf<String, MerideumTypedValue>()

        ctx.functionParameter().forEach {
            if (it.functionVariableParameter() != null) {
                parameters[it.functionVariableParameter().text]
            } else {
                val (name, value) = visitFunctionNamedParameter(it.functionNamedParameter()).value!!

                parameters[name] = value
            }
        }

        return WrappedValue(parameters)
    }

    override fun visitFunctionNamedParameter(ctx: MerideumParser.FunctionNamedParameterContext?): WrappedValue<Pair<String, MerideumTypedValue>> {
        if (ctx == null) throw RuntimeException("Syntax error in 'function parameter'")

        return WrappedValue(ctx.IDENTIFIER().text to (visit(ctx.expression()).value as MerideumTypedValue))
    }
}
