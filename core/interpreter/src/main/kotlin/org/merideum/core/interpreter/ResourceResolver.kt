package org.merideum.core.interpreter

data class ResourceResolver(
    // Map resourcePath, Resource
    val resources: Map<String, Resource>
) {
    fun get(name: String) = resources[name]
}

class Resource(
    val name: String,
)
