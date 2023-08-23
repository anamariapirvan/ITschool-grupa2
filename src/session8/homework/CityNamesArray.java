package session8.homework;

import java.util.Scanner;
import java.util.ArrayList;

public class CityNamesArray {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        cityList.add("Brasov");
        cityList.add("Slatina");
        cityList.add("Bucuresti");
        cityList.add("Oradea");
        cityList.add("Arad");
        cityList.add("Deva");
        System.out.println("Enter a city: ");
        String newCity = scanner.nextLine();
        if (cityList.contains(newCity)) {
            System.out.println("City you introduced is already in the list.");
        } else {
            cityList.add(newCity);
            System.out.println("The list after you introduced a new city is: " + cityList);
        }
        scanner.close();
    }
}


