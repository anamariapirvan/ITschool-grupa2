package session11.homework.abstract_class_six;

public class Area extends Shape{
    @Override
    public double rectangleArea(double length, double breadth) {
        return (length * breadth);
    }

    @Override
    public double squareArea(double side) {
        return side * side;
    }

    @Override
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
