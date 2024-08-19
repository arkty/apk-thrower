# apk thrower

Simple android app & gradle script that can generate apk with any package, version, code and size.
Made for testing apk parsers and distribution platform.

#### Example usage

##### Generate single apk
This will generate `com.example.app-1.0.1(10110).apk` build in project directory.
```
./gradlew assembleDebug -PversionName=1.0.1 -PversionCode=10110 -PapplicationId=com.example.app
```

#### Set apk size
This will create a file inside project with specific size.
```
./gradlew setApkSize  -PapkSizeMb=14
```
