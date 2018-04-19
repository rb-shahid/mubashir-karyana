package com.byteshaft.dukaan;


import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Objects;

public class FirebaseMessageService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String name = Objects.requireNonNull(remoteMessage.getNotification()).getBody();
        AppGlobals.saveDataToSharedPreferences("msg", name);
    }
}
