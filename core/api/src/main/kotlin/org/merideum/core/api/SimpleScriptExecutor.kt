package org.merideum.core.api

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.error.ReturnTermination
import org.merideum.core.interpreter.visitors.ScriptVisitor

class SimpleScriptExecutor(private val resourceResolver: ResourceResolver) {

    fun execute(code: String): ScriptExecutionResult {
        val parseTree: ParseTree = parse(code)

        val mainScope = VariableScope(mutableMapOf())

        val visitor = ScriptVisitor(mainScope, resourceResolver)

        return try {
            visitor.visit(parseTree)

            ScriptExecutionResult(null)
        } catch (rt: ReturnTermination) {
            ScriptExecutionResult(rt.value)
        }
    }

    private fun lexer(code: String) = MerideumLexer(CharStreams.fromString(code))

    private fun parse(code: String) =
        MerideumParser(CommonTokenStream(lexer(code))).apply {
            buildParseTree = true
        }.parse()
}
