package session8.homework;

public class EvenOddArray {

    public static void main(String[] args) {
        int[] integerArray = {4, 6, 5, 9, 23, 65, 42, 76, 98, 79, 82};
        int evenNumberCount = 0;
        int oddNumberCount = 0;
        for (int numbers : integerArray) {
            if (numbers % 2 == 0) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }
        }
        System.out.println("In the given array we have: " + evenNumberCount + " even numbers");
        System.out.println(" In the given array we have: " + oddNumberCount + " odd numbers");
    }
}
