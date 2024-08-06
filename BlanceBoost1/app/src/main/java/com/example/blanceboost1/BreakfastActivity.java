package com.example.blanceboost1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;

public class BreakfastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Load image using Glide
        ImageView breakfastImageView = findViewById(R.id.breakfastImageView);
        Glide.with(this)
                .load(R.drawable.healthyporridgebowl) // Ensure this matches your actual image resource
                .override(200, 200) // Use smaller dimensions for testing
                .fitCenter() // Ensures the image fits within the bounds
                .into(breakfastImageView);

        // Initialize your RecyclerView and Adapter
        List<Meal> mealList = new ArrayList<>();
        mealList.add(new Meal("Healthy porridge bowl", "Start your day right with this filling bowl of oats, berries, banana and seeds. It's healthy and packed with nutrients to fuel body and mind", R.drawable.healthyporridgebowl));
        mealList.add(new Meal("Cinnamon baked bananas", "Add fibre-rich bananas and bio yogurt to your breakfast porridge. Including live yogurt in your diet may support the digestive system and aid immune defenses", R.drawable.healthybanana));
        mealList.add(new Meal("Overnight oats", "Add fibre-rich bananas and bio yogurt to your breakfast porridge. Including live yogurt in your diet may support the digestive system and aid immune defenses", R.drawable.overnightoats));
        mealList.add(new Meal("Protein-Packed Blueberry Lemon Ricotta Pancakes", "Thanks to the Greek yogurt, eggs, and either low-fat cottage cheese or ricotta, this breakfast pulls out all the high-protein stops to jumpstart weight loss.", R.drawable.proteinpancake));
        mealList.add(new Meal("Keto scrambled eggs", "Keto scrambled eggs are one of the most satisfying ways to start the day when you're on a keto diet. I'll show you how to make soft and creamy scrambled eggs. They are ready in 5 minutes and contain just 0.9g net carbs.", R.drawable.eggs));

        MealAdapter adapter = new MealAdapter(mealList);
        recyclerView.setAdapter(adapter);

        Button bringMeThereButton = findViewById(R.id.bring_me_there_button);
        bringMeThereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.smoothScrollToPosition(0);
            }
        });
    }
}
