package plugins

import extensions.applyPluginFromAlias
import extensions.getBundle
import extensions.getLibrary
import extensions.versionCatalog
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltConfigurationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            applyPluginFromAlias("ksp")
            applyPluginFromAlias("hilt")

            dependencies {
                val libs = versionCatalog()
                add("api", libs.getBundle("hilt"))
                add("testApi", libs.getLibrary("hilt-android-testing"))
                add("ksp", libs.getLibrary("hilt-compiler"))
            }
        }
    }
}