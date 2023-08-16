package session6.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";
        for (int index = 0; index < 10; index++) {
            result += "a";
            System.out.println(result);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("a");
        }
        System.out.println(stringBuilder);
    }
}
