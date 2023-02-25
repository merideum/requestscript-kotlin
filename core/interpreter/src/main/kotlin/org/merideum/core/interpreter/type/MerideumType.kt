package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.Modifier
import org.merideum.core.interpreter.WrappedValue

typealias MerideumFunction = (params: Map<String, MerideumTypedValue>) -> MerideumTypedValue

class MerideumType(
    val name: String,
    val functions: Map<String, MerideumFunction>,
    val toString: (value: Any?) -> String,
)

class MerideumTypedValue(
    val type: MerideumType,
    val value: Any?,
) {
    override fun toString(): String {
        return type.toString.invoke(value)
    }
}

fun MerideumTypedValue.wrap() = WrappedValue(this)

class MerideumTypeBuilder(
    private val name: String,
) {
    private val functions = mutableMapOf<String, MerideumFunction>()

    var toString: (Any?) -> String = { "" }

    fun function(name: String, invoke: MerideumFunction) {
        functions[name] = invoke
    }

    fun build() = MerideumType(
        name,
        functions,
        toString
    )
}

fun type(name: String, init: MerideumTypeBuilder.() -> Unit = {}): MerideumType {
    val type = MerideumTypeBuilder(name)
    type.init()

    return type.build()
}

class TypeRegistry(
    private val types: Map<String, MerideumType>,
) {
    fun get(name: String) = types[name]
}

class MerideumVariable(
    val modifier: Modifier,
    val value: MerideumTypedValue,
)

fun MerideumVariable.wrap() = WrappedValue(this)
