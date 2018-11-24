package com.example.khatr.labtask3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView user,email,gender;
    private Button btn;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        show();
    }
    public void show() {
        btn = findViewById(R.id.changeBtn);
        imageView = findViewById(R.id.imageView);
        user = findViewById(R.id.userText);
        email = findViewById(R.id.emailText);
        gender = findViewById(R.id.genderText);
        Bundle extras = getIntent().getExtras();
        user.setText(extras.getString("Username"));
        email.setText(extras.getString("Email"));
        gender.setText(extras.getString("Gender"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.eifel_tower);
            }
        });
    }
}
