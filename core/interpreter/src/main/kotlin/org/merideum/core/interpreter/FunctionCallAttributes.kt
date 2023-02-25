package org.merideum.core.interpreter

import org.merideum.core.interpreter.type.MerideumTypedValue

data class FunctionCallAttributes(
    val name: String,
    val parameters: Map<String, MerideumTypedValue>
)

fun FunctionCallAttributes.wrap() = WrappedValue(this)
