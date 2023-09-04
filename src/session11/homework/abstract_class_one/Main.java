package session11.homework.abstract_class_one;

public class Main {

    public static void main(String[] args) {
        Parent firstObject = new FirstSubClass();
        Parent secondObject = new SecondSubClass();

        firstObject.message();
        secondObject.message();
    }
}
