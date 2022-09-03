package org.merideum.server.interpreter.error

import org.merideum.server.interpreter.type.Type

class TypeMismatchedException(
  val type: Type,
  val otherType: Type
): RuntimeException("Cannot perform operation between types '${type.typeName()}' and '${otherType.typeName()}'")
