package ocaexercises.unaryoperators;

public class UnaryIncrementDecrementOperators {

    public static void main(String[] args) {
        int value = 20;
        System.out.println("Print pre-increment value: " + ++value);
        System.out.println("Print normal value: " + value);
        System.out.println("Print pre-decrement value: " + --value);
        System.out.println("Print normal value: " + value);
        System.out.println("Print post-increment value: " + value++);
        System.out.println("Print normal value: " + value);
        System.out.println("Print post-decrement value: " + value--);
        System.out.println("Print normal value: " + value);
    }
}
