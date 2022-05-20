package org.merideum.kotlin.merit.interpreter.error

class VariableAlreadyDeclaredException(identifier: String): RuntimeException("The identifier '$identifier' has already been declared.")
