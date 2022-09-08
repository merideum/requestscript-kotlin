package org.merideum.core.interpreter

data class FunctionCallAttributes(
    val name: String,
    val parameters: List<FunctionParameter>
)

class FunctionParameter(
    val value: WrappedValue<*>,
    val lineNumber: Int,
    val linePosition: Int
)
