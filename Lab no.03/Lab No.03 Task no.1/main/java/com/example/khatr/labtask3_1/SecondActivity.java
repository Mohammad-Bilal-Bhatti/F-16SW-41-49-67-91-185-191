package com.example.khatr.labtask3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button loginBtn;
    EditText userName,passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        onLoginBtnClick();
    }
    public void onLoginBtnClick() {
        loginBtn = findViewById(R.id.loginBtn);
        userName = findViewById(R.id.userText);
        passWord = findViewById(R.id.passText);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = getIntent().getExtras();
                String user_Name = userName.getText().toString().toLowerCase();
                String pass_Word = passWord.getText().toString().toLowerCase();
                String myUser = extras.getString("Username");
                String myPass = extras.getString("Password");
                //System.out.println(user_Name+ " " + pass_Word);
                //System.out.println(myUser+ " : "+myPass);
                if(user_Name.equals(myUser) && pass_Word.equals(myPass)) {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("Username",extras.getString("Username"));
                    intent.putExtra("Email",extras.getString("Email"));
                    intent.putExtra("Gender",extras.getString("Gender"));
                    startActivity(intent);
                }

            }
        });
    }
}
