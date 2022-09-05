package org.merideum.core.api.error

data class ErrorsContainer(
  val runtime: String?
) {
  fun toMap() = buildMap<String, Any> {
    if (runtime != null) {
      this["runtime"] = runtime
    }
  }
}
