import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here
    void addBook(Book book) {
        this.books.add(book);
    }

    void displayBooks() {
        int counter = 1;
        System.out.println("Library catalog:");
        for (Book book: this.books) {
            System.out.println(counter + ". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getYear());
            counter++;
        }
        System.out.println();
    }

    void findBooksByAuthor(String author) {
        System.out.println("Books by author \"" + author + "\":");
        for (Book book: this.books) {
            if (author.equals(book.getAuthor())) {
                System.out.println("Title: \"" + book.getTitle() +"\", Year: " + book.getYear());


            }
        }
        System.out.println();
    }

    void borrowBook(String title) {
        this.books.removeIf(book -> title.equals(book.getTitle()));
    }

    void returnBook(Book book) {
        addBook(book);
    }

    boolean isBookAvailable(String title) {
        for (Book book: this.books) {
            if (title.equals(book.getTitle())) {
                return true;
            }
        }

        return false;
    }
}
