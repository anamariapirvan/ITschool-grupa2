package session12.homework.object_vs_reference.object_comparison;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(20, 30);
        Rectangle rectangle2 = new Rectangle(10, 20);
        Rectangle rectangle3 = new Rectangle(10, 20);

        if (rectangle1.compareRectangles(rectangle2)) {
            System.out.println("The rectangles compared have the same dimension");
        } else {
            System.out.println("The rectangles compared don't have the same dimension");
        }

        if (rectangle2.compareRectangles(rectangle3)) {
            System.out.println("The rectangles compared have the same dimension");
        } else {
            System.out.println("The rectangles compared don't have the same dimension");
        }
    }
}
