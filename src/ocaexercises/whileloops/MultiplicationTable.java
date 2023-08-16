package ocaexercises.whileloops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scanner.nextInt();
        int multiplier = 1;
        while (number >= multiplier) {
            int result = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + result);
            multiplier++;
        }
        scanner.close();
    }
}
