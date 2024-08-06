package com.example.blanceboost1;

public class Profile {
    private final String name;
    private final String description;
    private final int profileImageResId;
    private final int activityImageResId;

    public Profile(String name, String description, int profileImageResId, int activityImageResId) {
        this.name = name;
        this.description = description;
        this.profileImageResId = profileImageResId;
        this.activityImageResId = activityImageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getProfileImageResId() {
        return profileImageResId;
    }

    public int getActivityImageResId() {
        return activityImageResId;
    }
}