package ocaexercises.whileloops;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number= scanner.nextInt();
        int originalNumber=number;
        int countDigits=String.valueOf(number).length();
        int sum=0;
        while (number!=0){
           int digits =number%10;
           sum +=Math.pow(digits, countDigits);
           number/=10;
        }
        if(sum==originalNumber){
            System.out.println("The number is Armstrong number.");
        } else{
            System.out.println("The number is not Armstrong number.");
        }
        scanner.close();
    }
}
