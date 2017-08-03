package MyTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ExecBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ExecBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object MyTest_CiBuild : BuildType({
    uuid = "8e7d5553-d1d4-4f5e-b72a-64e849cb3f1c"
    extId = "MyTest_CiBuild"
    name = "ci build"
    description = "some test build"

    vcs {
        root("MyTestRepo")

    }

    steps {
        exec {
            path = "test.sh"
        }
    }

    triggers {
        vcs {
        }
    }
})
