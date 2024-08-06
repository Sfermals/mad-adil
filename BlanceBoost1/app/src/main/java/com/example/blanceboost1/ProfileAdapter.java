package com.example.blanceboost1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {

    private final List<Profile> profiles;

    public ProfileAdapter(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profile_item, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        Profile profile = profiles.get(position);
        holder.profileName.setText(profile.getName());
        holder.profileDescription.setText(profile.getDescription());
        holder.profileImage.setImageResource(profile.getProfileImageResId());
        holder.activityImage.setImageResource(profile.getActivityImageResId());
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    static class ProfileViewHolder extends RecyclerView.ViewHolder {
        TextView profileName;
        TextView profileDescription;
        ImageView profileImage;
        ImageView activityImage;

        ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            profileName = itemView.findViewById(R.id.profileName);
            profileDescription = itemView.findViewById(R.id.profileDescription);
            profileImage = itemView.findViewById(R.id.profileImage);
            activityImage = itemView.findViewById(R.id.activityImage);
        }
    }
}