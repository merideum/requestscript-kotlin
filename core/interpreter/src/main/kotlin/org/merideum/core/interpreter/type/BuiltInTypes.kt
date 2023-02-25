package org.merideum.core.interpreter.type

enum class BuiltInTypes(val keyword: String) {
    INT("int"),
    STRING("string"),
    RESOURCE("resource"),
}

fun builtInTypes(): Map<String, MerideumType> {
    return mutableMapOf<String, MerideumType>().apply {
        put(BuiltInTypes.INT.keyword, intType())
        put(BuiltInTypes.STRING.keyword, stringType())
        put(BuiltInTypes.RESOURCE.keyword, resourceReferenceType())
    }
}

fun intType() = type("int") {
    toString = { value ->
        value.toString()
    }
}

fun stringType() = type("string") {
    toString = { value -> value.toString() }
}

fun resourceReferenceType() = type("resource")
