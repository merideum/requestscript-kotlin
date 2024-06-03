plugins {
    kotlin("jvm") version "2.0.0" apply false
    kotlin("plugin.serialization") version "2.0.0" apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.6"
}

dependencies {
    "detektPlugins"("io.gitlab.arturbosch.detekt:detekt-formatting:1.21.0")
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
