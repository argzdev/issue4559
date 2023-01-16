# issue 4559
### Prerequisite
- Replace google-services.json
- Enable Firebase Cloud Messaging from Firebase console
### Summary
- Once the user receives a push notification, the app process is triggered and does not terminate.
### Scenario Test
1. App is installed but not opened
2. Send notification via Firebase Console
3. Do not check phone notification
4. Run `adb shell ps -A` in terminal to check all active processes
* Expected Behavior: App process should terminate a few minutes after receiving the notification
* Actual Behavior: App process is retained even after 10 minutes
