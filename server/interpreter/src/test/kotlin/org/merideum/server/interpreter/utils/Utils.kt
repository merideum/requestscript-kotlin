package org.merideum.server.interpreter.utils

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.server.interpreter.execution.ScriptExecutionResult
import org.merideum.server.interpreter.Resource
import org.merideum.server.interpreter.ResourceResolver
import org.merideum.server.interpreter.ReturnTermination
import org.merideum.server.interpreter.ScriptContext
import org.merideum.server.interpreter.VariableScope
import org.merideum.server.interpreter.visitors.ScriptVisitor

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
): ScriptExecutionResult {
  val lexer = MerideumLexer(CharStreams.fromString(code))
  val parser = MerideumParser(CommonTokenStream(lexer))

  parser.buildParseTree = true

  val parseTree = parser.parse()

  val visitor = ScriptVisitor(variableScope, resourceResolver, ScriptContext())

  val returnValue: Map<String, Any?>? = try {
    visitor.visit(parseTree)

    null
  } catch(rt: ReturnTermination) {
    rt.value
  }

  return ScriptExecutionResult(returnValue)
}
