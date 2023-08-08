package session4.homework;

public class CountryCheckExercise {

    public static void main(String[] args) {

        String countryOne = "USA";
        String countryTwo = "USA";
        boolean areEqualInitial = countryOne.equals(countryTwo);
        System.out.println("Are countryOne and countryTwo equals? " + areEqualInitial);

        countryTwo = "UK";
        boolean areEqualAfterChange = countryOne.equals(countryTwo);
        System.out.println("Are countryOne and countryTwo equals after change? " + areEqualAfterChange);
    }
}
