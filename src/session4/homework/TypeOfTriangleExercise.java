package session4.homework;

public class TypeOfTriangleExercise {

    public static void main(String[] args) {
        double sideOne = 20;
        double sideTwo = 30;
        double sideThree = 40;
        String triangleType = (sideOne == sideTwo && sideThree == sideTwo) ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ?
                "Isosceles" : "Scalene";
        System.out.println("The triangle is: " + triangleType);
    }
}
