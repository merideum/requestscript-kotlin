package org.merideum.ktor.server.config

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.http.ContentType.Application.Json
import io.ktor.routing.routing
import io.ktor.serialization.json
import kotlinx.serialization.json.Json
import org.merideum.ktor.server.merideum

fun Application.module() {

  install(ContentNegotiation) {
    json(
      Json {
        prettyPrint = true
      }
    )
  }

  routing {
    merideum()
  }
}
