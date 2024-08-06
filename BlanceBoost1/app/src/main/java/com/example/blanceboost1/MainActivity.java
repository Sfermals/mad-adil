package com.example.blanceboost1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button fitnessButton, nutritionButton, wellnessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        fitnessButton = findViewById(R.id.fitnessButton);
        nutritionButton = findViewById(R.id.nutritionButton);
        wellnessButton = findViewById(R.id.wellnessButton);

        // Set click listeners for each button
        fitnessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Fitness Activity
                Intent intent = new Intent(MainActivity.this, FitnessActivity.class);
                startActivity(intent);
            }
        });

        nutritionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Nutrition Activity
                Intent intent = new Intent(MainActivity.this, NutritionActivity.class);
                startActivity(intent);
            }
        });

        wellnessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ProfilesActivity
                Intent intent = new Intent(MainActivity.this, ProfilesActivity.class);
                startActivity(intent);
            }
        });
    }
}
