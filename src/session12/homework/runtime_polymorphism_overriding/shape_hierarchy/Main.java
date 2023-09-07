package session12.homework.runtime_polymorphism_overriding.shape_hierarchy;

public class Main {


    public static void main(String[] args) {
        Shape circle=new Circle(10);
        Shape rectangle= new Rectangle(10,20);

        System.out.println("The area of circle is: " + circle.area());
        System.out.println("The area of rectangle is: " + rectangle.area());


    }
}
