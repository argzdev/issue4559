package com.argz.issue4559

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        log("New token: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        log("New message from fcm: $message")
    }
}