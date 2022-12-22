package org.merideum.core.api.contract

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import java.io.File

class ContractServiceTest: DescribeSpec({
    val service = ContractService()

    describe("prepare") {
        it("should create 'contract' directory if it does not exist") {
            service.prepare()

            val contractDirectory = File("./contracts")

            contractDirectory.isDirectory.shouldBeTrue()

            contractDirectory.delete()
        }
    }

    describe("save") {
        it("should create contract file") {
            service.prepare()

            val script = """
                request myRequest {
                    return "Hello World!"
                }
            """.trimIndent()

            val id = service.save(script)

            val savedFile = File("./contracts/$id")

            savedFile.isFile.shouldBeTrue()
            savedFile.readText() shouldBe script

            savedFile.delete()
            File("./contracts").delete()
        }
    }
})
