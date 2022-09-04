plugins {
  kotlin("jvm") version "1.7.10" apply false
  kotlin("plugin.serialization") version "1.7.10" apply false
}

allprojects {
  version = "0.0.1"
  group = "org.merideum.kotlin"

  repositories {
    mavenCentral()
    mavenLocal {
      mavenContent {
        snapshotsOnly()
      }
    }
  }

  tasks.withType<Test>().configureEach {
    useJUnitPlatform()
  }
}
