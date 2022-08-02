plugins {
  kotlin("jvm")
}

dependencies {
  val antlr: String by project
  val kotestVersion: String by project
  val mockkVersion: String by project

  api(project(":merit:antlr"))

  api("org.antlr:antlr4-runtime:$antlr")

  implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")

  testImplementation("org.antlr:antlr4-runtime:$antlr")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")

  testImplementation("io.mockk:mockk:$mockkVersion")
}
