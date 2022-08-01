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
  OBJECT("object") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<ObjectValue>(name, OBJECT)
    }
  },
  LIST("list") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<ListValue>(name, LIST)
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

    @Suppress("UNCHECKED_CAST")
    fun wrap(value: Any?): TypedValue<*> {
      return when (value) {
        is String -> {
          StringValue(value)
        }
        is Int -> {
          IntValue(value)
        }
        is MutableMap<*, *> -> {
          ObjectValue(value as? MutableMap<String, Any?>)
        }
        else -> {
          throw RuntimeException("Could not retrieve field value")
        }
      }
    }
  }
}
