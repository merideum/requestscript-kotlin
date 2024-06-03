package org.merideum.ktor.server.plugin

import org.merideum.ktor.server.resource.InternalResource
import kotlin.collections.set

//val Merideum = createApplicationPlugin(
//    name = "Merideum",
//    createConfiguration = ::MerideumPluginConfiguration
//) {
//    application.routing {
//        route("/merideum") {
//
//            /**
//             * Routing for a standalone request.
//             */
//            post {
//                val requestRaw = this.call.receiveText()
//
//                val executionResult = executor.execute(requestRaw, ScriptContext())
//                call.respond(mapToJson(executionResult.toResponse()))
//            }
//
//            /**
//             * Routing for calling a request that has been saved to the server.
//             */
//            route("/contract") {
//                post {
//
//                    val requestRaw = this.call.receiveText()
//
//                    val id = contractHandler.save(requestRaw)
//
//                    call.respond(SerializableContractResponse(id))
//                }
//
//                route("/{id}") {
//
//                    get {
//                        val id = call.parameters["id"] ?: ""
//
//                        val contract = contractHandler.get(id)
//
//                        call.respondText(contract)
//                    }
//
//                    // Call the contract
//                    post {
//                        val id = call.parameters["id"] ?: ""
//
//                        val contract = contractHandler.get(id)
//
//                        val requestBody = call.receive<SerializableContractRequestBody>()
//
//                        val executionResult = executor.execute(
//                            contract,
//                            ScriptContext(parameters = jsonToMap(requestBody.parameters))
//                        )
//
//                        call.respond(mapToJson(executionResult.toResponse()))
//                    }
//                }
//            }
//        }
//    }
//}

class MerideumPluginConfiguration {
    val resources: MutableList<InternalResource> = mutableListOf()

    fun resource(configuration: ResourceConfiguration.() -> Unit) {
        val config = ResourceConfiguration().apply(configuration)

        resources.add(InternalResource(config.name, config.path, config.functions))
    }
}

class ResourceConfiguration {
    var name: String = ""
    var path: String = ""
    val functions: MutableMap<String, ((Map<String, Any?>) -> Any?)> = mutableMapOf()

    fun fn(name: String, function: (Map<String, Any?>) -> Any?) {
        functions[name] = function
    }
}
