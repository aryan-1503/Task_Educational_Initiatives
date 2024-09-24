package com.astronaut.schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance = null;
    private List<Task> taskList;
    private TaskConflictNotifier conflictNotifier;

    private ScheduleManager() {
        taskList = new ArrayList<>();
        conflictNotifier = new TaskConflictNotifier();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        if (validateTask(task)) {
            taskList.add(task);
            System.out.println("Task added successfully: " + task.getDescription());
        } else {
            conflictNotifier.notifyObservers(task);
        }
    }

    public void removeTask(String description) {
        Task task = findTask(description);
        if (task != null) {
            taskList.remove(task);
            System.out.println("Task removed successfully: " + description);
        } else {
            System.out.println("Error: Task not found");
        }
    }

    public void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            taskList.stream()
                    .sorted((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()))
                    .forEach(System.out::println);
        }
    }

    private boolean validateTask(Task newTask) {
        for (Task existingTask : taskList) {
            if (isConflict(existingTask, newTask)) {

                return false;
            }
        }
        return true;
    }

    private boolean isConflict(Task existingTask, Task newTask) {
        return (newTask.getStartTime().compareTo(existingTask.getEndTime()) < 0 &&
                newTask.getEndTime().compareTo(existingTask.getStartTime()) > 0);
    }

    private Task findTask(String description) {
        return taskList.stream().filter(t -> t.getDescription().equals(description)).findFirst().orElse(null);
    }
}
