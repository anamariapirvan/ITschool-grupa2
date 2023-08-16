package ocaexercises.switchstatement;

import java.util.Scanner;

public class SimpleMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your choice is Option 1");
                break;
            case 2:
                System.out.println("Your choice is Option 2");
                break;
            case 3:
                System.out.println("Your choice is Option 3");
                break;
            case 4:
                System.out.println("Your choice is Exit");
                break;
            default:
                System.out.println("Invalid option");
        }
        scanner.close();
    }
}
