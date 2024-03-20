package com.abdilahstudio.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Simulate loading time (optional)
        new Handler().postDelayed(() -> {
            // Start your main activity
            Intent intent = new Intent(MainActivity.this, KalkulatorActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // 3 seconds delay (you can adjust this)
    }
}