package org.merideum.ktor.server.config

import io.ktor.server.application.Application
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.install
import kotlinx.serialization.json.Json
import org.merideum.ktor.server.plugin.MerideumPlugin

fun Application.module() {

  install(ContentNegotiation) {
    json(
      Json {
        prettyPrint = true
      }
    )
  }

  install(MerideumPlugin)
}
