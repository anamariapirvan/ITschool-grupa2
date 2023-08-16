package ocaexercises.ForLoop;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        int sum = 0;

        // Convert the number to positive if it's negative
        number = Math.abs(number);

        for (; number > 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }

        System.out.println("The sum of the digits is: " + sum);
        scanner.close();
    }
}

