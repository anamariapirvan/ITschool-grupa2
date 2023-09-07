package session12.homework.object_vs_reference.object_creation_reference_assignment;

public class Main {

    public static void main(String[] args) {
        Car car1=new Car("Mercedes", "Benz", 2020);
        Car car2=new Car("Opel", "Astra", 2021);
        Car car3=new Car("Honda", "Civic", 2019);


        car3.model="ClassA";

        car2.year=2023;

        car1.make="Audi";

        System.out.println("Car 1 details: ");
        car1.printDetails();

        System.out.println("Car2 details: ");
        car2.printDetails();

        System.out.println("Car3 details: ");
        car3.printDetails();
    }
}
