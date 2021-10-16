plugins {
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.5")
}

tasks.jar {
    isPreserveFileTimestamps = false
    isReproducibleFileOrder = true
}
