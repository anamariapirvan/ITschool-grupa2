package session10;

public class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Constructor from Animal class was called");
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
        System.out.println("Constructor from dog class was called");
    }
}