package org.merideum.ktor.server.plugin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.testing.testApplication
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonPrimitive
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation as ClientContentNegotiation

@kotlinx.serialization.Serializable
class ResponseBody(
  val output: JsonObject? = null,
  val errors: JsonObject? = null
)

class MerideumPluginTests: DescribeSpec({
  describe("no configuration") {
    it("should accept simple Merideum code input") {
      val code = """
        |request myRequest {
        |  const test = 123
        |
        |  return test
        |}
      """.trimMargin()

      testApplication {
        application {
          module()
        }

        val client = createClient {
          this.install(ClientContentNegotiation) {
            json()
          }
        }

        val response = client.post("/merideum") {
          setBody(code)
        }.body<ResponseBody>()

        response.output
          .shouldNotBeNull()
          .also {
            it.shouldNotBeEmpty()

            it["test"].shouldNotBeNull()
              .toString()
              .toInt() shouldBe 123
          }

        response.errors.shouldBeNull()
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

      testApplication {
        application {
          module()
        }

        val client = createClient {
          this.install(ClientContentNegotiation) {
            json()
          }
        }

        val response = client.post("/merideum") {
          setBody(code)
        }.body<ResponseBody>()

        response.output.shouldBeNull()
        response.errors
          .shouldNotBeNull()["runtime"]
          .shouldNotBeNull()
          .jsonPrimitive.content shouldBe "Could not resolve resource: ThrowsError"

      }
    }
  }
})

fun Application.module() {
  install(ContentNegotiation) {
    json(
      Json {
        prettyPrint = true
      }
    )
  }

  install(Merideum)
}
