package model;

import java.util.LinkedList;

public class LibraryMember {
    private String name;
    private int memberId;
    private LinkedList<Book> borrowedBooks;
    private LinkedList<Book> reservedBooks = new LinkedList<>();

    // Constructor, getters, setters

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public LinkedList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public LinkedList<Book> getReservedBooks() {
        return reservedBooks;
    }
}