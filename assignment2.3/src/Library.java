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
        boolean exists = false;
        for (Book book: this.books) {
            if (title.equals(book.getTitle())) {
                exists = true;
                System.out.println("Borrowed book \"" + book.getTitle() + "\".");
                System.out.println();
                books.remove(book);
                break;
            }
        }
        if (!exists) {
            System.out.println("The book you are trying to borrow does not exist.");
            System.out.println();
        }
    }

    void returnBook(Book book) {
        System.out.println("Returned book \"" + book.getTitle() + "\".");
        System.out.println();
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

    double getAverageBookRating() {
        double ratingSum = 0.0;
        double ratingAvg = 0.0;

        for (Book book: this.books) {
            ratingSum = ratingSum + book.getRating();
        }
        ratingAvg = ratingSum / this.books.size();

        return ratingAvg;
    }

    String getMostReviewedBook() {
        String mostReviewed = "";
        int reviewCount = 0;

        for (Book book: this.books) {
            if (book.getReviews().size() > reviewCount) {
                mostReviewed = book.getTitle();
                reviewCount = book.getReviews().size();
            }
        }

        return mostReviewed;
    }

    void trackUser(User user) {
        System.out.println("User \"" + user.getName() + "\" has borrowed the books" + user.getBorrowedBooks() + ".");
    }
}
