plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.5.0"
}

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaUltimate("2025.1")
        bundledPlugin("com.intellij.java")
    }
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellijPlatform {
    group = "varme.pw"
    version = "1.2.0"
    buildSearchableOptions.set(false)
    pluginConfiguration {
        id = "varme.pw.oceanic-dark-theme"
        name = "Oceanic Dark Theme"
        ideaVersion {
            untilBuild = provider { null }
        }
        changeNotes =
            """
            <h3>v1.2.0</h3>
            <ul>
            <li>Update border colors for better contrast</li>
            <li>Improve Git history cursor inactive selections</li>
            <li>Dependencies update</li>
            </ul>
            <h3>v1.1.9</h3>
            <ul>
            <li>Fix refactor popup table</li>
            </ul>
            <h3>v1.1.8</h3>
            <ul>
            <li>Compatibility with IU-241.*</li>
            </ul>
            <h3>v1.1.7</h3>
            <ul>
            <li>Change stop widget red color</li>
            <li>Fix tree selection background</li>
            <li>Add unused element foreground</li>
            </ul>
            <h3>v1.1.6</h3>
            <ul>
            <li>Compatibility with IU-233.* and New UI</li>
            </ul>
            <h3>v1.1.5</h3>
            <ul>
            <li>Compatibility with IU-223.*</li>
            </ul>
            <h3>v1.1.4</h3>
            <ul>
            <li>Compatibility with IU-222.*</li>
            </ul>
            <h3>v1.1.3</h3>
            <ul>
            <li>Fix sidebar color</li>
            <li>Fix radio button color</li>
            <li>Fix vsc branch search color</li>
            <li>Change lessons color</li>
            <li>Change popups accent color</li>
            <li>Change editor border color</li>
            <li>Small tree indent</li>
            </ul>
            <h3>v1.1.2</h3>
            <ul>
            <li>Compatibility with IU-221.*</li>
            </ul>
            <h3>v1.1.1</h3>
            <ul>
            <li>Compatibility with IU-213.*</li>
            </ul>
            <h3>v1.1.0</h3>
            <ul>
            <li>Changed Get from VCS window selection background</li>
            </ul>
            <h3>v1.0.9</h3>
            <ul>
            <li>Changed Popups and Hints background completion</li>
            </ul>
            <h3>v1.0.8</h3>
            <ul>
            <li>Compatibility with IU-212.*</li>
            </ul>
            <h3>v1.0.7</h3>
            <ul>
            <li>Changed DragAndDrop area background</li>
            <li>Fix Server mapping background</li>
            </ul>
            <h3>v1.0.6</h3>
            <ul>
            <li>Fix Golang color</li>
            <li>Fix JS/TypeScript color</li>
            <li>Fixed selection foreground</li>
            <li>Fix Py color</li>
            </ul>
            <h3>v1.0.5</h3>
            <ul>
            <li>Changed doc comment color</li>
            <li>Changed default keyword and string color</li>
            <li>Changed Golang style</li>
            <li>Fixed selection foreground</li>
            <li>Fixed console style</li>
            <li>Fixed SASS comment style</li>
            </ul>
            """.trimIndent()
    }
    publishing {
        token = System.getenv("oceanicDark_intellijPublishToken")
    }
}
