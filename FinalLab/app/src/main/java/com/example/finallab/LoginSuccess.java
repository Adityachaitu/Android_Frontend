package com.example.finallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginSuccess extends AppCompatActivity {

    private TextView textViewDisplayInput;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        textViewDisplayInput = findViewById(R.id.mailid);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");

        textViewDisplayInput.setText(email);

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            Intent intent1 = new Intent(LoginSuccess.this, MainActivity.class);
            startActivity(intent1);
        });
    }
}