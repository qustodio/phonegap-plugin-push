package com.adobe.phonegap.push;

import com.appboy.AppboyFirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class ProxyFCMService extends FCMService {

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    boolean isForBraze = AppboyFirebaseMessagingService.handleBrazeRemoteMessage(this, remoteMessage);
    if (!isForBraze) {
      super.onMessageReceived(remoteMessage);
    }
  }
}
