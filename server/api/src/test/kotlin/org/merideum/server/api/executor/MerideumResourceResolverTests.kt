package org.merideum.server.api.executor

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import org.merideum.server.api.executor.testutils.TestResource
import org.merideum.server.interpreter.ResourceResolver

class MerideumResourceResolverTests: DescribeSpec({
  lateinit var resourceResolver: ResourceResolver

  class SimpleResource

  describe("resolve(name)") {
    describe("when the resource exists") {
      it("should resolve resource") {
        resourceResolver = MerideumResourceResolver(listOf(TestResource("SimpleResource", "org.merideum.test", SimpleResource())))

        resourceResolver.resolve("SimpleResource").shouldNotBeNull()
      }
    }

    describe("when the resource does not exist") {
      it("should return null") {
        resourceResolver = MerideumResourceResolver(listOf(TestResource("WontResolve", "org.merideum.test", SimpleResource())))

        resourceResolver.resolve("SimpleResource").shouldBeNull()
      }
    }
  }

  describe("resolve(name, path)") {
    describe("when the resource exists") {
      it("should resolve resource") {
        resourceResolver = MerideumResourceResolver(
          listOf(
            TestResource("SimpleResource", "org.merideum.test", SimpleResource()),
            TestResource("SimpleResource", "org.merideum.test.not.it", SimpleResource())
          )
        )

        resourceResolver.resolve("SimpleResource", "org.merideum.test").shouldNotBeNull()
      }
    }

    describe("when the resource does not exist") {
      it("should return null") {
        resourceResolver = MerideumResourceResolver(listOf(TestResource("WontResolve", "org.merideum.test", SimpleResource())))

        resourceResolver.resolve("SimpleResource", "org.merideum.test").shouldBeNull()
      }
    }
  }
})
