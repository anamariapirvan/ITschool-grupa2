package ocaexercises.ternaryoperators;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        int absoluteValue = (number > 0) ? number : -number;
        System.out.println("The absolute value is: " + absoluteValue);
        scanner.close();
    }
}
