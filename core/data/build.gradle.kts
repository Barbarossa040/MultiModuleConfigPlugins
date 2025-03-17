plugins {
    alias(libs.plugins.multimodule.library)
    alias(libs.plugins.multimodule.hilt)
}

android {
    namespace = "nl.barbarossa040.core.data"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    api(projects.core.common)
    implementation(projects.core.model)

    api(libs.retrofit.core)
    api(libs.javax.inject)
    api(libs.gson)
    api(libs.scalars)
    api(libs.okhttp.logging)

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.svg)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}