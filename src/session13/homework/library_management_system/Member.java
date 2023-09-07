package session13.homework.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private String address;
    private String contactInfo;
    private List<Book> borrowedBooks;
    private static int lastId = 0;
    private int id;

    Member(String name, String address, String contactInfo) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
        this.id = ++lastId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public int getId() {
        return id;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.removeCopy(1);
        } else {
            System.out.println("The book is not available to borrow.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.addCopy(1);
        } else {
            System.out.println("You have not borrowed this book.");
        }
    }


    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("You didn't borrow books");
        } else {
            System.out.println(name + " borrowed the following books: ");
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }
}
