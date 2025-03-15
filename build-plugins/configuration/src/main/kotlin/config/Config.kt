package config

import config.configModels.AndroidConfig
import config.configModels.JvmConfig
import org.gradle.api.JavaVersion

object Config {
    val android = AndroidConfig(
        minSdkVersion = 24,
        targetSdkVersion = 35,
        compileSdkVersion = 35,
        applicationId = "nl.barbarossa040.multimoduleapp",
        versionCode = 1,
        versionName = "1.0",
        nameSpace = "nl.barbarossa040.multimoduleapp"
    )
    val jvm = JvmConfig(
        javaVersion = JavaVersion.VERSION_17,
        kotlinJvm = JavaVersion.VERSION_17.toString(),
        freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
    )
}