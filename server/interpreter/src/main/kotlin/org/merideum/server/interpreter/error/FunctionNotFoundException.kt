package org.merideum.server.interpreter.error

class FunctionNotFoundException(functionName: String): RuntimeException("Could not call function with name $functionName")
