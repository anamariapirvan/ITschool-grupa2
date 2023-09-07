package session13.homework.library_management_system;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();


        Author author1 = new Author("Author 1", "Nationality 1", "DOB 1");
        Author author2 = new Author("Author 2", "Nationality 2", "DOB 2");


        library.addAuthor(author1);
        library.addAuthor(author2);


        Book book1 = new Book("Book 1", author1, "Publisher 1", "ISBN 1", 5, LocalDate.of(1990, 01, 29) );
        Book book2 = new Book("Book 2", author2, "Publisher 2", "ISBN 2", 3, LocalDate.of(1992, 06, 20));


        library.addBook(book1);
        library.addBook(book2);


        Member member1 = new Member("Member 1", "Address 1", "Contact Info 1");
        Member member2 = new Member("Member 2", "Address 2", "Contact Info 2");


        library.addMember(member1);
        library.addMember(member2);


        member1.borrowBook(book1);
        member2.borrowBook(book2);
        member1.returnBook(book1);



        List<Book> booksByAuthor1 = library.searchBooksByAuthor("Author 1");
        List<Book> booksByAuthor2 = library.searchBooksByAuthor("Author 2");

        System.out.println("Books by Author 1:");
        for (Book book : booksByAuthor1) {
            book.displayInfo();
        }

        System.out.println("Books by Author 2:");
        for (Book book : booksByAuthor2) {
            book.displayInfo();
        }

        member1.displayBorrowedBooks();
        member2.displayBorrowedBooks();


        Member foundMember = library.searchMemberById(1);
        if (foundMember != null) {
            System.out.println("Found Member by ID 1:");
            System.out.println("Name: " + foundMember.getName());
            System.out.println("Address: " + foundMember.getAddress());
            System.out.println("Contact Info: " + foundMember.getContactInfo());
        } else {
            System.out.println("Member with ID 1 not found.");
        }
    }
}
