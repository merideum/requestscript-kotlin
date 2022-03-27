package org.merideum.meriad.antlr.visitors

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.merideum.meriad.MeriadLexer
import org.merideum.meriad.MeriadParser
import org.merideum.meriad.antlr.VariableScope

class MeriadVisitorTests: DescribeSpec({
  describe("Meriad code") {
    it("should parse successfully and run") {
      val meriad = """
        |test = 123
      """.trimMargin()
      val lexer = MeriadLexer(CharStreams.fromString(meriad))
      val parser = MeriadParser(CommonTokenStream(lexer))
      parser.buildParseTree = true

      val parseTree: ParseTree = parser.parse()

      val variableScope = VariableScope(null, mutableMapOf())
      val visitor = MeriadVisitor(variableScope)

      visitor.visit(parseTree)

      variableScope.variables.apply {
        withClue("should have one variable named 'test' with value 123") {
          size shouldBe 1
          get("test")
            .shouldNotBeNull()
            .value
            .shouldBe(123)
        }
      }
    }
  }
})
