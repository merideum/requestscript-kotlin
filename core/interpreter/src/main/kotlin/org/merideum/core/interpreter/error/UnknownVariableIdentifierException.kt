package org.merideum.core.interpreter.error

class UnknownVariableIdentifierException(identifier: String): ScriptRuntimeException("A variable with the identifier '$identifier' does not exist or cannot be accessed.", RuntimeErrorType.IDENTIFIER)
