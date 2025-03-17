plugins {
    alias(libs.plugins.multimodule.library)
    alias(libs.plugins.multimodule.library.compose)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "nl.barbarossa040.multimoduleapp.core.common"
}

dependencies {
    api(libs.compose.paging)
    api(libs.accompanist.swiperefresh)
    api(libs.androidx.navigation.compose)
}