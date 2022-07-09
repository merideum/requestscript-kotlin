package org.merideum.kotlin.merit.interpreter.error

import org.merideum.kotlin.merit.interpreter.type.Type

class TypeMismatchedException(
  val type: Type,
  val otherType: Type
): RuntimeException("Cannot perform operation between types '${type.typeName()}' and '${otherType.typeName()}'")
