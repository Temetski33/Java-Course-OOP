import system.Library;
import model.Book;
import model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations

        Library myCoolLibrary = new Library();

        System.out.println("Welcome to my cool library!");
        System.out.println();

        Book dune = new Book("Dune", "Frank Herbert", "DFN231");
        Book theWayOfKings = new Book("The Way of Kings", "Brandon Sanderson", "TBS786");
        Book piano = new Book("Beginner Piano", "Piano Man", "BPM180");
        Book forever = new Book("Foreverance", "Eternity Ever", "FEE303");
        Book book5 = new Book("Book5", "Mr Five", "BMF555");

        LibraryMember larry = new LibraryMember("Larry Lee", 22336);
        LibraryMember esmeralda = new LibraryMember("Esmerald Earthe", 48684);
        LibraryMember jurgen = new LibraryMember("Jurgen Klum", 66666);

        myCoolLibrary.addBook(dune);
        myCoolLibrary.addBook(theWayOfKings);
        myCoolLibrary.addBook(piano);
        myCoolLibrary.addBook(forever);
        myCoolLibrary.addBook(book5);
        System.out.println();


        myCoolLibrary.addMember(larry);
        myCoolLibrary.addMember(esmeralda);
        myCoolLibrary.addMember(jurgen);
        System.out.println();

        myCoolLibrary.borrowBook(larry, theWayOfKings);
        myCoolLibrary.borrowBook(larry, dune);

        myCoolLibrary.displayBorrowedBooks(larry);

        myCoolLibrary.returnBook(larry, theWayOfKings);
        myCoolLibrary.returnBook(larry, dune);

        myCoolLibrary.borrowBook(jurgen, dune);


        myCoolLibrary.reserveBook(esmeralda, theWayOfKings);
        myCoolLibrary.reserveBook(esmeralda, book5);
        myCoolLibrary.reserveBook(larry, theWayOfKings);
        myCoolLibrary.reserveBook(jurgen, piano);

        myCoolLibrary.cancelReservation(esmeralda, theWayOfKings);
        myCoolLibrary.cancelReservation(jurgen, piano);
        myCoolLibrary.reserveBook(jurgen, dune);
        myCoolLibrary.reserveBook(jurgen, forever);
        myCoolLibrary.displayReservedBooks(jurgen);

        System.out.println();
        myCoolLibrary.displayReservedBooks(esmeralda);
        myCoolLibrary.cancelReservation(esmeralda, book5);
        myCoolLibrary.displayReservedBooks(esmeralda);



    }
}