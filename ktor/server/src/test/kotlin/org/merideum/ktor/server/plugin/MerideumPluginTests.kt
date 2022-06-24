package org.merideum.ktor.server.plugin

import io.kotest.core.spec.style.DescribeSpec
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.testing.testApplication
import kotlinx.serialization.json.Json

class MerideumPluginTests: DescribeSpec({
  describe("no configuration") {
    it("should accept simple Merit code input") {
      val code = """
        |const test = 123
        |
        |output test
      """.trimMargin()

      testApplication {
        application {
          module()
        }

        val client = createClient {
          this@testApplication.install(ContentNegotiation) {
            json()
          }
        }

        val response = client.post("/merideum") {
          setBody(code)
        }
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
