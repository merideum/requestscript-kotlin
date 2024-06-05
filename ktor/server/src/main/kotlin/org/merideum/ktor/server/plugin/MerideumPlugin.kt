package org.merideum.ktor.server.plugin

import io.ktor.server.application.call
import io.ktor.server.application.createApplicationPlugin
import io.ktor.server.request.receiveText
import io.ktor.server.response.respond
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import org.merideum.core.api.SimpleScriptExecutor
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.ktor.server.resource.InternalResource
import kotlin.collections.set

val Merideum = createApplicationPlugin(
    name = "Merideum",
    createConfiguration = ::MerideumPluginConfiguration
) {
    val resourceResolver = ResourceResolver(pluginConfig.resources)

    application.routing {
        route("/merideum") {

            /**
             * Routing for a standalone request.
             */
            post {
                val requestRaw = this.call.receiveText()

                val executionResult = SimpleScriptExecutor(resourceResolver).execute(requestRaw)
                call.respond(executionResult.toResponse())
            }
        }
    }
}

class MerideumPluginConfiguration {
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
