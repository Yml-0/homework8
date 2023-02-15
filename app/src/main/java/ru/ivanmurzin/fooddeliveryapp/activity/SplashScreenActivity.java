package ru.ivanmurzin.fooddeliveryapp.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // super heavy logic
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, EnterActivity.class));
        finish();
    }
}