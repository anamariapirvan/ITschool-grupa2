package session12.homework.object_vs_reference.object_comparison;

public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public boolean compareRectangles(Rectangle other) {
        return this.length == other.length && this.width == other.width;
    }
}
