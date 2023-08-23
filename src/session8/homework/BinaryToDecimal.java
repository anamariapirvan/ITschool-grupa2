package session8.homework;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String binaryString = "1011";

        int decimalNumber = Integer.parseInt(binaryString, 2);

        System.out.println("Binary number: " + binaryString);
        System.out.println("Decimal number: " + decimalNumber);
    }
}

