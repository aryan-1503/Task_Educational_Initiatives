package com.astronaut.schedule;

import java.util.ArrayList;
import java.util.List;

public class TaskConflictNotifier {
    private List<ConflictObserver> observers;

    public TaskConflictNotifier() {
        observers = new ArrayList<>();
    }

    public void addObserver(ConflictObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ConflictObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Task task) {
        for (ConflictObserver observer : observers) {
            observer.onConflict(task);
        }
    }
}
