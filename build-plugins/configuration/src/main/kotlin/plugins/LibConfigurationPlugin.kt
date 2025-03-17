package plugins

import com.android.build.gradle.LibraryExtension
import extensions.applyPluginFromAlias
import extensions.configureAndroidKotlin
import extensions.configureBuildTypes
import extensions.pluginIdFromAlias
import extensions.versionCatalog
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/**
 * This class handles configuration for modules that need the android application plugin.
 * It does the following:
 * - Apply necessary plugins: android library, kotlin android and serialization
 * - Configure buildType logic
 * - Configure android {} logic shared between application and library
 */
class LibConfigurationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            with(pluginManager) {
                applyPluginFromAlias("android-library")
                applyPluginFromAlias("kotlin-android")
                applyPluginFromAlias("kotlin-serialization")
//                val libs = versionCatalog()
//                apply(libs.pluginIdFromAlias("android-library"))
//                apply(libs.pluginIdFromAlias("kotlin-android"))
//                apply(libs.pluginIdFromAlias("kotlinx-serialization"))
            }
            extensions.configure<LibraryExtension> {
                configureAndroidKotlin(this)
                configureBuildTypes(this)
            }
        }
    }
}