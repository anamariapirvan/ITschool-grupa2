package session13.homework.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;
    private List<Author> authors;

    Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAllBooks() {
        System.out.println("All books in the Library: ");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) ;
            result.add(book);
        }
        return result;
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().toLowerCase().contains(authorName.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooksByISBN(String isbn) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                result.add(book);
            }
        }
        return result;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void displayAllMembers() {
        System.out.println("All members of the library are: ");
        for (Member member : members) {
            System.out.println("Name: " + member.getName());
            System.out.println("Address: " + member.getAddress());
            System.out.println("Contact Info: " + member.getContactInfo());
            System.out.println();
        }
    }

    public List<Member> searchMembersByName(String name) {
        List<Member> result = new ArrayList<>();
        for (Member member : members) {
            if (member.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(member);
            }
        }
        return result;
    }

    public void addMember(String name, String address, String contactInfo) {
        Member member = new Member(name, address, contactInfo);
        members.add(member);
    }

    public Member searchMemberById(int memberId) {
        for (Member member : members) {
            // Assuming members have unique IDs
            if (member.getId() == memberId) {
                return member;
            }
        }
        return null;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }
    public void removeAuthor(Author author){
        authors.remove(author);
    }
}