plugins {
  kotlin("jvm")
}

dependencies {
  val antlr: String by project
  val kotestVersion: String by project
  val mockkVersion: String by project

  api(project(":server:antlr"))

  api("org.antlr:antlr4-runtime:$antlr")

  testImplementation("org.antlr:antlr4-runtime:$antlr")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")

  testImplementation("io.mockk:mockk:$mockkVersion")
}
