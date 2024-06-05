package org.requestscript.ktor.server.plugin

import io.ktor.server.application.call
import io.ktor.server.application.createApplicationPlugin
import io.ktor.server.request.receive
import io.ktor.server.request.receiveText
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import org.requestscript.core.api.SimpleScriptExecutor
import org.requestscript.ktor.server.resource.InternalResource
import org.requestscript.ktor.server.resource.InternalResourceResolver
import kotlin.collections.set

val RequestScript = createApplicationPlugin(
    name = "RequestScript",
    createConfiguration = ::RequestScriptPluginConfiguration
) {
    val resourceResolver = InternalResourceResolver(pluginConfig.resources)

    application.routing {
        route("/rqs") {

            /**
             * Routing for a standalone request.
             */
            post {
                val requestRaw = this.call.receiveText()

                val executionResult = SimpleScriptExecutor(resourceResolver).execute(requestRaw)
                call.respond(executionResult.toResponse())
            }

            route("/resource") {
                route("/{path...}") {
                    post {
                        val resourcePath = call.parameters.getAll("path")!!.joinToString(separator = ".") { it }

                        val body = call.receive<ResourceFunctionCall>()

                        val result = resourceResolver
                            .get(resourcePath)
                            ?.callFunction(body.function.name, body.function.params)

                        if (result != Unit) {
                            call.respondText(result.toString())
                        }
                    }
                }
            }
        }
    }
}

class RequestScriptPluginConfiguration {
    val resources: MutableMap<String, InternalResource> = mutableMapOf()

    fun resource(configuration: ResourceConfiguration.() -> Unit) {
        val config = ResourceConfiguration().apply(configuration)

        resources["${config.path}.${config.name}"] = InternalResource(config.name, config.path, config.functions)
    }
}

class ResourceConfiguration {
    var name: String = ""
    var path: String = ""
    val functions: MutableMap<String, ((Map<String, Any?>) -> Any?)> = mutableMapOf()

    fun fn(name: String, function: (Map<String, Any?>) -> Any?) {
        functions[name] = function
    }
}
