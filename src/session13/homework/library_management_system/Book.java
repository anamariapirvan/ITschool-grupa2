package session13.homework.library_management_system;

import java.time.LocalDate;

public class Book {

    private String title;
    private Author author;
    private String publisher;
    private String ISBN;
    private int numberOfCopies;
    private int availableCopies;
    private LocalDate dueDate;

    Book(String title, Author author, String publisher, String ISBN, int numberOfCopies, LocalDate dueDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
        this.dueDate=dueDate;
        author.addBook(this);
    }
    public LocalDate getDueDate(){
        return dueDate;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }

    public void addCopy(int number) {
        numberOfCopies += number;
        availableCopies += number;
    }

    public void removeCopy(int number) {
        if (number <= numberOfCopies) {
            numberOfCopies -= number;
            availableCopies -= number;
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Total copies: " + numberOfCopies);
        System.out.println("Available copies: " + availableCopies);
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }
}
