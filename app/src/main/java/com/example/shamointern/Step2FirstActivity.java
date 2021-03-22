package com.example.shamointern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Step2FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2_first);
        getSupportActionBar().hide();
    }
}