package session11.homework.abstract_class_three;

public class Main {

    public static void main(String[] args) {
        Marks studentA= new StudentA(80, 90, 75);
        Marks studentB=new StudentB(65, 75, 90, 85);

        System.out.println("The average percentage of marks for student A is: " + studentA.getPercentage());
        System.out.println("The average percentage of marks for student B is: " + studentB.getPercentage());
    }
}
