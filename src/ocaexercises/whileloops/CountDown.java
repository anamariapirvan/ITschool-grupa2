package ocaexercises.whileloops;
import java.util.Scanner;
public class CountDown {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number= scanner.nextInt();
        while (number>=1){
            System.out.print(number + " ");
            number--;

        }
    }
}
