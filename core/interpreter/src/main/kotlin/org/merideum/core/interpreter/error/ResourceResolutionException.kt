package org.merideum.core.interpreter.error

import org.antlr.v4.runtime.ParserRuleContext

class ResourceResolutionException(
    resourceName: String,
    ctx: ParserRuleContext
) : ScriptRuntimeException(
    "Could not resolve resource: $resourceName",
    ScriptErrorType.RESOURCE,
    ctx.start.line,
    ctx.start.charPositionInLine
)
