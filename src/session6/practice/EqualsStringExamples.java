package session6.practice;

public class EqualsStringExamples {


    public static void main(String[] args) {
        String colour1 = "Blue";
        String colour2 = "blue";
        System.out.println(colour1.equals(colour2));
        System.out.println(colour1.equalsIgnoreCase(colour2));
        System.out.println(colour1.toLowerCase().equals(colour2));
    }
}
