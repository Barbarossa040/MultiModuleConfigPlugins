package extensions

import org.gradle.api.Project
import org.gradle.api.artifacts.ExternalModuleDependencyBundle
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.plugins.PluginManager
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType
import java.util.Optional

internal fun Project.versionCatalog(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun VersionCatalog.pluginIdFromAlias(alias: String) : String {
    return findPlugin(alias).get().get().pluginId
}

internal fun VersionCatalog.findVersionString(alias: String) : String {
    return findVersion(alias).get().toString()
}

internal fun VersionCatalog.getBundle(alias: String) : Provider<ExternalModuleDependencyBundle> {
    return findBundle(alias).get()
}

internal fun VersionCatalog.getLibrary(alias: String) : Provider<MinimalExternalModuleDependency> {
    return findLibrary(alias).get()
}

internal fun Project.applyPluginFromAlias(alias: String) {
    pluginManager.apply(versionCatalog().pluginIdFromAlias(alias))
}
