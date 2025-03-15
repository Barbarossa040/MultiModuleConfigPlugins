plugins {
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.multimodule.application)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.dependencyGuard)
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
    buildFeatures {
        compose = true
    }
}

dependencyGuard {
    configuration("releaseRuntimeClasspath")
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}