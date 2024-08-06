package com.example.blanceboost1;

public class WorkoutPlan {
    private String intensityLevel;
    private int imageResource;
    private String description;
    private String details;

    public WorkoutPlan(String intensityLevel, int imageResource, String description, String details) {
        this.intensityLevel = intensityLevel;
        this.imageResource = imageResource;
        this.description = description;
        this.details = details;
    }

    public String getIntensityLevel() {
        return intensityLevel;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }
}

