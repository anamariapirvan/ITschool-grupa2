package session3.homework;

import java.util.Scanner;

public class InputTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get the first number from the user
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        //get the second number from the user
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        //calculate and display the results
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 / num2;

        System.out.println("Result of the addition is: " + addition);
        System.out.println("Result of the subtraction is: " + subtraction);
        System.out.println("Result of the multiplication is: " + multiplication);
        System.out.println("Result of the division is: " + division);
        System.out.println("Result of the modulus is: " + modulus);

        scanner.close();

    }

}
