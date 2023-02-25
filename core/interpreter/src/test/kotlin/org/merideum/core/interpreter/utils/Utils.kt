package org.merideum.core.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.ReturnTermination
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.type.TypeRegistry
import org.merideum.core.interpreter.type.builtInTypes
import org.merideum.core.interpreter.visitors.RequestVisitor

fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(null, mutableMapOf()),
    context: ScriptContext = ScriptContext()
): ScriptExecutionResult {
    val lexer = MerideumLexer(CharStreams.fromString(code))
    val parser = MerideumParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.request()

    val visitor = RequestVisitor(TypeRegistry(builtInTypes()), variableScope)

    val returnValue: Any? = try {
        visitor.visit(parseTree)

        null
    } catch (rt: ReturnTermination) {
        rt.value
    }

    return ScriptExecutionResult(returnValue)
}

data class ScriptExecutionResult(
    val returnValue: Any?
)
