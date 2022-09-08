package org.merideum.core.interpreter.error

import org.antlr.v4.runtime.ParserRuleContext

class IdentifierAlreadyDeclaredException(
    identifier: String,
    ctx: ParserRuleContext
) :
    ScriptRuntimeException(
        "The identifier '$identifier' has already been declared.",
        ScriptErrorType.VARIABLE,
        ctx.start.line,
        ctx.start.charPositionInLine
    )
