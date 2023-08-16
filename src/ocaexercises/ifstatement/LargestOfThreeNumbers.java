package ocaexercises.ifstatement;
import java.util.Scanner;
public class LargestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce first number:");
        int firstNumber= scanner.nextInt();
        System.out.println("Introduce second number:");
        int secondNumber= scanner.nextInt();
        System.out.println("Introduce the third number:");
        int thirdNumber = scanner.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("The first number is the biggest.");
        } else if (secondNumber>firstNumber &&secondNumber>thirdNumber) {
            System.out.println("The second number is the biggest.");
        }else {
            System.out.println("The third number is the biggest");
        }
        scanner.close();
    }
}
