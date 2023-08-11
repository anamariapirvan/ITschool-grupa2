package session5.homework;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers = {3, 14, 7, 9, 3, 5, 2};
        System.out.println("Number - Even/Odd");
        for (int number : numbers) {
            System.out.print(number + " - ");
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
