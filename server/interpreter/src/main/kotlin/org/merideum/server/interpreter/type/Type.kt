package org.merideum.server.interpreter.type

import org.merideum.server.interpreter.VariableScope
import org.merideum.server.interpreter.type.list.IntListValue
import org.merideum.server.interpreter.type.list.ObjectListValue
import org.merideum.server.interpreter.type.list.StringListValue

/**
 * This enum class represents the type system in Merideum.
 * Since variables can be declared without assignment,
 * this enum is needed to tell the Variable Scope what type T will be.
 *
 * @param declarationKey the key of the type inside a Merideum type declaration.
 */
// TODO check these casts
enum class Type(val declarationKey: String) {
  INT("int") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<IntValue>(name, INT)
    }

    override fun newValue(value: Any?): TypedValue<*> {
      return IntValue(value as Int?)
    }

    override fun listType(): Type {
      return LIST_INT
    }

    override fun innerType(): Type? {
      return null
    }
  },
  STRING("string") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<StringValue>(name, STRING)
    }

    override fun newValue(value: Any?): TypedValue<*> {
      return StringValue(value as String?)
    }

    override fun listType(): Type {
      return LIST_STRING
    }

    override fun innerType(): Type? {
      return null
    }
  },
  OBJECT("object") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<ObjectValue>(name, OBJECT)
    }

    override fun newValue(value: Any?): TypedValue<*> {
      return if (value is MutableMap<*, *>) {
        ObjectValue(value as MutableMap<String, TypedValue<*>>?)
      } else if (value is ObjectValue) {
        value
      } else {
        // TODO throw better exception
        throw RuntimeException("Could not create new object from value")
      }
    }

    override fun listType(): Type {
      return LIST_OBJECT
    }

    override fun innerType(): Type? {
      return null
    }
  },
  LIST_INT("[int]") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<IntListValue>(name, LIST_INT)
    }

    override fun newValue(value: Any?): TypedValue<*> {
      return IntListValue(value as List<IntValue>)
    }

    override fun listType(): Type? {
      return null
    }

    override fun innerType(): Type {
      return INT
    }
  },
  LIST_STRING("[string]") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<StringListValue>(name, LIST_STRING)
    }

    override fun newValue(value: Any?): TypedValue<*> {
      return StringListValue(value as List<StringValue>)
    }

    override fun listType(): Type? {
      return null
    }

    override fun innerType(): Type {
      return STRING
    }
  },
  LIST_OBJECT("[object]") {
    override fun declareVariable(scope: VariableScope, name: String) {
      scope.declareVariable<ObjectListValue>(name, LIST_OBJECT)
    }

    override fun newValue(value: Any?): TypedValue<*> {
      return ObjectListValue(value as List<ObjectValue>)
    }

    override fun listType(): Type? {
      return null
    }

    override fun innerType(): Type {
      return OBJECT
    }
  },
  // Resources are declared without a type declaration.
  RESOURCE("") {
    override fun declareVariable(scope: VariableScope, name: String) {
      throw RuntimeException("Cannot declare a resource without assigning a value.")
    }

    override fun newValue(value: Any?): TypedValue<*> {
      throw RuntimeException("Cannot declare a resource without assigning a value.")
    }

    override fun listType(): Type? {
      return null
    }

    override fun innerType(): Type? {
      return null
    }
  };

  abstract fun declareVariable(scope: VariableScope, name: String)

  abstract fun newValue(value: Any?): TypedValue<*>

  // Get the corresponding list type for the type
  abstract fun listType(): Type?
  abstract fun innerType(): Type?

  fun typeName() = this.name.lowercase()

  companion object {
    fun fromDeclaration(key: String) = values().single { it.declarationKey == key }

  }
}
