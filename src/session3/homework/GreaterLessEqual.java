package session3.homework;

import java.util.Scanner;

public class GreaterLessEqual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number is: ");
        int num1 = scanner.nextInt();

        System.out.println("Second number is: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        }
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        }
        scanner.close();
    }
}
