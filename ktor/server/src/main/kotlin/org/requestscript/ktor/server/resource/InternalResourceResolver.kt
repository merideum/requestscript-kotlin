package org.requestscript.ktor.server.resource

import org.requestscript.core.interpreter.Resource
import org.requestscript.core.interpreter.ResourceResolver

data class InternalResourceResolver(
    // Map resourcePath, Resource
    val resources: Map<String, Resource>
): ResourceResolver {
    override fun get(name: String) = resources[name]
}
