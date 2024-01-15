package com.snapbyte;

import java.util.Scanner;

public class SwiftPlannerApp {
    private static TaskManager taskManager = new TaskManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi. Welcome to the SwiftPlanner!");

        int choice;
        do {
            MenuPrinter.printMenu();
            choice = UserInputHandler.getUserChoice(scanner);

            switch (choice) {
                case 1:
                    TaskViewer.viewTasks(taskManager);
                    break;
                case 2:
                    TaskAdd.addTask(scanner, taskManager);
                    break;
                case 3:
                    System.out.println("Exiting SwiftPlanner. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        // Close the scanner
        scanner.close();
    }
}
