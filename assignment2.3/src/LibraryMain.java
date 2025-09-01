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

        library.borrowBook("Dune");
        library.returnBook(dune);
    }
}
