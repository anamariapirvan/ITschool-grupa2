package session12.homework.upcasting_downcasting;

public class Main {

    public static void main(String[] args) {

        //upcasting:Cat to Animal;
        Cat cat = new Cat();
        Animal animal = cat;

        //calling overridden method;
        animal.makeSound();

        //downcasting: Animal to Cat;

        Animal animal2 = cat;
        Cat cat2 = (Cat) animal2;

        //calling subclass-specific method;
        cat2.scratch();

        // be cautious with downcasting and use instanceof
        //is important to use instanceof to ensure that downcasting is safe and doesn't result in exceptions;

        Animal animal3= new Animal();
        if(animal3 instanceof Cat){
            Cat cat3=(Cat) animal3;
            cat3.scratch();
        } else{
            System.out.println("Not a cat object");
        }
    }
}
