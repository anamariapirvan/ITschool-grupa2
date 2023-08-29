package session8.homework;

import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String[] args) {
        LinkedList<String> friendsList = new LinkedList<>();
        friendsList.add("Maria");
        friendsList.add("Ioana");
        friendsList.add("Teo");
        friendsList.add("Mirela");
        friendsList.add("Oana");
        friendsList.add("Lori");
        friendsList.add("Adela");

        //print the names in reversed order using a loop
        System.out.println("Names in reversed order: ");
        for (int i = friendsList.size() - 1; i >= 0; i--) {
            System.out.println(friendsList.get(i));
        }

        //print your name to the end of the list
        friendsList.add("Ana");
        System.out.println("Printed my name to the end of the list: " + friendsList);

        // insert another friend's name  in the middle of the list
        friendsList.add(4, "Andreea");
        System.out.println("Inserted another friend's name in the middle of the list: " + friendsList);

        // remove the first name from the list
        friendsList.remove(0);
        System.out.println("Removed the first name from the list: " + friendsList);

        // remove the last name from the list
        friendsList.remove(friendsList.removeLast());
        System.out.println("Removed the last element of the list: " + friendsList);

        //check if a specific name exists in the list
        String specificName = "Teo";
        boolean exists = friendsList.contains(specificName);
        System.out.println("Does ' " + specificName + " ' exists in the list ? " + exists);
    }
}

