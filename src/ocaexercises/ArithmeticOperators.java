package ocaexercises;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int valueOne = 10;
        int valueTwo = 20;

        System.out.println("Suma is: " + (valueOne+valueTwo));
        System.out.println("Difference is: " + (valueOne-valueTwo));
        System.out.println("Multiplication is: " + (valueOne*valueTwo));
        System.out.println("Division is: " + (valueOne/valueTwo));
        System.out.println("Modulus is: " + (valueOne%valueTwo));

        if(valueOne>valueTwo){
            System.out.println("First number is greater than the second");
        } else if (valueOne<valueTwo) {
            System.out.println("Second number is greater than the first");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
