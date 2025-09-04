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

        LibraryMember larry = new LibraryMember("Larry Lee", 22336);
        LibraryMember esmeralda = new LibraryMember("Esmerald Earthe", 48684);
        LibraryMember jurgen = new LibraryMember("Jurgen Klum", 66666);

        myCoolLibrary.addBook(dune);
        myCoolLibrary.addBook(theWayOfKings);

        myCoolLibrary.addMember(larry);
        myCoolLibrary.addMember(esmeralda);
        myCoolLibrary.addMember(jurgen);

        myCoolLibrary.borrowBook(larry, theWayOfKings);
        myCoolLibrary.borrowBook(larry, dune);

        larry.getBorrowedBooks();

        myCoolLibrary.returnBook(larry, theWayOfKings);
        myCoolLibrary.returnBook(larry, dune);

        larry.getBorrowedBooks();


    }
}