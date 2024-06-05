package org.requestscript.core.api

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.requestscript.antlr.RequestScriptLexer
import org.requestscript.antlr.RequestScriptParser
import org.requestscript.core.interpreter.ResourceResolver
import org.requestscript.core.interpreter.VariableScope
import org.requestscript.core.interpreter.error.ReturnTermination
import org.requestscript.core.interpreter.visitors.ScriptVisitor

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

    private fun lexer(code: String) = RequestScriptLexer(CharStreams.fromString(code))

    private fun parse(code: String) =
        RequestScriptParser(CommonTokenStream(lexer(code))).apply {
            buildParseTree = true
        }.parse()
}
