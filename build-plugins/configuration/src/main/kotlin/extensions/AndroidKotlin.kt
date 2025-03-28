package extensions

import com.android.build.api.dsl.CommonExtension
import config.Config
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.configureAndroidKotlin(
    extension: CommonExtension<*, *, *, *, *, *>,
) {
    with(extension) {
        namespace = Config.android.nameSpace
        compileSdk = Config.android.compileSdkVersion

        // Default config block across android-library and android-application
        defaultConfig.apply {
            minSdk = Config.android.minSdkVersion
            testInstrumentationRunner = "androidx.test.runner.AndroidJunitRunner"
            vectorDrawables.useSupportLibrary = true
        }

        // compileOptions
        compileOptions {
            sourceCompatibility = Config.jvm.javaVersion
            targetCompatibility = Config.jvm.javaVersion
        }

        // Packaging configuration
        packaging {
            resources.excludes += setOf(
                // Exclude AndroidX version files
                "META-INF/*.version",
                // Exclude consumer proguard files
                "META-INF/proguard/*",
                // Exclude the Firebase/Fabric/other random properties files
                "/*.properties",
                "fabric/*.properties",
                "META-INF/*.properties",
                // License files
                "LICENSE*",
                // Exclude Kotlin unused files
                "META-INF/**/previous-compilation-data.bin",
                "META-INF/gradle/incremental.annotation.processors"
            )
        }
    }

    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
}