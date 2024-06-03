package org.merideum.core.interpreter

data class VariableScope(
    val variables: MutableMap<String, Variable>,
) {
    fun declareVariable(variable: Variable) {
        if (variables[variable.identifier] != null) return

        variables[variable.identifier] = variable
    }
}

data class Variable(
    val identifier: String,
    val value: Any?,
    val type: VariableType,
)

enum class VariableType {
    CONST,
    VAR,
    RESOURCE,
}
