package org.merideum.core.interpreter

import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue

data class Variable<T>(
    val name: String,
    var value: TypedValue<T>?,
    val modifier: Modifier,
    val type: Type
) {
    val initialized = value != null
}
