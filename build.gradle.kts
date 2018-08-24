import org.spongepowered.gradle.sort.*


buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("org.spongepowered:sponge-gradle-plugin:0.9.0-SNAPSHOT")
    }
}
apply(plugin = "sponge-gradle-plugin")

group = properties["pluginGroup"]!!
version = properties["pluginVersion"]!!

dependencies {
    "compile"("org.spongepowered:spongeapi:7.0.0")
}

configure<SortFieldsExtension> {

    group.create("com.gabizou.sorttest") {
        files = mutableListOf("DerpSort")
    }

}
//
//sponge.plugin.id = properties["pluginId"] as String
