package com.snapbyte;

import java.util.Scanner;

public class SwiftPlannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi. Welcome to the SwiftPlanner!");

        int choice;
        do {
            System.out.println("\nWhat would you like to do today? ");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Displaying the tasks list...");

                    break;
                case 2:
                    System.out.println("Adding a new task...");

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
