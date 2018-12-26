plugins {
    `kotlin-dsl`
}
repositories {
    jcenter()
}
sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
}