package ocaexercises.whileloops;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            reversedNumber = number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("The number you entered is Palindrome");
        } else {
            System.out.println("The number you entered is not Palindrome");
        }
        scanner.close();
    }
}
