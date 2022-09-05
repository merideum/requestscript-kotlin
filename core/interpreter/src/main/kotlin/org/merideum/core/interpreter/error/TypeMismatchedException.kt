package org.merideum.core.interpreter.error

import org.merideum.core.interpreter.type.Type

class TypeMismatchedException(
  val firstType: Type,
  val otherType: Type
): ScriptRuntimeException("Cannot perform operation between types '${firstType.typeName()}' and '${otherType.typeName()}'", RuntimeErrorType.TYPE_MISMATCH)
