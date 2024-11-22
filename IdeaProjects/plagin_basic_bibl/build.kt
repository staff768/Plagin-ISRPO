plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.5.3" // Проверьте и установите последнюю версию
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.jetbrains.intellij.idea:idea-platform:2024.3")  // Убедитесь, что зависимость для платформы присутствует
    implementation("com.jetbrains:idea-core:2024.3")  // Укажите версию для idea-core
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.10")  // Kotlin если используется
}

intellij {
    version = "2024.3" // Убедитесь, что это необходимая версия
    plugins = listOf("java")
}

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
}