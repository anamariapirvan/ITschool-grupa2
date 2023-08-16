package ocaexercises.whileloops;

import java.util.Scanner;

public class PerfectNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();
        int sum = 0;
        int divisor = 1;
        while (divisor <= number / 2) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }
        if (sum == number) {
            System.out.println("The number is a perfect number.");
        } else {
            System.out.println("The number is not a perfect number.");
        }
        scanner.close();
    }
}


