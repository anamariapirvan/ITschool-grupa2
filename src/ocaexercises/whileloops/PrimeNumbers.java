package ocaexercises.whileloops;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("The number is not prime.");
        } else {
            boolean isPrime = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                System.out.println("The number is prime.");
            } else {
                System.out.println("The number is not prime.");
            }
        }

        scanner.close();
    }
}
