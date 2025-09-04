package model;

import java.util.LinkedList;

public class LibraryMember {
    private String name;
    private int memberId;
    LinkedList<Book> borrowedBooks = new LinkedList<>();

    // Constructor, getters, setters

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
}