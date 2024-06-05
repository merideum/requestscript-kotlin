package org.requestscript.core.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.requestscript.antlr.RequestScriptLexer
import org.requestscript.antlr.RequestScriptParser
import org.requestscript.core.interpreter.ResourceResolver
import org.requestscript.core.interpreter.VariableScope
import org.requestscript.core.interpreter.error.ReturnTermination
import org.requestscript.core.interpreter.visitors.ScriptVisitor
import org.requestscript.core.interpreter.visitors.SimpleResourceResolver

fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(mutableMapOf()),
    resourceResolver: ResourceResolver = SimpleResourceResolver(mapOf())
): Any? {
    val lexer = RequestScriptLexer(CharStreams.fromString(code))
    val parser = RequestScriptParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.parse()

    val visitor = ScriptVisitor(variableScope, resourceResolver)

    try {
        visitor.visit(parseTree)
    } catch (rt: ReturnTermination) {
        return rt.value
    }

    return null
}
