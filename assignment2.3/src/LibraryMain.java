public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book dune = new Book("Dune", "Frank Herbert", "1965");
        Book duneMessiah = new Book("Dune Messiah", "Frank Herbert", "1969");
        Book wayOfKings = new Book("The Way of Kings", "Brandon Sanderson", "2014");

        library.addBook(dune);
        library.addBook(duneMessiah);
        library.addBook(wayOfKings);

        library.displayBooks();

        library.findBooksByAuthor("Frank Herbert");


        if (library.isBookAvailable("Dune")) {
            System.out.println("This book is available.");
        }

        library.borrowBook("Dune");
        library.returnBook(dune);

        dune.setRating(10);
        duneMessiah.setRating(8);

        System.out.println("Average rating of all books is " + library.getAverageBookRating() + ".");

        dune.addReview("Good");
        duneMessiah.addReview("I loved this booked all the way through.");
        duneMessiah.addReview("I have no idea what's going on!");
        wayOfKings.addReview("My favorite book of all time.");

        System.out.println("The most reviewed book is " + library.getMostReviewedBook() + ".");
    }
}
