package session3.homework;

import java.util.Scanner;

public class UnaryMinusOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The integer is: ");
        int number = scanner.nextInt();

        System.out.println("The integer with reversed sign is: " + (-number));

        scanner.close();

    }
}
