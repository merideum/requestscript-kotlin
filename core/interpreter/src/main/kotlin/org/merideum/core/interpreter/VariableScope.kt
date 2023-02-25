package org.merideum.core.interpreter

import org.merideum.core.interpreter.error.VariableCannotBeAssignedException
import org.merideum.core.interpreter.error.TypeMismatchedException
import org.merideum.core.interpreter.type.MerideumTypedValue
import org.merideum.core.interpreter.type.MerideumVariable

/**
 * Contains variables with a scope.
 */
data class VariableScope(
    val parent: VariableScope?,
    val variables: MutableMap<String, MerideumVariable>
) {
    fun hasVariable(name: String) = variables.contains(name)

    /**
     * See if the variable exists in the current scope by its name.
     */
    fun resolveVariable(name: String) = variables[name]

    fun declareAndAssignVariable(name: String, value: MerideumTypedValue, modifier: Modifier) {
        variables[name] = MerideumVariable(modifier, value)
    }

    fun reassignVariable(name: String, newValue: MerideumTypedValue) {
        // TODO throw error if it cannot be resolved because cannot reassign a variable that does not exist.
        val resolved = resolveVariable(name) ?: return

        // Cannot reassign a constant variable.
        if (resolved.modifier == Modifier.CONST) throw VariableCannotBeAssignedException(name)

        if (newValue.type != resolved.value.type) throw TypeMismatchedException(resolved.value.type, newValue.type)

        variables[name] = MerideumVariable(resolved.modifier, newValue)
    }

    companion object {
        fun main() = VariableScope(null, mutableMapOf())
    }
}
