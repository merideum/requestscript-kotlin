package org.requestscript.examples.ktor.server.config

import io.ktor.serialization.jackson.jackson
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import org.requestscript.ktor.server.plugin.RequestScript

fun Application.module() {

    install(ContentNegotiation) {
        jackson()
    }

    install(RequestScript) {

        resource {
            name = "HelloWorld"
            path = "org.requestscript.example"

            fn("hello") { params ->
                "Hello, ${params["name"]}!"
            }
        }

        resource {
            name = "TestMap"
            path = "org.requestscript.example"

            fn("go") {
                mapOf("name" to "Hello World")
            }
        }
    }
}
