package ocaexercises.ternaryoperators;
import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        String variable = (number %2==0) ? "Even" : "Odd";
        System.out.println(" The number is " + variable);
        scanner.close();
    }
}
