package org.merideum.kotlin.merit.interpreter

import org.merideum.kotlin.merit.interpreter.error.IdentifierAlreadyDeclaredException
import org.merideum.kotlin.merit.interpreter.error.TypeMismatchedException
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue

/**
 * Contains variables with a scope.
 */
data class VariableScope(
  val parent: VariableScope?,
  val variables: MutableMap<String, Variable<*>>
) {

  /**
   * See if the variable exists in the current scope by its name.
   *
   * TODO: search the parent too.
   */
  fun resolveVariable(name: String) = variables[name]

  fun <T: TypedValue<*>> declareVariable(name: String, type: Type) {
    val resolved = resolveVariable(name)

    // TODO throw exception because a variable should not be redeclared
    if (resolved != null) return

    variables[name] = Variable<T>(name, null, Modifier.VAR, type)
  }

  fun declareAndAssignVariable(name: String, value: TypedValue<*>, modifier: Modifier) {
    val resolved = resolveVariable(name)

    if (resolved != null) throw IdentifierAlreadyDeclaredException(name)

    variables[name] = Variable(name, value, modifier, value.type)
  }

  fun reassignVariable(name: String, newValue: TypedValue<*>) {
    // TODO throw error if it cannot be resolved because cannot reassign a variable that does not exist.
    val resolved = resolveVariable(name) ?: return

    // Cannot reassign a constant variable.
    if (resolved.modifier == Modifier.CONST) throw IdentifierAlreadyDeclaredException(name)
    
    if (newValue.type != resolved.type) throw TypeMismatchedException(resolved.type, newValue.type)

    variables[name] = Variable(name, newValue, resolved.modifier, resolved.type)
  }

  companion object {
    fun main() = VariableScope(null, mutableMapOf())
  }
}
