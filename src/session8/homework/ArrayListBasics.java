package session8.homework;

import java.util.ArrayList;

public class ArrayListBasics {

    public static void main(String[] args) {
        ArrayList<Integer> integerNumbers = new ArrayList<>();

        //Add numbers for 1 to 10
        for (int i=1; i<=10;i++){
            integerNumbers.add(i);
        }
        System.out.println("Original List: " + integerNumbers);

        //Remove even numbers
        integerNumbers.removeIf(number -> number%2==0);
        System.out.println("List after removing even numbers: " + integerNumbers);

        //Add a new number at the beginning
        integerNumbers.add(0,15);
        System.out.println("List after adding a new number at the beginning: " + integerNumbers);

        //Find the sum of remaining numbers
        int sum = 0;
        for(int number: integerNumbers){
            sum += number;
        }
        System.out.println("Sum of remaining numbers: " + sum);

        //
    }
}
