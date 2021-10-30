package com.example.muctieutietkiem.packages.model;

public class Goal {
    private int goalThumb;
    private String goalName;
    private String goalTime;
    private int barThumb;
    private String goalSaved;

    public Goal(int goalThumb, String goalName, String goalTime, int barThumb, String goalSaved) {
        this.goalThumb = goalThumb;
        this.goalName = goalName;
        this.goalTime = goalTime;
        this.barThumb = barThumb;
        this.goalSaved = goalSaved;
    }

    public int getGoalThumb() {
        return goalThumb;
    }

    public void setGoalThumb(int goalThumb) {
        this.goalThumb = goalThumb;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public String getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(String goalTime) {
        this.goalTime = goalTime;
    }

    public int getBarThumb() {
        return barThumb;
    }

    public void setBarThumb(int barThumb) {
        this.barThumb = barThumb;
    }

    public String getGoalSaved() {
        return goalSaved;
    }

    public void setGoalSaved(String goalSaved) {
        this.goalSaved = goalSaved;
    }
}
