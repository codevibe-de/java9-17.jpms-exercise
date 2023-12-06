plugins {
    application
}

application {
    mainModule = "mod.appl"
    mainClass = "de.appl.MainApp"
}

dependencies {
    implementation(project(":mod-libA"))
}