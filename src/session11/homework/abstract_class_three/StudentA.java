package session11.homework.abstract_class_three;

public class StudentA extends Marks{
    private int firstSubject, secondSubject, thirdSubject;
    public StudentA(int firstSubject, int secondSubject, int thirdSubject) {
        this.firstSubject=firstSubject;
        this.secondSubject=secondSubject;
        this.thirdSubject=thirdSubject;
    }

    @Override
    public double getPercentage() {
        return (firstSubject+secondSubject+thirdSubject)/3.0;
    }
}
