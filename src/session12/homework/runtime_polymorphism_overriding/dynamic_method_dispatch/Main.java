package session12.homework.runtime_polymorphism_overriding.dynamic_method_dispatch;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
