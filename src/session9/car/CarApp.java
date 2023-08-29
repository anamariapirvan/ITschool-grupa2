package session9.car;

import session9.car.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setSpeed(50);
        car1.setBrand("Opel");
        car1.setModel("Astra");

        System.out.println(car1);
        Car car2=new Car();
        System.out.println(car2);
        car1.accelerate();
        System.out.println(car1);
    }
}
