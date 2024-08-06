package com.example.blanceboost1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WorkoutPlanAdapter extends RecyclerView.Adapter<WorkoutPlanAdapter.WorkoutViewHolder> {

    private List<WorkoutPlan> workoutPlans;
    private OnWorkoutClickListener listener;

    public WorkoutPlanAdapter(List<WorkoutPlan> workoutPlans, OnWorkoutClickListener listener) {
        this.workoutPlans = workoutPlans;
        this.listener = listener;
    }

    @NonNull
    @Override
    public WorkoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_workout_page, parent, false);
        return new WorkoutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutViewHolder holder, int position) {
        WorkoutPlan workoutPlan = workoutPlans.get(position);
        holder.intensityLevel.setText(workoutPlan.getIntensityLevel());
        holder.workoutImage.setImageResource(workoutPlan.getImageResource());
        holder.workoutDescription.setText(workoutPlan.getDescription());
        holder.workoutDetails.setText(workoutPlan.getDetails());
        holder.letDoThisButton.setOnClickListener(v -> listener.onWorkoutClick(workoutPlan));
    }

    @Override
    public int getItemCount() {
        return workoutPlans.size();
    }

    static class WorkoutViewHolder extends RecyclerView.ViewHolder {
        TextView intensityLevel;
        ImageView workoutImage;
        TextView workoutDescription;
        TextView workoutDetails;
        Button letDoThisButton;

        public WorkoutViewHolder(@NonNull View itemView) {
            super(itemView);
            intensityLevel = itemView.findViewById(R.id.intensityLevel);
            workoutImage = itemView.findViewById(R.id.workoutImage);
            workoutDescription = itemView.findViewById(R.id.workoutDescription);
            workoutDetails = itemView.findViewById(R.id.workoutDetails);
            letDoThisButton = itemView.findViewById(R.id.letDoThisButton);
        }
    }

    public interface OnWorkoutClickListener {
        void onWorkoutClick(WorkoutPlan workoutPlan);
    }
}
