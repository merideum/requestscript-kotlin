package org.merideum.server.api.executor

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser
import org.merideum.server.interpreter.ScriptContext
import org.merideum.server.execution.ScriptExecutionResult
import org.merideum.server.execution.ScriptExecutor
import org.merideum.server.interpreter.ResourceResolver
import org.merideum.server.interpreter.ReturnTermination
import org.merideum.server.interpreter.VariableScope
import org.merideum.server.interpreter.visitors.ScriptVisitor

class SimpleScriptExecutor(val resourceResolver: ResourceResolver): ScriptExecutor {

  private fun lexer(code: String) = MeritLexer(CharStreams.fromString(code))

  private fun parse(code: String) =
    MeritParser(CommonTokenStream(lexer(code))).apply {
      buildParseTree = true
    }.parse()

  override fun execute(code: String, context: ScriptContext): ScriptExecutionResult {
    val parseTree: ParseTree = parse(code)

    val mainScope = VariableScope
      .main()
      .apply {
        addRequest(Request(mapOf()))
      }


    val visitor = ScriptVisitor(mainScope, resourceResolver, context)

    val returnValue: Map<String, Any?>? = try {
      visitor.visit(parseTree)

      null
    } catch(rt: ReturnTermination) {
      rt.value
    }


    return ScriptExecutionResult(returnValue)
  }
}
