package com.example.khatr.labtask3_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Recieve extends AppCompatActivity {
    EditText editText;
    Button button;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
        onSubmitClick();
    }
    public void onSubmitClick() {
        button = findViewById(R.id.submitBtn);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("Message", editText.getText().toString());
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });
    }
}
