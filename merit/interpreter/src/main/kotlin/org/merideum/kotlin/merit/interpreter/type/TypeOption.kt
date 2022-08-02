package org.merideum.kotlin.merit.interpreter.type

/**
 * @property declarationKey not used on types with an inner type.
 */
enum class TypeOption(val declarationKey: String?) {
  INT("int"),
  LIST(null),
  OBJECT("object"),
  RESOURCE(null),
  STRING("string");

  fun typeName() = name.lowercase()

  companion object {
    fun fromKey(declarationKey: String) = values().firstOrNull {
      it.declarationKey != null && it.declarationKey == declarationKey
    }
      // Throw better exception.
      ?: throw RuntimeException("Type of $declarationKey not available.")
  }
}
