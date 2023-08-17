package session6.homework;

import java.util.ArrayList;

public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add(", ");
        stringList.add("my name is ");
        stringList.add("Ana ");
        stringList.add("!");
        String result = concatenateStrings(stringList);
        System.out.println(result);
    }

    public static String concatenateStrings(ArrayList<String> strings) {
        StringBuilderCounter stringBuilder = new StringBuilderCounter();
        for (String str : strings) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
