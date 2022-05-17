package org.merideum.ktor.server

import io.ktor.application.call
import io.ktor.request.receiveText
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.post
import org.merideum.kotlin.merit.execution.SimpleMeritExecutor

fun Route.merideum() {
  post("/merideum") {
    val merideumRequest = call.receiveText()

    val merideumResult = SimpleMeritExecutor().execute(merideumRequest)

    val responseBody = SerializableResponseBody(OutputSerializer().deserialize(merideumResult.output))

    call.respond(responseBody)
  }
}
