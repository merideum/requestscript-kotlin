package org.merideum.kotlin.merit.execution

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.visitors.MeritVisitor
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

class SimpleMeritExecutor: MeritExecutor {

  private fun lexer(code: String) = MeritLexer(CharStreams.fromString(code))

  private fun parse(code: String) =
    MeritParser(CommonTokenStream(lexer(code))).apply {
      buildParseTree = true
    }.parse()

  override fun execute(code: String): MeritExecutionResult {
    val parseTree: ParseTree = parse(code)
    val mainScope = VariableScope.main()
    val outputContainer = OutputContainer(mutableMapOf())
    val visitor = MeritVisitor(mainScope, outputContainer)

    visitor.visit(parseTree)

    return MeritExecutionResult(outputContainer.output())
  }
}