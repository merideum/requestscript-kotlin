package org.merideum.core.api

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.antlr.MerideumLexer
import org.merideum.antlr.MerideumParser
import org.merideum.core.api.error.ErrorsContainer
import org.merideum.core.api.execution.ScriptExecutionResult
import org.merideum.core.api.execution.ScriptExecutor
import org.merideum.core.interpreter.ReturnTermination
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.error.ScriptRuntimeException
import org.merideum.core.interpreter.error.ScriptSyntaxException
import org.merideum.core.interpreter.type.TypeRegistry
import org.merideum.core.interpreter.type.builtInTypes
import org.merideum.core.interpreter.visitors.RequestVisitor

class SimpleScriptExecutor() : ScriptExecutor {

    override fun execute(code: String, context: ScriptContext): ScriptExecutionResult {
        val parseTree: ParseTree = parse(code)

        val mainScope = VariableScope
            .main()
            .apply {
//                addRequest(Request(mapOf()))
            }

        val visitor = RequestVisitor(TypeRegistry(builtInTypes()), mainScope)

        return try {
            visitor.visit(parseTree)

            ScriptExecutionResult(context.scriptName!!, null)
        } catch (rt: ReturnTermination) {
            ScriptExecutionResult(context.scriptName!!, rt.value)
        } catch (e: ScriptRuntimeException) {
            ScriptExecutionResult(context.scriptName!!, null, ErrorsContainer(e, null))
        } catch (e: ScriptSyntaxException) {
            ScriptExecutionResult(context.scriptName!!, null, ErrorsContainer(null, e))
        }
    }

    private fun lexer(code: String) = MerideumLexer(CharStreams.fromString(code))

    private fun parse(code: String) =
        MerideumParser(CommonTokenStream(lexer(code))).apply {
            buildParseTree = true
        }.request()
}
