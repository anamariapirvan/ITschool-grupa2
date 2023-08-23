package session8.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieLinearArray {

    public static void main(String[] args) {
        ArrayList<String> movieTitles = new ArrayList<>();
        movieTitles.add("GodFather");
        movieTitles.add("Notebook");
        movieTitles.add("Titanic");
        movieTitles.add("Spartans");
        movieTitles.add("SpiderMan");
        movieTitles.add("007");
        movieTitles.add("TopGun");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie name:");
        String givenMovieName = scanner.next();
        int position = linearSearch(movieTitles, givenMovieName);
        if (position != -1) {
            System.out.println(givenMovieName + " found at position " + position);
        } else {
            System.out.println(givenMovieName + " not found in the list");
        }
    }

    private static int linearSearch(ArrayList<String> movieTitles, String givenMovieName) {
        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).equals(givenMovieName)) {
                return i;
            }
        }
        return -1;
    }
}
