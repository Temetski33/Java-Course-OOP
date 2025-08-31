import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here
    void addBook(Book book) {
        this.books.add(book);
    }

    void displayBooks() {
        int counter = 1;
        for (Book book: this.books) {
            System.out.println(counter + "Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\" Year: " + book.getYear());
            counter++;
        }
    }

    void findBooksByAuthor(String author) {
        System.out.println("Books by author \"" + author + "\":");
        for (Book book: this.books) {
            if (author.equals(book.getAuthor())) {
                System.out.println("Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\" Year: " + book.getYear());

            }
        }
    }
}
