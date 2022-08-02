package org.merideum.ktor.server.plugin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.kotlin.merit.interpreter.type.IntType
import org.merideum.kotlin.merit.interpreter.type.ObjectType
import org.merideum.kotlin.merit.interpreter.type.StringType
import org.merideum.kotlin.merit.interpreter.type.Type
import kotlin.reflect.KParameter
import kotlin.reflect.full.declaredMemberFunctions

class FunctionParserTests: DescribeSpec({

  describe("functionsForInstance") {
    it("function with many parameters") {
      val instance = Foo()

      val doThingFunction = Foo()::class.declaredMemberFunctions.single { it.name == "doThing" }

      val expected = mapOf(
        "doThing-string-int" to ResourceFunction(
          "doThing",
          listOf(
            FunctionParameter(null, doThingFunction.parameters.single { it.kind == KParameter.Kind.INSTANCE }),
            FunctionParameter(StringType(), doThingFunction.parameters.single { it.name == "name" }),
            FunctionParameter(IntType(), doThingFunction.parameters.single { it.name == "thing" })
          ),
          ObjectType("org.merideum.ktor.server.plugin.Bar"),
          doThingFunction
        )
      )

      val actualFunctions = FunctionParser().functionsForInstance(instance)

      actualFunctions shouldBe expected
    }
  }
})

class Bar(val asdf: String)
class Foo { fun doThing(name: String, thing: Int) = Bar("asdf") }
