@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.example.mycompass"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mycompass"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
   // implementation(libs.androidx.lifecycle)
    //implementation(libs.androidx.navigation)



  //  implementation(fileTree(mapof("dir" to  "libs", "include" to listOf ("*.jar"))))
//    implementation("androidx.appcompat:appcompat:1.3.1")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.1")

    // Add the following dependencies
    //implementation("androidx.core:core-ktx:1.7.0")
   implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")

    // Sensor dependencies
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")

}

