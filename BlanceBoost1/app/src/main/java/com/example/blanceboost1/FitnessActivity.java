package com.example.blanceboost1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class FitnessActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private WorkoutPlanAdapter workoutPlanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        viewPager = findViewById(R.id.viewPager);

        List<WorkoutPlan> workoutPlans = new ArrayList<>();
        workoutPlans.add(new WorkoutPlan("Intensity Beginner Level", R.drawable.beginner,
                "These exercises are great for starting a fitness routine that can be performed without any special equipment",
                "- 10x Jumping Jacks\n- 5x Push-Ups\n- 10x Bodyweight Squats\n- 20-second Planks"));

        workoutPlans.add(new WorkoutPlan("Intensity Intermediate Level", R.drawable.intermediate,
                "These exercises are designed to challenge your strength, balance, and endurance",
                "- 5x Burpees\n- 10x Lunges\n- 10x Pull-Ups\n- 10x Russian Twists"));

        workoutPlans.add(new WorkoutPlan("Intensity level spartans", R.drawable.spartan,
                "Training known for intensity and demand for full-body strength and endurance",
                "- Tire Flips\n- Battle Ropes\n- Box Jumps\n- Weighted Pull-Ups"));

        workoutPlanAdapter = new WorkoutPlanAdapter(workoutPlans, workoutPlan -> {
            // Handle button click
            Toast.makeText(FitnessActivity.this, "Workout: " + workoutPlan.getIntensityLevel(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(FitnessActivity.this, WebViewActivity.class);
            startActivity(intent);
        });

        viewPager.setAdapter(workoutPlanAdapter);
    }
}
