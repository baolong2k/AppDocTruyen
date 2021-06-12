package com.example.appdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManStartt extends AppCompatActivity {
    Button mLogin, mRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_startt);
        mLogin = findViewById(R.id.btnLogin);
        mRegis = findViewById(R.id.btnRegis);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManStartt.this,ManDangNhap.class);
                startActivity(intent);
            }
        });
        mRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManStartt.this,ManDangKy.class);
                startActivity(intent);
            }
        });
    }
}