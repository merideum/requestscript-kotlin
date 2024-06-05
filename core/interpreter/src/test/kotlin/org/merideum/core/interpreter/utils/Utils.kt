package org.merideum.core.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.error.ReturnTermination
import org.merideum.core.interpreter.visitors.ScriptVisitor
import org.merideum.core.interpreter.visitors.SimpleResourceResolver

fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(mutableMapOf()),
    resourceResolver: ResourceResolver = SimpleResourceResolver(mapOf())
): Any? {
    val lexer = MerideumLexer(CharStreams.fromString(code))
    val parser = MerideumParser(CommonTokenStream(lexer))

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
