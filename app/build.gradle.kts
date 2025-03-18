plugins {
//    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.multimodule.application)
    alias(libs.plugins.multimodule.compose)
    alias(libs.plugins.multimodule.hilt)
}

android {
    // Partially in AndroidKotlin.kt and partially in AppConfigPlugin
//    namespace = "com.example.multimodulebuildlogic"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.example.multimodulebuildlogic"
//        minSdk = 24
//        targetSdk = 35
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
    // In AndroidKotlin.kt
//    kotlinOptions {
//        jvmTarget = "11"
//    }
    // In compose feature
//    buildFeatures {
//        compose = true
//    }
}

dependencyGuard {
    configuration("releaseRuntimeClasspath") {
        allowedFilter = {
            // Disallow dependencies with a name containing "junit"
            !it.contains("junit")
        }
    }
    configuration("debugRuntimeClasspath") {
//        tree = true
        allowedFilter = {
            // Disallow dependencies with a name containing "junit"
            !it.contains("junit")
        }
    }
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.core.design)

    testImplementation(projects.core.testing)
    androidTestImplementation(projects.core.testing)
}