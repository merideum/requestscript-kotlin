package org.merideum.core.interpreter

data class ResourceResolver(
    // Map resourcePath, Resource
    val resources: Map<String, Resource>
) {
    fun get(name: String) = resources[name]
}

interface Resource {
    fun callFunction(functionName: String, params: Map<String, Any?>): Any?
}
