package session12.homework.object_vs_reference.arrays_of_objects;

public class Main {

    public static void main(String[] args) {

        // create an array of Book objects and initialize them;

        Book[] books = new Book[3];
        books[0] = new Book("Java Programming", "Jhon");
        books[1] = new Book("Python", "Marry");
        books[2] = new Book("JavaScript", "Bob");

        books[1].author="Anne";

        // iterate through the array and perform operations on the objects
        for (Book book : books) {
            System.out.println("Book details");
            book.displayDetails();
            System.out.println();
        }
    }
}
