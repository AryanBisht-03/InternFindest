package com.example.shamointern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shamointern.databinding.ActivityStep2FirstBinding;

public class Step2FirstActivity extends AppCompatActivity {

    ActivityStep2FirstBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStep2FirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step2FirstActivity.this,Step2SecondActivity.class));

            }
        });
    }
}