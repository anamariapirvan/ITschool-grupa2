package session3.homework;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        int a = 8;
        int b = 6;

        a+=b;
        System.out.println("a+=b: " + a);

        a-=b;
        System.out.println("a-=b: " + a);

        a*=b;
        System.out.println("a*=b: " + a);

        a/=b;
        System.out.println("a/=b: " + a);

        a%=b;
        System.out.println("a%=b: " +a);

        a &=b;
        System.out.println("a&=b: " + a);

        a^=b;
        System.out.println("a^=b: " +a);

        a |=b;
        System.out.println("a |=b: " +a);

        a=20;
        a<<=1;
        System.out.println("a<<=1: " +a);

        a=-20;
        a>>>=1;
        System.out.println("a>>>=1: " +a);


    }
}
