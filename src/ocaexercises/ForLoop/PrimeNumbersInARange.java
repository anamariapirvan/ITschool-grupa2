package ocaexercises.ForLoop;

import java.util.Scanner;

public class PrimeNumbersInARange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int startNumber = scanner.nextInt();
        System.out.println("Enter the second integer:");
        int endNumber = scanner.nextInt();
        for (int number = startNumber; number <= endNumber; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        scanner.close();
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
