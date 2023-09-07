package session12.homework.upcasting_downcasting;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void scratch() {
        System.out.println("Cat scratches");
    }
}
