package org.merideum.core.interpreter.error

class VariableCannotBeAssignedException(identifier: String) :
    ScriptRuntimeException("The variable '$identifier' cannot be reassigned.", ScriptErrorType.VARIABLE)
