package com.example.rickmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.Theme_RickMorty);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}