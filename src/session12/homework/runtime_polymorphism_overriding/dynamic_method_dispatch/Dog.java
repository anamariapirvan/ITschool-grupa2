package session12.homework.runtime_polymorphism_overriding.dynamic_method_dispatch;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
