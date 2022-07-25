package org.merideum.kotlin.merit.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.execution.MeritExecutionResult
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.ReturnTermination
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.visitors.ScriptVisitor
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

fun executeCode(
  code: String,
  variableScope: VariableScope = VariableScope(null, mutableMapOf()),
  resourceResolver: ResourceResolver = object: ResourceResolver {
    override fun resolve(name: String): Resource<*>? {
      return null
    }

    override fun resolve(name: String, path: String): Resource<*>? {
      return null
    }
  }
): MeritExecutionResult {
  val lexer = MeritLexer(CharStreams.fromString(code))
  val parser = MeritParser(CommonTokenStream(lexer))

  parser.buildParseTree = true

  val parseTree = parser.parse()

  val visitor = ScriptVisitor(variableScope, resourceResolver, ScriptContext())

  val returnValue: Map<String, Any?>? = try {
    visitor.visit(parseTree)

    null
  } catch(rt: ReturnTermination) {
    rt.value
  }

  return MeritExecutionResult(returnValue)
}
