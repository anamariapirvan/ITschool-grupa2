package session13.homework.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private List<Book> books;

    Author(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.books = new ArrayList<>();
    }
    public String getName(){
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayInfo() {
        System.out.println("Author: " + name);
        System.out.println("Nationality: " + nationality);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Books by this author: ");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}
