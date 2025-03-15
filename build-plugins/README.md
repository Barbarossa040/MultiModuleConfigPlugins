# configuration Plugins

The `build-plugins` folder defines project-specific configuration plugins, used to keep a single
source of truth for common module configurations.

This approach is heavily based on
[https://developer.squareup.com/blog/herding-elephants/](https://developer.squareup.com/blog/herding-elephants/)
and
[https://github.com/jjohannes/idiomatic-gradle](https://github.com/jjohannes/idiomatic-gradle).

By setting up configuration plugins in `build-plugins`, we can avoid duplicated build script setup,
messy `subproject` configurations, without the pitfalls of the `buildSrc` directory.

`build-plugins` is an included build, as configured in the root
[`settings.gradle.kts`](../settings.gradle.kts).

Inside `build-plugins` is a `configuration` module, which defines a set of plugins that all normal
modules can use to configure themselves.

`build-plugins` also includes a set of `Kotlin` files used to share logic between plugins themselves,
which is most useful for configuring Android components (libraries vs applications) with shared
code.

These plugins are *additive* and *composable*, and try to only accomplish a single responsibility.
Modules can then pick and choose the configurations they need.
If there is one-off logic for a module without shared code, it's preferable to define that directly
in the module's `build.gradle`, as opposed to creating a configuration plugin with module-specific
setup.

Current list of configuration plugins:

- [`nowinandroid.android.application`](configuration/src/main/kotlin/AndroidApplicationConfigurationPlugin.kt),
  [`nowinandroid.android.library`](configuration/src/main/kotlin/AndroidLibraryConfigurationPlugin.kt),
  [`nowinandroid.android.test`](configuration/src/main/kotlin/AndroidTestConfigurationPlugin.kt):
  Configures common Android and Kotlin options.
- [`nowinandroid.android.application.compose`](configuration/src/main/kotlin/AndroidApplicationComposeConfigurationPlugin.kt),
  [`nowinandroid.android.library.compose`](configuration/src/main/kotlin/AndroidLibraryComposeConfigurationPlugin.kt):
  Configures Jetpack Compose options
