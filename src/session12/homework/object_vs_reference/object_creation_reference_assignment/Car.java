package session12.homework.object_vs_reference.object_creation_reference_assignment;

public class Car {

     String make;
    String model;
    int year;

    Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

 public void printDetails(){
     System.out.println("Make: " + make);
     System.out.println("Model:" + model);
     System.out.println("Year:" + year);
     System.out.println();
 }
}
