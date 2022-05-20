package org.merideum.ktor.server.plugin

import io.ktor.server.application.call
import io.ktor.server.application.createApplicationPlugin
import io.ktor.server.request.receiveText
import io.ktor.server.response.respond
import io.ktor.server.routing.post
import io.ktor.server.routing.routing
import org.merideum.ktor.server.OutputSerializer
import org.merideum.ktor.server.SerializableResponseBody
import org.merideum.ktor.server.executor.SimpleMeritExecutor

val MerideumPlugin = createApplicationPlugin(
  name = "MerideumPlugin",
  createConfiguration = ::MerideumPluginConfiguration
) {
  val executor = SimpleMeritExecutor()

  application.routing {
    post("/merideum") {
      val requestRaw = this.call.receiveText()

      val executionResult = executor.execute(requestRaw)

      val responseBody = SerializableResponseBody(OutputSerializer().deserialize(executionResult.output))

      call.respond(responseBody)
    }
  }
}

class MerideumPluginConfiguration
