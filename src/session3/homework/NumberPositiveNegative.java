package session3.homework;

import java.util.Scanner;

public class NumberPositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPositive = !(number < 0);

        if (isPositive) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        scanner.close();
    }
}
