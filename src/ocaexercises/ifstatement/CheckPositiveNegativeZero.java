package ocaexercises.ifstatement;

import java.util.Scanner;

public class CheckPositiveNegativeZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number you entered is positive.");
        } else if (number < 0) {
            System.out.println("The number you entered is negative");
        } else {
            System.out.println("The number you entered is zero");
        }
    }
}
