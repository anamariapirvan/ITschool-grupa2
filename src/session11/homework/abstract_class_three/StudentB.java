package session11.homework.abstract_class_three;

public class StudentB extends Marks {

    private int subject1, subject2, subject3, subject4;
    public StudentB( int subject1, int subject2, int subject3, int subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }
    @Override
    public double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4.0;
    }
}
