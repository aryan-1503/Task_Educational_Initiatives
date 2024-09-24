package com.astronaut.schedule;

public interface ConflictObserver {
    void onConflict(Task conflictingTask);
}
