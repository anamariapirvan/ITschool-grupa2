package session4.homework;

public class NumberPrinting {

    public static void main(String[] args) {
        int i;
        System.out.println("All numbers from 1 to 10 are: ");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nEven numbers from 1 to 10: ");
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
