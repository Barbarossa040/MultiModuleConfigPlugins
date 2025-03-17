package plugins

import com.android.build.api.dsl.ApplicationExtension
import extensions.applyPluginFromAlias
import extensions.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AppComposeConfigurationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            applyPluginFromAlias("android-application")
            val extension = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extension)
        }
    }
}