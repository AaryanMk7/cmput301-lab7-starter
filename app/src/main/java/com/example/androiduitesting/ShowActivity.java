package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("CITY_NAME")) {
            String cityName = intent.getStringExtra("CITY_NAME");
            cityNameText.setText(cityName);
        }

        backButton.setOnClickListener(v -> finish()); // Go back
    }
}