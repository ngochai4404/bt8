package com.hai.applicationa.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hai.applicationa.activity.MainActivity;

/**
 * Created by Hai on 31/07/2018.
 */

public class OpenReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra(MainActivity.MESSAGE, intent.getStringExtra(MainActivity.MESSAGE));
        context.startActivity(i);
    }
}
