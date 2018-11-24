package com.example.khatr.labtask3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button signUpBtn;
    private TextView user,pass,dob,email,gender;
    private EditText userText,passText,dobText,emailText;
    private RadioGroup rGender;
    private RadioButton rButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //this.getActionBar().setTitle("Sign Up");
        onClickSignUp();
    }
    public void onClickSignUp() {
        signUpBtn = findViewById(R.id.signUpBtn);
        user = findViewById(R.id.userName);
        userText = findViewById(R.id.passText);
        pass = findViewById(R.id.password);
        passText = findViewById(R.id.passText);
        dob = findViewById(R.id.dob);
        dobText = findViewById(R.id.dateOfBirth);
        email = findViewById(R.id.email);
        emailText = findViewById(R.id.emailText);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Username",userText.getText().toString());
                intent.putExtra("Password",passText.getText().toString());
                intent.putExtra("Email",emailText.getText().toString());
                rGender = findViewById(R.id.rGender);
                rButton = findViewById(rGender.getCheckedRadioButtonId());
                String value = rButton.getText().toString();
                intent.putExtra("Date of Birth",dob.getText().toString());
                intent.putExtra("Gender",value);
                startActivity(intent);
            }
        });
    }
}
