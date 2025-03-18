plugins {
    alias(libs.plugins.multimodule.library)
    alias(libs.plugins.multimodule.library.compose)
}

android {
    namespace = "nl.barbarossa040.multimodule.core.design"
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.util)
    api(libs.accompanist.navigation.animation)
    api(libs.androidx.core.ktx)

    implementation(libs.coil.kt.compose)

    testImplementation(libs.coil.kt.compose)
    testImplementation(libs.hilt.android.testing)

    androidTestImplementation(libs.androidx.compose.ui.test)
}