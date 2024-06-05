package org.merideum.examples.ktor.server.config

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import kotlinx.serialization.json.Json
import org.merideum.ktor.server.plugin.Merideum

//import org.merideum.ktor.server.plugin.Merideum

fun Application.module() {

    install(ContentNegotiation) {
        json(
            Json {
                prettyPrint = true
            }
        )
    }

    install(Merideum) {

        resource {
            name = "HelloWorld"
            path = "com.merideum.kotlin"

            fn("hello") {
                "Hello, World!"
            }
        }
    }
}
