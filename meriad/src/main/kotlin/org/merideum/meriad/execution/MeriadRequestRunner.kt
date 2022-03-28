package org.merideum.meriad.execution

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.meriad.MeriadLexer
import org.merideum.meriad.MeriadParser
import org.merideum.meriad.antlr.VariableScope
import org.merideum.meriad.antlr.visitors.MeriadVisitor

class MeriadRequestRunner: MeriadRunner {

  private fun lexer(code: String) = MeriadLexer(CharStreams.fromString(code))

  private fun parse(code: String) =
    MeriadParser(CommonTokenStream(lexer(code))).apply {
      buildParseTree = true
    }.parse()

  override fun execute(code: String): MeriadExecutionResult {
    val parseTree: ParseTree = parse(code)
    val mainScope = VariableScope.main()
    val outputContainer = OutputContainer(mutableMapOf())
    val visitor = MeriadVisitor(mainScope, outputContainer)

    visitor.visit(parseTree)

    return MeriadExecutionResult(outputContainer.output())
  }
}
