plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
}

dependencies {
  val kotestVersion: String by project
  val ktorVersion: String by project
  val logbackVersion: String by project
  val kotlinSerializationJsonVersion: String by project
  val kotestKtorVersion: String by project

  implementation(project(":merit:interpreter"))
  implementation("io.ktor:ktor-server-core:$ktorVersion")
  implementation("io.ktor:ktor-server-cio:$ktorVersion")
  implementation("ch.qos.logback:logback-classic:$logbackVersion")
  implementation("io.ktor:ktor-serialization:$ktorVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinSerializationJsonVersion")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")

  testImplementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
  testImplementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
  testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")
}
