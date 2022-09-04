package org.merideum.ktor.server.plugin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldNotBeEmpty
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
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation as ClientContentNegotiation

@kotlinx.serialization.Serializable
class ResponseBody(
  val output: JsonObject
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

        response.output.shouldNotBeEmpty()
        response.output["test"].shouldNotBeNull()
          .toString()
          .toInt() shouldBe 123
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
