package org.merideum.core.interpreter.error

import org.antlr.v4.runtime.ParserRuleContext

class UnknownVariableIdentifierException(
    identifier: String,
    ctx: ParserRuleContext
) : ScriptRuntimeException(
    "A variable with the identifier '$identifier' does not exist or cannot be accessed.",
    ScriptErrorType.VARIABLE,
    ctx.start.line,
    ctx.start.charPositionInLine
)
