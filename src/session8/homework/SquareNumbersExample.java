
/*You are given an array numbers containing integer values.
 Create a new array squaredNumbers that contains the square of each number from the numbers array.
 Then, iterate through the squaredNumbers array and print each squared number.
 */
package session8.homework;

import java.util.ArrayList;

public class SquareNumbersExample {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 76, 432, 45, 8, 9};
        int[] squaredNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            squaredNumbers[i] = numbers[i] * numbers[i];
        }
        for (int squaredNumber : squaredNumbers) {
            System.out.println("Squared Number: " + squaredNumber);
        }
    }
}
