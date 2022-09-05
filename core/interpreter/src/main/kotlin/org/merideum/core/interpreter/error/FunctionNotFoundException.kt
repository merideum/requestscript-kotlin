package org.merideum.core.interpreter.error

class FunctionNotFoundException(functionName: String): ScriptRuntimeException("Could not call function with name $functionName")
