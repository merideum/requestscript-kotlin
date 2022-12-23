package org.merideum.core.api.contract

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import java.io.File

class ContractServiceTest: DescribeSpec({
    val service = ContractService()

    val script = """
        request myRequest {
            return "Hello World!"
        }
    """.trimIndent()

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
            
            val id = service.save(script)

            val savedFile = File("./contracts/$id")

            savedFile.isFile.shouldBeTrue()
            savedFile.readText() shouldBe script

            savedFile.delete()
            File("./contracts").delete()
        }
    }

    describe("get") {
        it("should get existing contract") {
            service.prepare()

            val createdContract = File("./contracts/asdf1234").also {
                it.createNewFile()
                it.writeText(script)
            }

            service.get("asdf1234") shouldBe script

            createdContract.delete()
        }
    }
})