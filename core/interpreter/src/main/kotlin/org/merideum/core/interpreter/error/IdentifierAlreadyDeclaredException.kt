package org.merideum.core.interpreter.error

class IdentifierAlreadyDeclaredException(identifier: String): ScriptRuntimeException("The identifier '$identifier' has already been declared.")
