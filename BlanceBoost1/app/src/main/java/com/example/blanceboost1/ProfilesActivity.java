package com.example.blanceboost1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProfilesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profiles_activity);

        RecyclerView recyclerView = findViewById(R.id.profilesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("Sarah Lily Caddle", "\u000BHi everyone I’m new to this group and did my first ever outdoor run today        \n" +
                "Been running in the gym for about 2 months now and have always wanted to\n" +
                "do a outdoor run so finally felt ready today and was definitely more enjoyable and easier than in the gym Would love to be able to build up to a hour and to run more regularly \n", R.drawable.sarah, R.drawable.sarahrun));
        profiles.add(new Profile("Bailey Baker", "On a refreshing walking exercise, aligning with the department's fervent advocacy for mental and physical wellness. Led by Dr. Maria Rosario Clarissa Signh-Vergeire, Undersecretary of Health.\n" +
                "The morning's journey commenced promptly at 6 a.m. from the Basco town to Chanarian-Tukon, Fundation Pacita up to the historic Japanese Tunnel.\n" +
                "The early morning wellness walk led by DOH officials in Basco was not merely an exercise in physical activity but a profound testament to the department's unwavering commitment to fostering holistic wellness. Through initiatives such as these, the DOH continues to inspire individuals and communities to prioritize their health and embrace a lifestyle of vitality and well-being.\n", R.drawable.bailey, R.drawable.baileywalk));
        profiles.add(new Profile("Adma", "\u000BExercise 30 minutes a day can help you lose weight, which can lower blood pressure\n" +
                "Knee will improve strongest durability .\n", R.drawable.adma, R.drawable.admawalk));
        profiles.add(new Profile("Suhaibar", "When it comes to upper body workouts, I have a few go-to exercises that I feel the most.\n" +
                "One of them is the incline dumbbell press.\n" +
                "It's much eThis exercise not only targets the upper chest but also stimulates the front delts and triceps.\n" +
                "asier on the shoulder joint, allowing for a greater range of motion and causing less aggravation compared to a flat dumbbell press\n", R.drawable.suhaibar, R.drawable.suhaibaractivity));
        profiles.add(new Profile("Favour Ex", "I am told that post age 30...", R.drawable.favour, R.drawable.intermediate));

        ProfileAdapter adapter = new ProfileAdapter(profiles);
        recyclerView.setAdapter(adapter);
    }
}