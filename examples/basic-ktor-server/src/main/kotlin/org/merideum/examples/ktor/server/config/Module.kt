package org.merideum.examples.ktor.server.config

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import kotlinx.serialization.json.Json
import org.merideum.examples.ktor.server.resources.Greeter
//import org.merideum.examples.ktor.server.resources.PersonSerializer
//import org.merideum.ktor.server.plugin.Merideum
//
//fun Application.module() {
//
//    install(ContentNegotiation) {
//        json(
//            Json {
//                prettyPrint = true
//            }
//        )
//    }
//
//    install(Merideum) {
//        objectSerializers {
//            add(PersonSerializer())
//        }
//
//        resources {
//            add(Greeter()) {
//                name = "Greeter"
//                path = "org.merideum.example"
//            }
//        }
//    }
//}
