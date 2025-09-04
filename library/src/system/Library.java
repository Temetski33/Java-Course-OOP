package system;

import model.Book;
import model.LibraryMember;

import java.util.LinkedList;

public class Library {
    LinkedList<Book> books = new LinkedList<>();
    LinkedList<LibraryMember> members = new LinkedList<>();

    public void addBook(Book book) {
        // Add book to the library
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        books.remove(book);
        member.borrowBook(book);
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        member.returnBook(book);
        books.add(book);
    }
}
