plugins {
    alias(libs.plugins.multimodule.library)
    alias(libs.plugins.multimodule.library.compose)
}

android {
    namespace = "nl.barbarossa040.multimodule.core.ui"
}

dependencies {
    implementation(projects.core.design)

    implementation(libs.compose.lottie)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
}