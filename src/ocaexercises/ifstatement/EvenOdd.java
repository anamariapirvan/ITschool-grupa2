package ocaexercises.ifstatement;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer: ");
        int integer = scanner.nextInt();
        if (integer % 2 == 0) {
            System.out.println("The input is even");
        } else {
            System.out.println("The input is odd");
        }
        }
    }

