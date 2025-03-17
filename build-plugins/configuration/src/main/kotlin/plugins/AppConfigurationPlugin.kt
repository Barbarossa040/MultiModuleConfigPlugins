package plugins

import com.android.build.api.dsl.ApplicationExtension
import config.Config
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
 * - Apply necessary plugins: android application, kotlin android and dependency guard
 * - Configure application specific configuration like targetSdk.
 * - Configure buildType logic
 * - Configure android {} logic shared between application and library
 */
class AppConfigurationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            with(pluginManager) {
                // Plugins necessary for
//                val libs = versionCatalog()
                applyPluginFromAlias("android-application")
                applyPluginFromAlias("kotlin-android")
                applyPluginFromAlias("dependencyGuard")
//                apply(libs.pluginIdFromAlias("android-application"))
//                apply(libs.pluginIdFromAlias("kotlin-android"))
//                apply(libs.pluginIdFromAlias("dependencyGuard"))
            }

            extensions.configure<ApplicationExtension> {
                // Android-application specific defaultConfig block
                defaultConfig.apply {
                    targetSdk = Config.android.targetSdkVersion
                    applicationId = Config.android.applicationId
                    versionCode = Config.android.versionCode
                    versionName = Config.android.versionName
                }
                configureBuildTypes(this)
                configureAndroidKotlin(this)
            }
        }
    }
}