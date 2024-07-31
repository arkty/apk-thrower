# apk thrower

Simple android app & gradle script that can generate apk with any package, version and code. Made for testing apk parsers and distribution platform.

#### Example usage

##### Generate single apk
This will generate `com.example.app-1.0.1(10110).apk` build in project directory.
```
./gradlew assembleDebug -PversionName=1.0.1 -PversionCode=10110 -PapplicationId=com.example.app
```
