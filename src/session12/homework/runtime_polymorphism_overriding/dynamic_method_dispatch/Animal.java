package session12.homework.runtime_polymorphism_overriding.dynamic_method_dispatch;


// Inheritance and method overriding are commonly used for dynamic method dispatch,
// where a reference variable of a superclass can refer to an object of any subclass.
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
