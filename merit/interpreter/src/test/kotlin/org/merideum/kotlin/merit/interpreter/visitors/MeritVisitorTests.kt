package org.merideum.kotlin.merit.interpreter.visitors

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

class MeritVisitorTests: DescribeSpec({
  fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(null, mutableMapOf()),
    outputContainer: OutputContainer = OutputContainer.empty()
  ) {
    val lexer = MeritLexer(CharStreams.fromString(code))
    val parser = MeritParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.parse()

    val visitor = MeritVisitor(variableScope, outputContainer)

    visitor.visit(parseTree)
  }

  describe("variable declaration") {
    describe("const") {
      var code = """
        |const test = 123
      """.trimMargin()

      it("should parse successfully and run") {
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe 123
            actualConst.modifier shouldBe Modifier.CONST
          }
        }
      }

      it("should reject re-assignment") {
        code = """
          |const test = 123
          |test = 456
        """.trimMargin()
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe 123
            actualConst.modifier shouldBe Modifier.CONST
          }
        }
      }

      it("should reject declaration without assignment") {
        code = """
          |const test
        """.trimMargin()
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should not have any variables") {
            shouldBeEmpty()
          }
        }
      }
    }

    describe("var") {
      var code = """
        |var test = 123
      """.trimMargin()

      it("should add variable with 'var' modifier and assigned value") {
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe 123
            actualConst.modifier shouldBe Modifier.VAR
          }
        }
      }

      it("can declare 'var' variable without assignment") {
        code = """
          |var test
        """.trimMargin()

        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value Unit") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe Unit
            actualConst.modifier shouldBe Modifier.VAR
          }
        }
      }

      it("can be reassigned") {
        code = """
          |var test = 123
          |test = 456
        """.trimMargin()

        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 456") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe 456
            actualConst.modifier shouldBe Modifier.VAR
          }
        }
      }
    }
  }

  describe("output assignment") {
    lateinit var code: String

    describe("output is assigned") {
      code = """
        |output test = 123
      """.trimMargin()

      it("should have output") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.output().apply {
          withClue("should have one output set to 'test' with value 123") {
            size shouldBe 1

            val actualOutput = get("test")
              .shouldNotBeNull()

            actualOutput shouldBe 123
          }
        }
      }
    }

    describe("output value is already initialized") {
      code = """
        |const test = 123
        |output test
      """.trimMargin()

      it("should have output") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.output().apply {
          withClue("should have one output set to the 'test' 'const' variable") {
            size shouldBe 1

            val actualOutput = get("test")
              .shouldNotBeNull()

            actualOutput shouldBe 123
          }
        }
      }
    }

    describe("output value is not initialized") {
      code = """
        |var test
        |output test
      """.trimMargin()

      it("should reject setting value") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.output().apply {
          withClue("should not have any output") {
            shouldBeEmpty()
          }
        }
      }
    }
  }
})
