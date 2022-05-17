package org.merideum.kotlin.merit.interpreter

/**
 * Contains variables with a scope.
 */
data class VariableScope(
  val parent: VariableScope?,
  val variables: MutableMap<String, Variable>
) {

  /**
   * See if the variable exists in the current scope by its name.
   *
   * TODO: search the parent too.
   */
  fun resolveVariable(name: String) = variables[name]

  fun assignVariable(name: String, meritValue: MeritValue, modifier: Modifier?) {

    if (modifier == null) {
      // If the modifier is null, then we assume the code is trying to assign a variable that was already declared.
      // TODO: throw an error if the variable did not resolve (and is therefore not declared)
      val resolved = resolveVariable(name) ?: return

      if (resolved.modifier == Modifier.VAR) {
        resolved.value = meritValue.value
      } // TODO: else throw error
    } else {
      // Since the mutability parameter is not null, the variable is being declared.

      // const variables cannot be declared without an assignment.
      // If the value is Unit then has been declared without an assignment.
      // TODO: throw error if a 'const' variable has been declared without an assignment.
      if ((modifier == Modifier.CONST && meritValue.value != Unit) || modifier == Modifier.VAR) {
        variables[name] = Variable(name, meritValue.value, modifier)
      }
    }
  }

  companion object {
    fun main() = VariableScope(null, mutableMapOf())
  }
}
