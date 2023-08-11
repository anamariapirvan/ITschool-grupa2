package session5.homework;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter numbers as many as you want until. Enter -1 to stop: ");
        while (true) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of entered numbers: " + sum);
    }

}
