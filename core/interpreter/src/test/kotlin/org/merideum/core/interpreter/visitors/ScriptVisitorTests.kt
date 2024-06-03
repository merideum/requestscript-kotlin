package org.merideum.core.interpreter.visitors

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.maps.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldHave
import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.ResourceResolver
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.VariableType
import org.merideum.core.interpreter.utils.executeCode

class ScriptVisitorTests : DescribeSpec({

    describe("import resource") {
        describe("resource exists") {
            it("should declare resource as variable") {
                val scope = VariableScope(mutableMapOf())
                val resourceResolver = ResourceResolver(
                    mapOf("com.test.Resource" to Resource("Resource"))
                )

                val code = """
                    import rsc: com.test.Resource
                """.trimIndent()

                executeCode(code, scope, resourceResolver)

                scope.variables.shouldNotBeEmpty()
                val rsc = scope.variables["rsc"].shouldNotBeNull()

                rsc.type shouldBe VariableType.RESOURCE
            }
        }

        describe("resource does not exist") {
            it("should not declare resource as variable") {
                val scope = VariableScope(mutableMapOf())

                val code = """
                    import rsc: com.test.Resource
                """.trimIndent()

                executeCode(code, scope)

                scope.variables.shouldBeEmpty()
            }
        }
    }

    describe("return statement") {
        it("should set return statement") {
            val scope = VariableScope(mutableMapOf())

            val code = """
                    return 123
                """.trimIndent()

            val result = executeCode(code, scope)

            (result is Int).shouldBeTrue()
            result shouldBe 123
        }
    }

})
