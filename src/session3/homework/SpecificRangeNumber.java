package session3.homework;
import java.util.Scanner;
public class SpecificRangeNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        if(number>=1 && number<=100){
            System.out.println("The number you entered is within the range 1 to 100");
        } else {
            System.out.println("The number is not within the range 1 to 100");

            scanner.close();
        }
    }
}
