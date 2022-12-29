package org.merideum.core.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.ReturnTermination
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.visitors.ScriptVisitor

fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(null, mutableMapOf()),
    resourceResolver: ResourceResolver = object : ResourceResolver {
        override fun resolve(name: String): Resource<*>? {
            return null
        }

        override fun resolve(name: String, path: String): Resource<*>? {
            return null
        }
    },
    context: ScriptContext = ScriptContext()
): ScriptExecutionResult {
    val lexer = MerideumLexer(CharStreams.fromString(code))
    val parser = MerideumParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.parse()

    val visitor = ScriptVisitor(variableScope, resourceResolver, context)

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
