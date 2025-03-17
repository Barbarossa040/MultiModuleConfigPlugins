plugins {
    alias(libs.plugins.multimodule.library)
}

android {
    namespace = "nl.barbarossa040.core.model"
}

dependencies {
    api(libs.kotlinx.datetime)
    api(libs.gson)
}