package org.merideum.examples.ktor.server.config

import io.ktor.serialization.jackson.jackson
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import org.merideum.ktor.server.plugin.Merideum

fun Application.module() {

    install(ContentNegotiation) {
        jackson()
    }

    install(Merideum) {

        resource {
            name = "HelloWorld"
            path = "com.merideum.example"

            fn("hello") { params ->
                "Hello, ${params["name"]}!"
            }
        }
    }
}
