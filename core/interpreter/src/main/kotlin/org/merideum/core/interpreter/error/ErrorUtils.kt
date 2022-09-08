package org.merideum.core.interpreter.error

import org.antlr.v4.runtime.ParserRuleContext

fun syntaxError(message: String, type: ScriptErrorType, parserContext: ParserRuleContext): ScriptSyntaxException {
    return ScriptSyntaxException(
        message,
        type,
        parserContext.start.line,
        parserContext.start.charPositionInLine
    )
}
