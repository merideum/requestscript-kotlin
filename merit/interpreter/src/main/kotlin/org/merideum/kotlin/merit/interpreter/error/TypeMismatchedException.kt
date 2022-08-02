package org.merideum.kotlin.merit.interpreter.error

import org.merideum.kotlin.merit.interpreter.type.Type

class TypeMismatchedException(
  val type: Type,
  val otherType: Type
):
  // TODO throw better exception
  RuntimeException("Cannot perform operation between types '${type.qualifiedTypeName()}' and '${otherType.qualifiedTypeName()}'")
