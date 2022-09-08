package org.merideum.core.interpreter

import org.antlr.v4.runtime.ParserRuleContext
import org.merideum.core.interpreter.type.TypedValue

class FunctionCallContext(
    val functionName: String,
    val parameters: List<TypedValue<*>>,
    val scriptContext: ScriptContext,
    ctx: ParserRuleContext
) {
    val lineNumber = ctx.start.line
    val linePosition = ctx.start.charPositionInLine
}
