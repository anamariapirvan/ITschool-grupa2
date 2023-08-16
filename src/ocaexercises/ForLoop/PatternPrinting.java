package ocaexercises.ForLoop;

import java.util.Scanner;

public class PatternPrinting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a positive integer:");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
