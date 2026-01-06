# Text Tools - Android App

A simple, offline text manipulation utility app for Android.

## Features

- **TO UPPERCASE** - Converts entire text to uppercase
- **TO LOWERCASE** - Converts entire text to lowercase
- **TITLE CASE** - Capitalizes the first letter of each word
- **REMOVE EXTRA SPACES** - Removes leading/trailing spaces and collapses multiple spaces
- **REVERSE TEXT** - Reverses text character-by-character
- **CLEAR TEXT** - Clears all text instantly
- **COPY** - Copies text to clipboard
- **SHARE** - Shares text via Android share sheet

## Requirements

- Android Studio Hedgehog (2023.1.1) or later
- JDK 11 or later
- Android SDK with API level 24 (Android 7.0) or higher
- Target SDK: 36

## Running the Project

### Option 1: Using Android Studio (Recommended)

1. **Open the Project**
   - Launch Android Studio
   - Click "Open" or "File → Open"
   - Navigate to the project folder (`D:\APP\Kotlin Apps`)
   - Select the project root folder and click "OK"

2. **Wait for Gradle Sync**
   - Android Studio will automatically sync the Gradle files
   - Wait for the sync to complete (check the bottom status bar)
   - If prompted, accept the Gradle wrapper download

3. **Set up an Emulator or Connect a Device**
   
   **Using Emulator:**
   - Click "Device Manager" (phone icon in toolbar)
   - Click "Create Device"
   - Select a device (e.g., Pixel 5)
   - Download a system image (API 24 or higher)
   - Click "Finish" and start the emulator
   
   **Using Physical Device:**
   - Enable Developer Options on your Android device
   - Enable USB Debugging
   - Connect device via USB
   - Allow USB debugging when prompted

4. **Run the App**
   - Click the green "Run" button (▶) in the toolbar
   - Or press `Shift + F10` (Windows/Linux) or `Ctrl + R` (Mac)
   - Select your device/emulator from the list
   - The app will build and install automatically

### Option 2: Using Command Line

1. **Open Terminal/Command Prompt**
   - Navigate to the project directory:
     ```bash
     cd "D:\APP\Kotlin Apps"
     ```

2. **Build the Project**
   ```bash
   # Windows
   gradlew.bat assembleDebug
   
   # Linux/Mac
   ./gradlew assembleDebug
   ```

3. **Install on Connected Device**
   ```bash
   # Windows
   gradlew.bat installDebug
   
   # Linux/Mac
   ./gradlew installDebug
   ```

   **Note:** Make sure you have:
   - An Android device connected via USB with USB debugging enabled
   - OR an Android emulator running
   - ADB (Android Debug Bridge) in your PATH

## Building for Release

To build an APK for release:
```bash
gradlew.bat assembleRelease
```

To build an AAB (Android App Bundle) for Google Play Store:
```bash
gradlew.bat bundleRelease
```

The output files will be in:
- APK: `app/build/outputs/apk/release/app-release.apk`
- AAB: `app/build/outputs/bundle/release/app-release.aab`

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/com/texttool/app/
│       │   └── MainActivity.kt          # Main activity with all logic
│       ├── res/
│       │   ├── layout/
│       │   │   └── activity_main.xml    # UI layout
│       │   └── values/
│       │       ├── strings.xml           # String resources
│       │       └── themes.xml            # App themes
│       └── AndroidManifest.xml           # App manifest
└── build.gradle.kts                      # App build configuration
```

## Troubleshooting

### Gradle Sync Failed
- Make sure you have internet connection (for downloading dependencies)
- Try: `File → Invalidate Caches → Invalidate and Restart`

### Build Errors
- Ensure JDK 11+ is installed and configured in Android Studio
- Check: `File → Project Structure → SDK Location`

### App Won't Install
- Check if USB debugging is enabled on your device
- Try: `adb devices` to verify device connection
- Make sure the device meets minimum SDK requirement (API 24)

### Emulator Issues
- Ensure HAXM or Hyper-V is enabled (for Windows)
- Allocate at least 2GB RAM to the emulator

## Privacy & Permissions

This app:
- ✅ Requires **NO permissions**
- ✅ Works **100% offline**
- ✅ Does **NOT** collect any data
- ✅ Does **NOT** use internet
- ✅ All processing is done locally on device

## License

This project is ready for Google Play Store submission.

