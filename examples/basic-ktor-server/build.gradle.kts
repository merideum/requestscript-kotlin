plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")

  application
}

dependencies {
  val kotestVersion: String by project
  val ktorVersion: String by project
  val logbackVersion: String by project

  implementation(project(":ktor:server"))

  implementation("io.ktor:ktor-server-core:$ktorVersion")
  implementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
  implementation("io.ktor:ktor-server-cio:$ktorVersion")
  implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")

  implementation("ch.qos.logback:logback-classic:$logbackVersion")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

application {
  mainClass.set("io.ktor.server.cio.EngineMain")
}
