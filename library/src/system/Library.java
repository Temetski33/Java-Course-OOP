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
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ") added to library.");
        System.out.println();
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
        System.out.println(member.getName() + " (" + member.getMemberId() + ") added to members list.");
        System.out.println();
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        books.remove(book);
        member.borrowBook(book);
        System.out.println("User " + member.getName() + " borrowed " + book.getTitle() + " by " + book.getAuthor() + ".");
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        member.returnBook(book);
        books.add(book);
        System.out.println(member.getName() + " returned " + book.getTitle() + ".");
        System.out.println();
    }
}
