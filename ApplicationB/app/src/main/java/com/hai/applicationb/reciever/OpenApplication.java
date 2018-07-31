package com.hai.applicationb.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hai.applicationb.activity.SubActivity;

/**
 * Created by Hai on 31/07/2018.
 */

public class OpenApplication extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, SubActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra(SubActivity.MESSAGE, intent.getStringExtra(SubActivity.MESSAGE));
        context.startActivity(i);
    }
}
