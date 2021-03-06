package com.dsvag.lib

import Dependencies
import org.gradle.api.Plugin
import org.gradle.api.Project

class ResolutionStrategyPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.configurations.configureEach {
            resolutionStrategy.force(
                Dependencies.AndroidX.Core,
                Dependencies.Compose.Compiler,
                Dependencies.Kotlin.Stdlib,
                Dependencies.Kotlin.StdlibJdk8,
            )
        }
    }
}
