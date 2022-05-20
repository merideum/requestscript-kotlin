package org.merideum.ktor.server.executor

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.kotlin.merit.execution.MeritExecutionResult
import org.merideum.kotlin.merit.execution.MeritExecutor
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.Dependency
import org.merideum.kotlin.merit.interpreter.DependencyResolver
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
    val dependencyResolver = object : DependencyResolver {
      override fun resolve(name: String): Dependency {
        return SimpleDependency()
      }

      override fun resolve(name: String, path: String): Dependency? {
        return SimpleDependency()
      }
    }
    val visitor = MeritVisitor(mainScope, outputContainer, dependencyResolver)

    visitor.visit(parseTree)

    return MeritExecutionResult(outputContainer.output())
  }
}
