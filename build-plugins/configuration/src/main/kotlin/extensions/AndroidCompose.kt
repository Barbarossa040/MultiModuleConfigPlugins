package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    extension: CommonExtension<*, *, *, *, *, *>
) {
    with(pluginManager) {
        // Compose compiler is mandatory for all modules using Compose
        applyPluginFromAlias("kotlin-compose")
    }

    extension.apply {
        val libs = versionCatalog()

        buildFeatures.compose = true

        composeOptions.kotlinCompilerExtensionVersion =
            libs.findVersionString("compose-compiler")

        dependencies {
            val bom = libs.getLibrary("androidx-compose-bom")
            add("implementation", platform(bom))
            add("androidTestImplementation", platform(bom))
            add("implementation", libs.getLibrary("androidx-activity-compose"))
            add("implementation", libs.getLibrary("androidx-compose-ui-tooling-preview"))
            add("debugImplementation", libs.getLibrary("androidx-compose-ui-tooling"))
        }
    }
}