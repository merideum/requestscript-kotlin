package org.merideum.core.interpreter.error

import org.antlr.v4.runtime.ParserRuleContext
import org.merideum.core.interpreter.type.Type

class TypeMismatchedException(
    val firstType: Type,
    val otherType: Type,
    ctx: ParserRuleContext
) : ScriptRuntimeException(
    "Cannot perform operation between types '${firstType.typeName()}' and '${otherType.typeName()}'",
    ScriptErrorType.TYPE_MISMATCH,
    ctx.start.line,
    ctx.start.charPositionInLine
)
