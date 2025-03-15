package config.configModels

import org.gradle.api.JavaVersion

data class JvmConfig(
    val javaVersion: JavaVersion,
    val kotlinJvm: String,
    val freeCompilerArgs: List<String>
)
