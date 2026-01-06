# TextCraft Utility - Keystore Information

## App Details
- **App Name**: TextCraft Utility
- **Package Name**: com.nts.text.app.converter
- **Version Name**: 1.0
- **Version Code**: 1
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 36 (Android 14+)

## Keystore Details
- **Keystore File**: `app/textcraft-release-key.jks`
- **Keystore Password**: `TextCraft@2026`
- **Key Alias**: `textcraft-key`
- **Key Password**: `TextCraft@2026`
- **Key Algorithm**: RSA 2048-bit
- **Validity**: 10,000 days (~27 years)

## Certificate Information
- **CN**: TextCraft Utility
- **OU**: Development
- **O**: NTS
- **L**: Unknown
- **ST**: Unknown
- **C**: US

## Important Notes
⚠️ **Keep this keystore file and passwords secure!**
- Never commit the keystore file to version control
- Store passwords in a secure location
- Back up the keystore file - if lost, you cannot update your app on Play Store

## Usage
The signing configuration has been added to `build.gradle.kts`. When you build a release APK, it will be automatically signed with this keystore.

To build a signed release APK:
```bash
./gradlew assembleRelease
```

The signed APK will be located at:
`app/build/outputs/apk/release/app-release.apk`
