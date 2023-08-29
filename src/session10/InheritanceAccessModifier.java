package session10;

public class InheritanceAccessModifier {
}

class Athlete {
    protected int age;

    protected void setAge(int age){
        this.age=age;
    }
}
class Runner extends Athlete{

}
class Biker extends Athlete{

}
