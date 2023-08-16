package ocaexercises.ternaryoperators;

import java.util.Scanner;

//boolean expression ? expression1 : expression2
public class FindMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int valueOne = scanner.nextInt();
        System.out.println("Enter the second integer");
        int valueTwo = scanner.nextInt();
        int result = (valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println("The maximum number is: " + result);
        scanner.close();
    }
}
