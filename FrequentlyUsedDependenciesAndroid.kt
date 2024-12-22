

// Android lifecycle extensions for Compose
// uses lifecycle ktx version

val lifecycleVersion = "2.8.7"

implementation("androidx.lifecycle:lifecycle-runtime-compose:$lifecycleVersion")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion")

// <============================================================================>

// Jetpack Navigation for Compose i.e: Compose Navigation
// versin ref at https://developer.android.com/jetpack/androidx/releases/navigation

// type safe navigation uses serialization so include kotlinx serialization plugin first to use that
implementation("androidx.navigation:navigation-compose:2.8.5") 

// <============================================================================>

// COIL Compose
// version ref at https://github.com/coil-kt/coil
val coilVersion = "3.0.4"
implementation("io.coil-kt.coil3:coil-compose:$coilVersion")

// extension for loading images from internet using okhttp engine
implementation("io.coil-kt.coil3:coil-network-okhttp:$coilVersion")

// extension for gif support 
implementation("io.coil-kt.coil3:coil-gif:$coilVersion")

// <============================================================================>

// Ktor client for Android 
// version ref at https://ktor.io/docs/releases.html#release-details

val ktorVersion = "3.0.2"

implementation("io.ktor:ktor-client-android:$ktorVersion")
implementation("io.ktor:ktor-client-core:$ktorVersion")

// kotlinx serialization extensions
implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")

//optional - logging extension
implementation("io.ktor:ktor-client-logging:$ktorVersion")


// <============================================================================>


// Kotlinx Serialization plugin
// module level plugin uses kotlin version
id("org.jetbrains.kotlin.plugin.serialization") version 2.1.0 


// json extension library
// version ref at https://github.com/Kotlin/kotlinx.serialization/releases
implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")

// <============================================================================>

// ksp plugin
// version ref at https://github.com/google/ksp/releases

id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false // project level
id("com.google.devtools.ksp") // module level

// <============================================================================>

// Room Database for Android
// Version ref at https://developer.android.com/jetpack/androidx/releases/room

val roomVersion = "2.6.1"

implementation("androidx.room:room-runtime:$roomVersion")
implementation("androidx.room:room-ktx:$roomVersion")
ksp("androidx.room:room-compiler:$roomVersion") // include ksp plugin first to use this

// optional - Paging 3 Integration
implementation("androidx.room:room-paging:$roomVersion")

// <============================================================================>


