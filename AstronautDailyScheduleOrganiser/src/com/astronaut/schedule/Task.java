package com.astronaut.schedule;

public class Task {
    private String description;
    private String startTime;
    private String endTime;
    private String priorityLevel;
    private boolean isCompleted;

    public Task(String description, String startTime, String endTime, String priorityLevel) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priorityLevel = priorityLevel;
        this.isCompleted = false;
    }

    public String getDescription() { return description; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public String getPriorityLevel() { return priorityLevel; }
    public boolean isCompleted() { return isCompleted; }

    public void setCompleted(boolean completed) { this.isCompleted = completed; }

    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priorityLevel + "]" + (isCompleted ? " [Completed]" : "");
    }
}
