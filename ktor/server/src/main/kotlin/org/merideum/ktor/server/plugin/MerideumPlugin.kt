package org.merideum.ktor.server.plugin

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.application.createApplicationPlugin
import io.ktor.server.application.install
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.request.receiveText
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.ktor.server.OutputSerializer
import org.merideum.ktor.server.SerializableResponseBody
import org.merideum.ktor.server.executor.InternalResource
import org.merideum.ktor.server.executor.MerideumResourceResolver
import org.merideum.ktor.server.executor.SimpleMeritExecutor

val Merideum = createApplicationPlugin(
  name = "Merideum",
  createConfiguration = ::MerideumPluginConfiguration
) {
  val resourceResolver = MerideumResourceResolver(pluginConfig.resources)
  val executor = SimpleMeritExecutor(resourceResolver)

  application.install(StatusPages) {
    exception<Throwable> { call, cause ->
      if(cause is ResourceResolutionException) {
        call.respondText(text = "${cause.message}" , status = HttpStatusCode.BadRequest)
      }
    }
  }
  application.routing {
    route("/merideum") {

      /**
       * Routing for a standalone request.
       */
      post {
        val requestRaw = this.call.receiveText()

        val executionResult = executor.execute(requestRaw)

        val responseBody = SerializableResponseBody(OutputSerializer().deserialize(executionResult.output))

        call.respond(responseBody)
      }
    }
  }
}

class MerideumPluginConfiguration {
  val resources: MutableList<Resource<*>> = mutableListOf()

  fun resources(configuration: ResourcesConfiguration.() -> Unit) {
    val config = ResourcesConfiguration().apply(configuration)

    resources.addAll(config.resources)
  }
}

class ResourcesConfiguration {
  val resources = mutableListOf<Resource<*>>()

  /**
   * An internal resource is a resource that has an instance in memory.
   *
   * An external resource is a resource that requires a web client.
   */
  fun add(instance: Any, configuration: InternalResourceConfiguration.() -> Unit) {
    val config = InternalResourceConfiguration().apply(configuration)

    resources.add(InternalResource(config.name, config.path, instance))
  }
}

class InternalResourceConfiguration {
  var name: String = ""
  var path: String = ""
}
