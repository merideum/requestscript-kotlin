package org.merideum.core.interpreter.error

class FunctionNotFoundException(
    functionName: String,
    lineNumber: Int,
    linePosition: Int
) : ScriptRuntimeException(
    "Could not call function with name $functionName",
    ScriptErrorType.FUNCTION,
    lineNumber,
    linePosition
)
