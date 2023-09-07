package session12.practice.object_vs_reference;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        //explicit
        Car anotherCar = (Car) car;
    }
}
