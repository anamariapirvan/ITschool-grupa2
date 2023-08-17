package session5.homework;

import java.util.Scanner;

public class ContinueStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce 10 numbers: ");
        int sum = 0;
        int count = 0;
        int number;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            number = scanner.nextInt();
            if (number <= 5) {
                continue;
            } else {
                sum += number;
                count++;
            }
            if (count > 0) {
                System.out.println("Sum of numbers greater than 5: " + sum);
            } else {
                System.out.println("No numbers greater than 5 entered.");
            }
        }
    }
}
