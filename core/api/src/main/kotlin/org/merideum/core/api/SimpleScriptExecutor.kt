package org.merideum.core.api

//class SimpleScriptExecutor(private val resourceResolver: ResourceResolver) : ScriptExecutor {
//
//    override fun execute(code: String, context: ScriptContext): ScriptExecutionResult {
//        val parseTree: ParseTree = parse(code)
//
//        val mainScope = VariableScope
//            .main()
//            .apply {
//                addRequest(Request(mapOf()))
//            }
//
//        val visitor = ScriptVisitor(mainScope, resourceResolver, context)
//
//        return try {
//            visitor.visit(parseTree)
//
//            ScriptExecutionResult(context.scriptName!!, null)
//        } catch (rt: ReturnTermination) {
//            ScriptExecutionResult(context.scriptName!!, rt.value)
//        } catch (e: ScriptRuntimeException) {
//            ScriptExecutionResult(context.scriptName!!, null, ErrorsContainer(e, null))
//        } catch (e: ScriptSyntaxException) {
//            ScriptExecutionResult(context.scriptName!!, null, ErrorsContainer(null, e))
//        }
//    }
//
//    private fun lexer(code: String) = MerideumLexer(CharStreams.fromString(code))
//
//    private fun parse(code: String) =
//        MerideumParser(CommonTokenStream(lexer(code))).apply {
//            buildParseTree = true
//        }.parse()
//}
