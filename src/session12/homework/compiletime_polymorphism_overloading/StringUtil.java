package session12.homework.compiletime_polymorphism_overloading;

public class StringUtil {

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        StringUtil util = new StringUtil();

        String concat1 = util.concatenate("20", "30");
        String concat2 = util.concatenate("10", "20", "30");
        String reversed = util.reverse("ana are mere");

        System.out.println("First string concatenated: " + concat1);
        System.out.println("Second string concatenated: " + concat2);
        System.out.println("Reversed string is: " + reversed);
    }
}
