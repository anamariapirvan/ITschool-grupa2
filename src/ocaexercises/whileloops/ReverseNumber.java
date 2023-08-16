package ocaexercises.whileloops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce an integer:");
        int number = scanner.nextInt();
        System.out.println("Digits in reverse order: ");
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;

        }
        scanner.close();
    }
}
