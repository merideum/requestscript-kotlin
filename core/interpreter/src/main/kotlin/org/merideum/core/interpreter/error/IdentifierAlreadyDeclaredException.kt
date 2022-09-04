package org.merideum.core.interpreter.error

class IdentifierAlreadyDeclaredException(identifier: String): RuntimeException("The identifier '$identifier' has already been declared.")
