package org.requestscript.core.interpreter.visitors

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.maps.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.requestscript.core.interpreter.Resource
import org.requestscript.core.interpreter.ResourceResolver
import org.requestscript.core.interpreter.VariableScope
import org.requestscript.core.interpreter.VariableType
import org.requestscript.core.interpreter.utils.executeCode

class ScriptVisitorTests : DescribeSpec({

    describe("resource") {
        class InternalResource: Resource {
            override fun callFunction(functionName: String, params: Map<String, Any?>): Any? {
                if (functionName == "add") {
                    return params["first"] as Int + params["second"] as Int
                }
                throw IllegalArgumentException("$functionName not found")
            }
        }

        describe("import resource") {
            describe("resource exists") {
                it("should declare resource as variable") {
                    val scope = VariableScope(mutableMapOf())
                    val resourceResolver = SimpleResourceResolver(
                        mapOf("com.test.Resource" to InternalResource())
                    )

                    val code = """
                        request MyRequest {
                            import rsc: com.test.Resource
                        }
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
                    request MyRequest {
                            import rsc: com.test.Resource
                    }
                """.trimIndent()

                    executeCode(code, scope)

                    scope.variables.shouldBeEmpty()
                }
            }
        }

        describe("call resource function") {
            describe("function exists with valid params") {
                it ("should call function and return result") {
                    val scope = VariableScope(mutableMapOf())
                    val resourceResolver = SimpleResourceResolver(
                        mapOf("com.test.Resource" to InternalResource())
                    )

                    val code = """
                    request MyRequest {
                            
                        import rsc: com.test.Resource
                    
                        return rsc.add(first: 100, second: 200)
                    }
                """.trimIndent()

                    val result = executeCode(code, scope, resourceResolver)

                    (result is Int).shouldBeTrue()
                    result shouldBe 300
                }

                it ("allows nesting of function calls") {
                    val scope = VariableScope(mutableMapOf())
                    val resourceResolver = SimpleResourceResolver(
                        mapOf("com.test.Resource" to InternalResource())
                    )

                    val code = """
                        request MyRequest {
                            
                    import rsc: com.test.Resource
                    
                    return rsc.add(first: 100, second: rsc.add(first:25, second:50))
                    }
                """.trimIndent()

                    val result = executeCode(code, scope, resourceResolver)

                    (result is Int).shouldBeTrue()
                    result shouldBe 175
                }
            }
        }
    }

    describe("return statement") {
        it("should set return statement") {
            val scope = VariableScope(mutableMapOf())

            val code = """
                request MyRequest {
                    return 123
                }
                """.trimIndent()

            val result = executeCode(code, scope)

            (result is Int).shouldBeTrue()
            result shouldBe 123
        }
    }

})

data class SimpleResourceResolver(val resources: Map<String, Resource>): ResourceResolver {
    override fun get(name: String) = resources[name]
}
