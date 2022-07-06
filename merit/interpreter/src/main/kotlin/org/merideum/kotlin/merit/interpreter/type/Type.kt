package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.VariableScope

/**
 * This enum class represents the type system in Merit.
 * Since variables can be declared without assignment,
 * this enum is needed to tell the Variable Scope what type T will be.
 *
 * @param declarationKey the key of the type inside a Merit type declaration.
 */
enum class Type(val declarationKey: String) {
  INT("int") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<IntValue>(name, INT)
    }
  },
  STRING("string") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<StringValue>(name, STRING)
    }
  },
  // Resources are declared without a type declaration.
  RESOURCE("") {
    override fun declareVariable(scope: VariableScope, name: String) {
      throw Exception("Cannot declare a resource without assigning a value.")
    }
  };

  abstract fun declareVariable(scope: VariableScope, name: String)

  fun typeName() = this.name.lowercase()

  companion object {
    fun fromDeclaration(key: String) = values().first { it.declarationKey == key }
  }
}
