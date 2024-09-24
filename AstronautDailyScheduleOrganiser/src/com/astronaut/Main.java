package com.astronaut;

import com.astronaut.schedule.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter start time (HH:mm):");
                    String startTime = scanner.nextLine();
                    System.out.println("Enter end time (HH:mm):");
                    String endTime = scanner.nextLine();
                    System.out.println("Enter priority level (Low, Medium, High):");
                    String priority = scanner.nextLine();

                    Task task = taskFactory.createTask(description, startTime, endTime, priority);
                    manager.addTask(task);
                    break;

                case 2:
                    System.out.println("Enter task description to remove:");
                    String removeDescription = scanner.nextLine();
                    manager.removeTask(removeDescription);
                    break;

                case 3:
                    manager.viewTasks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
