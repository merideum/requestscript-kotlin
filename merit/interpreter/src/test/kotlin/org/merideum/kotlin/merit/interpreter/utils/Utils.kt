package org.merideum.kotlin.merit.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.visitors.ScriptVisitor
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

fun executeCode(
  code: String,
  variableScope: VariableScope = VariableScope(null, mutableMapOf()),
  outputContainer: OutputContainer = OutputContainer.empty(),
  resourceResolver: ResourceResolver = object: ResourceResolver {
    override fun resolve(name: String): Resource<*>? {
      return null
    }

    override fun resolve(name: String, path: String): Resource<*>? {
      return null
    }
  }
): OutputContainer {
  val lexer = MeritLexer(CharStreams.fromString(code))
  val parser = MeritParser(CommonTokenStream(lexer))

  parser.buildParseTree = true

  val parseTree = parser.parse()

  val visitor = ScriptVisitor(variableScope, outputContainer, resourceResolver)

  visitor.visit(parseTree)

  return outputContainer
}
