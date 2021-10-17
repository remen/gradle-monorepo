plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.springframework.boot") version "2.5.5"
    id("com.google.cloud.tools.jib") version "3.1.4"
}

apply(plugin = "io.spring.dependency-management")

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":modules:request-logger"))
}

jib {
    from.image = "eclipse-temurin:16"
    to.image = "ghcr.io/remen/monorepo-fizz"
    container {
        labels.put("org.opencontainers.image.source", "https://github.com/remen/gradle-monorepo")
    }
}
