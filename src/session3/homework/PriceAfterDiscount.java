package session3.homework;
import java.util.Scanner;
public class PriceAfterDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The original price is: ");
        double price = scanner.nextDouble();
        System.out.println("The discount is: ");
        double discount = scanner.nextDouble();
        double discountAmount = (price * discount) / 100;
        price -= discountAmount;
        System.out.println("The price after discount is: " + price);

    }
}
