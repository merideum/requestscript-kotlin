package org.merideum.core.interpreter.error

import org.merideum.core.interpreter.type.Type

class TypeMismatchedException(
  val type: Type,
  val otherType: Type
): ScriptRuntimeException("Cannot perform operation between types '${type.typeName()}' and '${otherType.typeName()}'")
