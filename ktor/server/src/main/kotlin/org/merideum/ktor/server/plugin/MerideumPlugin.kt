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
import org.merideum.ktor.server.OutputSerializer
import org.merideum.ktor.server.SerializableResponseBody
import org.merideum.ktor.server.executor.InternalResource
import org.merideum.server.api.executor.serializer.ObjectSerializer
import org.merideum.server.api.executor.MerideumResourceResolver
import org.merideum.server.api.executor.SimpleScriptExecutor
import org.merideum.server.interpreter.Resource
import org.merideum.server.interpreter.ScriptContext
import org.merideum.server.interpreter.error.ResourceResolutionException

val Merideum = createApplicationPlugin(
  name = "Merideum",
  createConfiguration = ::MerideumPluginConfiguration
) {
  val resourceResolver = MerideumResourceResolver(pluginConfig.resources)
  val executor = SimpleScriptExecutor(resourceResolver)

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

        val executionResult = executor.execute(requestRaw, ScriptContext())

        val responseBody = SerializableResponseBody(OutputSerializer().deserialize(executionResult.output))

        call.respond(responseBody)
      }
    }
  }
}

class MerideumPluginConfiguration {
  val resources: MutableList<Resource<*>> = mutableListOf()
  var serializers: MutableMap<String, ObjectSerializer<*>> = mutableMapOf()

  fun resources(configuration: ResourcesConfiguration.() -> Unit) {
    val config = ResourcesConfiguration(FunctionParser(serializers)).apply(configuration)

    resources.addAll(config.resources)
  }

  /**
   * Object Serializers make Kotlin classes compatible with Merit objects and vice-versa.
   */
  fun objectSerializers(configuration: ObjectSerializersConfiguration.() -> Unit) {
    val config = ObjectSerializersConfiguration().apply(configuration)

    serializers.putAll(config.serializers)
  }
}

class ResourcesConfiguration(
  private val functionParser: FunctionParser = FunctionParser(emptyMap())
) {
  val resources = mutableListOf<Resource<*>>()

  /**
   * An internal resource is a resource that has an instance in memory.
   *
   * An external resource is a resource that requires a web client.
   */
  fun add(instance: Any, configuration: InternalResourceConfiguration.() -> Unit) {
    val config = InternalResourceConfiguration().apply(configuration)

    val functions = functionParser.functionsForInstance(instance)

    resources.add(InternalResource(config.name, config.path, instance, functions))
  }
}

class ObjectSerializersConfiguration {
  val serializers = mutableMapOf<String, ObjectSerializer<*>>()

  /**
   * An internal resource is a resource that has an instance in memory.
   *
   * An external resource is a resource that requires a web client.
   */
  inline fun <reified T> add(serializer: ObjectSerializer<T>) {
    serializers[T::class.qualifiedName!!] = serializer
  }
}

class InternalResourceConfiguration {
  var name: String = ""
  var path: String = ""
}
