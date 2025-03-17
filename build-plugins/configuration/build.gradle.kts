import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "nl.barbarossa040.multimodule.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    compileOnly(libs.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        plugins {
            register("androidApp") {
                id = "barbarossa040.application"
                implementationClass = "plugins.AppConfigurationPlugin"
            }
            register("androidLib") {
                id = "barbarossa040.library"
                implementationClass = "plugins.LibConfigurationPlugin"
            }
            register("app-compose") {
                id = "barbarossa040.appCompose"
                implementationClass = "plugins.AppComposeConfigurationPlugin"
            }
            register("library-compose") {
                id = "barbarossa040.libraryCompose"
                implementationClass = "plugins.LibComposeConfigurationPlugin"
            }
            register("hiltConfig") {
                id = "barbarossa040.hiltConfig"
                implementationClass = "plugins.HiltConfigurationPlugin"
            }
        }
    }
}