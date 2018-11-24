package com.example.khatr.labtask3_2;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button callBtn,cameraBtn,contactBtn,browserBtn,callLogBtn,galleryBtn,dialPadBtn;
    EditText editText;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClick();
    }
    public void onButtonClick() {
        callBtn = findViewById(R.id.callBtn);
        cameraBtn = findViewById(R.id.cameraBtn);
        contactBtn = findViewById(R.id.contactBtn);
        browserBtn = findViewById(R.id.browserBtn);
        callLogBtn = findViewById(R.id.callLogBtn);
        galleryBtn = findViewById(R.id.galleryBtn);
        dialPadBtn = findViewById(R.id.dailPadBtn);
        editText = findViewById(R.id.editText);
        final String text = editText.getText().toString();
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(text));
                startActivity(i);
            }
        });
        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i);
            }
        });
        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(i);
            }
        });
        browserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.google.com/"));
                startActivity(i);
            }
        });
        callLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://call_log/calls/1"));
                startActivity(i);
            }
        });
        galleryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(i);
            }
        });
        dialPadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse(editText.getText().toString()));
                startActivity(i);
            }
        });
    }
}
