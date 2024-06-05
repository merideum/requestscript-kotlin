package org.requestscript.ktor.server.plugin

data class ResourceFunctionCall(
    val function: FunctionCall,
)

data class FunctionCall(
    val name: String,
    val params: Map<String, Any?>,
)
