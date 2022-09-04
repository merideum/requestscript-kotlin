package org.merideum.core.api.executor

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.ReturnTermination
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.execution.ScriptExecutionResult
import org.merideum.core.interpreter.execution.ScriptExecutor
import org.merideum.core.interpreter.visitors.ScriptVisitor

class SimpleScriptExecutor(val resourceResolver: ResourceResolver): ScriptExecutor {

  private fun lexer(code: String) = MerideumLexer(CharStreams.fromString(code))

  private fun parse(code: String) =
    MerideumParser(CommonTokenStream(lexer(code))).apply {
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
