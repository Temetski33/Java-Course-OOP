package model;

import java.util.LinkedList;

public class LibraryMember {
    private String name;
    private int memberId;
    LinkedList<Book> borrowedBooks;

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

    public void getBorrowedBooks() {
        System.out.println(name + " has borrowed: ");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
        System.out.println();
    }
}