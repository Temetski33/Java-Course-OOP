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
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
        System.out.println(member.getName() + " (" + member.getMemberId() + ") added to members list.");
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        books.remove(book);
        member.borrowBook(book);
        System.out.println("User \"" + member.getName() + "\" borrowed " + book.getTitle() + " by " + book.getAuthor() + ".");
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        member.returnBook(book);
        books.add(book);
        System.out.println(member.getName() + " returned " + book.getTitle() + ".");
    }

    public void displayBorrowedBooks(LibraryMember member) {
        System.out.println("Borrowed books for " + member.getName() + ":");
        for (Book book : member.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }

}
