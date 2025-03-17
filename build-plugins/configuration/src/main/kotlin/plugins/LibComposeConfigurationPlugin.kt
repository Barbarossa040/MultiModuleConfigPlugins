package plugins

import com.android.build.gradle.LibraryExtension
import extensions.applyPluginFromAlias
import extensions.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class LibComposeConfigurationPlugin : Plugin<Project>{
    override fun apply(project: Project) {
        with(project) {
            applyPluginFromAlias("android-library")
            val extension = extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extension)
        }
    }
}