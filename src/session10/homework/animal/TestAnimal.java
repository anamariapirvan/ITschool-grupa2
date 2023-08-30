package session10.homework.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal wolf = new Wolf();

        System.out.print("Dog: ");
        dog.sound();

        System.out.print("Cat: ");
        cat.sound();

        System.out.print("Wolf: ");
        wolf.sound();
    }
}
