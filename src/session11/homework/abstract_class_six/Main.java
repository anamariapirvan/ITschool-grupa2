package session11.homework.abstract_class_six;

public class Main {

    public static void main(String[] args) {
        Area areaCalculator = new Area();
        double rectangleArea = areaCalculator.rectangleArea(20, 10);
        double circleArea = areaCalculator.circleArea(10);
        double squareArea = areaCalculator.squareArea(15);

        System.out.println("Area of rectangle is: " + rectangleArea);
        System.out.println("Area of circle is: " + circleArea);
        System.out.println("area of square is: " + squareArea);
    }
}
