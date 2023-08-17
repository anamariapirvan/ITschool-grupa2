package session3.homework;

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first boolean(true or false): ");
        boolean bool1 = scanner.nextBoolean();
        System.out.println("Enter the second boolean(true or false): ");
        boolean bool2 = scanner.nextBoolean();
        boolean negatedbool1 = !bool1;
        boolean negatedbool2 = !bool2;
        System.out.println("Negation of the first boolean: " + negatedbool1);
        System.out.println("Negation of the second boolean: " + negatedbool2);


    }
}
