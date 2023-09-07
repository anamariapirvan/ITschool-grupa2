package session11.practice;

public abstract class Shape {

    abstract double area();

    abstract double perimeter();

    String getShapeName() {
        return "Shape";
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double perimeter() {
        return length * width;
    }

    @Override
    double area() {
        return 2 * (length + width);
    }
}
