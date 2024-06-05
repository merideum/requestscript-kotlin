package org.merideum.core.interpreter

interface Resource {
    fun callFunction(functionName: String, params: Map<String, Any?>): Any?
}

interface ResourceResolver {
    fun get(name: String): Resource?
}
