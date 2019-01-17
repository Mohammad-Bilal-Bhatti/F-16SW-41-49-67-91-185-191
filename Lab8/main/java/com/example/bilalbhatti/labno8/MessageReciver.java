package com.example.bilalbhatti.labno8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.OnNmeaMessageListener;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MessageReciver extends BroadcastReceiver {

    private static MessageListener myMessageListener;
    public static void bindListener(MessageListener listener){
        myMessageListener=listener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle data = intent.getExtras();
        Object[] pdus = (Object[]) data.get("pdus");
        for(int i=0; i<pdus.length; i++){
            SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdus[i]);
        /*    String message = "Sender : " + smsMessage.getDisplayOriginatingAddress()
                    + "Email From: " + smsMessage.getEmailFrom()
                    + "Emal Body: " + smsMessage.getEmailBody()
                    + "Display message body: " + smsMessage.getDisplayMessageBody()
                    + "Time in millisecond: " + smsMessage.getTimestampMillis()
                    + "Message: " + smsMessage.getMessageBody();
         */
            String message = smsMessage.getMessageBody();
            myMessageListener.messageRecieved(message);
        }
    }
}
