package com.example.bilalbhatti.labno8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

class MyReceiver extends BroadcastReceiver

{
    public MyReceiver(){}

    @Override
    public void onReceive(Context context, Intent intent) {



        Toast.makeText(context,"Broadcast Message Recieved...",Toast.LENGTH_LONG).show();
        Toast.makeText(context,"Action: "+intent.getAction(),Toast.LENGTH_SHORT).show();

    }
}
