package com.snapbyte;

import java.util.Scanner;

public class TaskAdd {
    public static void addTask(Scanner scanner, TaskManager taskManager) {
        System.out.println("Adding a new task...");

        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();

        // Create a new Task object
        Task newTask = new Task(title, description, dueDate);

        // Add the new task to the task manager
        taskManager.addTask(newTask);
    }
}
