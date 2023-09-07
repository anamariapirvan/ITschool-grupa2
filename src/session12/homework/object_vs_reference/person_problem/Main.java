package session12.homework.object_vs_reference.person_problem;

import session12.homework.object_vs_reference.person_problem.Person;

public class Main {

    public static void main(String[] args) {

        //creating objects and references
        Person person1=new Person("Ana");
        Person person2=new Person("Maria");

        // here, person1, person2, are reference variables that point to Person objects;
        //the objects themselves are stored in memory

        //modifying object data through references
        System.out.println(person1.name);
        person1.name="Alice";
        System.out.println(person1.name);
        System.out.println(person2.name);

        // reassigning references
        person1=person2; // now both person1 and person2 refer to the same object;
        System.out.println(person1.name);

        //modifying object data through references(still the same object)
        person1.name="Ioana";
        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
