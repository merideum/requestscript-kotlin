package org.merideum.ktor.server.plugin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.testing.ApplicationTestBuilder
import io.ktor.server.testing.testApplication
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation as ClientContentNegotiation

class MerideumPluginTests : DescribeSpec({
    describe("no configuration") {
        it("should accept simple Merideum code input") {
            val code = """
                |request myRequest {
                |  const test = 123
                |
                |  return test
                |}
            """.trimMargin()

            testRequest { _, client ->

                val response = client.post("/merideum") {
                    setBody(code)
                }

                response.body<ResponseBody>()
                    .shouldNotBeNull()
                    .also {

                        it.returnValue.shouldNotBeNull()
                            .toString()
                            .toInt() shouldBe 123

                        it.errors.shouldBeNull()
                    }
            }
        }
    }

    describe("errors") {
        it("should include runtime error") {
            val code = """
            |request myRequest {
            |  import asdf: ThrowsError
            |  
            |  const test = 123
            |
            |  return test
            |}
            """.trimMargin()

            testRequest { _, client ->

                val response = client.post("/merideum") {
                    setBody(code)
                }.body<ResponseBody>()

                response.returnValue.shouldBeNull()
                response.errors
                    .shouldNotBeNull()["runtime"]
                    .shouldNotBeNull()
                    .jsonObject.also {
                        it["type"]
                            .shouldNotBeNull()
                            .jsonPrimitive.contentOrNull shouldBe "RESOURCE"

                        it["message"]
                            .shouldNotBeNull()
                            .jsonPrimitive.content shouldBe "Could not resolve resource: ThrowsError"
                    }
            }
        }

        it("should include syntax error") {
            val code = """
            |request myRequest {
            |  const asdf = [1]
            |  
            |  const test = asdf["stringIndex"]
            |}
            """.trimMargin()

            testRequest { _, client ->

                val response = client.post("/merideum") {
                    setBody(code)
                }.body<ResponseBody>()

                response.returnValue.shouldBeNull()
                response.errors
                    .shouldNotBeNull()["syntax"]
                    .shouldNotBeNull()
                    .jsonObject.also {
                        it["type"]
                            .shouldNotBeNull()
                            .jsonPrimitive.contentOrNull shouldBe "INDEXED_REFERENCE"

                        it["message"]
                            .shouldNotBeNull()
                            .jsonPrimitive.content shouldBe "Only type 'int' allowed for list index"
                    }
            }
        }
    }
})

@kotlinx.serialization.Serializable
class ResponseBody(
    @SerialName("return")
    val returnValue: JsonElement? = null,
    val errors: JsonObject? = null
)

suspend fun testRequest(codeBlock: suspend (ApplicationTestBuilder, HttpClient) -> Unit) {
    testApplication {
        application {
            module()
        }

        val client = createClient {
            this.install(ClientContentNegotiation) {
                json()
            }
        }

        codeBlock(this, client)
    }
}

fun Application.module() {
    install(ContentNegotiation) {
        json(
            Json {
                prettyPrint = true
            }
        )
    }

//    install(Merideum)
}
