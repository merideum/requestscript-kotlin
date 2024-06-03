package org.merideum.core.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.visitors.ScriptVisitor

fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(mutableMapOf()),
    resourceResolver: ResourceResolver = ResourceResolver(mapOf())
): Any? {
    val lexer = MerideumLexer(CharStreams.fromString(code))
    val parser = MerideumParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.parse()

    val visitor = ScriptVisitor(variableScope, resourceResolver)

    visitor.visit(parseTree)

    return visitor.returnValue
}
