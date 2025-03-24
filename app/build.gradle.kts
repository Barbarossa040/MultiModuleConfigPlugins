plugins {
    alias(libs.plugins.multimodule.application)
    alias(libs.plugins.multimodule.compose)
    alias(libs.plugins.multimodule.hilt)
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