package com.awwhome.specialbroadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by awwho on 2017/3/4.
 */
public class ScreenBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "ScreenBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "onReceive: ");
    }
}
