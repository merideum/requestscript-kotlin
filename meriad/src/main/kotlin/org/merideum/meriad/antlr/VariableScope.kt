package org.merideum.meriad.antlr

data class VariableScope(
  val parent: VariableScope?,
  val variables: MutableMap<String, MeriadValue>
) {

  /**
   * See if the variable exists in the current scope by its name.
   *
   * TODO: search the parent too.
   */
  fun resolveVariable(name: String) = variables[name]

  fun assignVariable(name: String, value: MeriadValue) {
    val resolved = resolveVariable(name)
    if (resolved == null) {
      variables[name] = value
    } else {
      if (resolved.mutability == Mutability.MUTABLE) {
        resolved.value = value.value
      }
      // TODO: throw error if variable is not mutable.
    }
  }
}
