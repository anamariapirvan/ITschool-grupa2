package session4.homework;

public class OpenAlExercise {

    public static void main(String[] args) {
        String stringOne = "OpenAl";
        String stringTwo = "OpenAl";
        if (stringOne.equals(stringTwo)) {
            System.out.println("Values of stringOne and stringTwo are the same");
            if (stringOne == stringTwo) {
                System.out.println("stringOne and stringTwo refer to the same object");
            } else {
                System.out.println("stringOne and stringTwo do not refer to the same object");
            }
        } else {
            System.out.println("Values of stringOne and stringTwo are not the same");
        }

    }
}
