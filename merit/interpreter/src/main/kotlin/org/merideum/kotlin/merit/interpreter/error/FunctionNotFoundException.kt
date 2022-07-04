package org.merideum.kotlin.merit.interpreter.error

class FunctionNotFoundException(functionName: String): RuntimeException("Could not call function with name $functionName")
