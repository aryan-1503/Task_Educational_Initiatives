package com.astronaut.schedule;

public class TaskFactory {
    public Task createTask(String description, String startTime, String endTime, String priorityLevel) {
        return new Task(description, startTime, endTime, priorityLevel);
    }
}
