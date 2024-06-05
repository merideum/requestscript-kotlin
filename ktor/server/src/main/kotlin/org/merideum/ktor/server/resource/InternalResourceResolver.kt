package org.merideum.ktor.server.resource

import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.ResourceResolver

data class InternalResourceResolver(
    // Map resourcePath, Resource
    val resources: Map<String, Resource>
): ResourceResolver {
    override fun get(name: String) = resources[name]
}
