package session5.homework;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int number;

        while (true) {
            System.out.println("Please enter a number(enter 0 to calculate average and exit): ");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("The average of the numbers you entered is: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
        scanner.close();
    }
}
