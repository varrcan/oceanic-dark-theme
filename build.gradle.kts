plugins {
    id("org.jetbrains.intellij") version "0.7.2"
    java
}

group = "varme.pw"
version = "1.0.7"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2021.1"
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
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
      """)
}
