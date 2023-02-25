package org.merideum.core.interpreter.error

import org.merideum.core.interpreter.type.MerideumType

class TypeMismatchedException(
    val firstType: MerideumType,
    val otherType: MerideumType
) : ScriptRuntimeException(
    "Cannot perform operation between types '${firstType.name}' and '${otherType.name}'",
    ScriptErrorType.TYPE_MISMATCH
)
