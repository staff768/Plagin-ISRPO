plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.14.1"
}

group = "com.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains:annotations:20.1.0")
}

intellij {
    version.set("2024.3")
    plugins.set(listOf("java"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Обновите версию до 17
    }
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "17" // Установите совместимость с JDK 17
    targetCompatibility = "17"
}

