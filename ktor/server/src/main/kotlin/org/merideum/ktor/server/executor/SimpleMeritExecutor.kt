package org.merideum.ktor.server.executor

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.execution.MeritExecutionResult
import org.merideum.kotlin.merit.execution.MeritExecutor
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.ReturnTermination
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.visitors.ScriptVisitor
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

// TODO move into merit interpreter
class SimpleMeritExecutor(val resourceResolver: ResourceResolver): MeritExecutor {

  private fun lexer(code: String) = MeritLexer(CharStreams.fromString(code))

  private fun parse(code: String) =
    MeritParser(CommonTokenStream(lexer(code))).apply {
      buildParseTree = true
    }.parse()

  override fun execute(code: String, context: ScriptContext): MeritExecutionResult {
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


    return MeritExecutionResult(returnValue)
  }
}
