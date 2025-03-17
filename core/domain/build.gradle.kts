plugins {
    alias(libs.plugins.multimodule.library)
    alias(libs.plugins.multimodule.hilt)
}

android {
    namespace = "nl.barbarossa040.core.domain"
}

dependencies {
    api(projects.core.model)
    implementation(projects.core.data)
}