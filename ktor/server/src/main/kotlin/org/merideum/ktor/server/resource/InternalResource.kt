package org.merideum.ktor.server.resource

import org.merideum.core.interpreter.Resource

class InternalResource(
    val name: String,
    val path: String,
    private val functions: Map<String, ((Map<String, Any?>) -> Any?)>,
): Resource {
    override fun callFunction(functionName: String, params: Map<String, Any?>): Any? {
        return functions[functionName]?.invoke(params)
    }
}
