package session8.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlaylist {

    public static void main(String[] args) {
        ArrayList<String> tasksList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ToDo List Application");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasksList.add(task);
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasksList.size(); i++) {
                        System.out.println((i + 1) + ". " + tasksList.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter the task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (taskNumber >= 1 && taskNumber <= tasksList.size()) {
                        tasksList.remove(taskNumber - 1);
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println();
        }
    }
}
