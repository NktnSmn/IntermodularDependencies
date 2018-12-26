object AppConfig {
    val id = "com.nktnsmn.intermodulardependencies"
    val versionCode = 1
    val versionName = "1.0"
}

object Modules {
    val common = ":common"
    val featuresAPI = ":featuresAPI"
    val disk = ":disk"
    val news = ":news"
    val messenger = ":messenger"
}

object Versions {
    val gradle = "3.2.1"

    val minSdk = 21
    val compileSdk = 28
    val targetSdk = 28

    val kotlin = "1.3.11"
    val dagger = "2.19"

    val androidSupport = "28.0.0"
}

object Libraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val androidSupportV7 = "com.android.support:appcompat-v7:${Versions.androidSupport}"

    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
}

object AnnotationProcessor {
    val daggerKapt = "com.google.dagger:dagger-compiler:${Versions.dagger}"
}

object OtherSettings {
    val srcDirs = "src/main/kotlin"
}
