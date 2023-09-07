package session13.practice;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("flower");
        myList.add("flow");
        myList.add("flight");
        myList.add("flamingo");
        System.out.println(getLongestPrefix(myList));
    }

    public static String getLongestPrefix(List<String> input) {
        StringBuilder stringBuilder = new StringBuilder();
        int minLength = input.get(0).length();
        for (int index = 1; index < input.size(); index++) {
            minLength = Math.min(minLength, input.get(index).length());
        }
        for (int j = 0; j < minLength; j++) {
            char currentChar = input.get(0).charAt(j);
            for (int k = 1; k < input.size(); k++) {
                if (currentChar != input.get(k).charAt(j)) {
                    return stringBuilder.toString();
                }

            }
            stringBuilder.append(currentChar);
        }
        return stringBuilder.toString();
    }
}
