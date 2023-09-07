package session12.homework.compiletime_polymorphism_overloading;

public class AreaCalculator {

    private double area(double radius) {
        return Math.PI * radius * radius;
    }

    private double area(double length, double width) {
        return length * width;
    }

    private double area(double base, double height, String shape) {
        if ("triangle".equalsIgnoreCase(shape)) {
            return 0.5 * base * height;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double circleArea = calculator.area(10);
        double rectangleArea = calculator.area(20, 10);
        double triangleArea = calculator.area(10, 20, "round");

        System.out.println("Circle area is: " + circleArea);
        System.out.println("Rectangle area is: " + rectangleArea);
        System.out.println("Triangle area is: " + triangleArea);
    }
}
