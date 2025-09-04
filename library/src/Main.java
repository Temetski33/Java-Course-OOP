import system.Library;
import model.Book;
import model.LibraryMember;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations

        Library myCoolLibrary = new Library();

        Book dune = new Book("Dune", "Frank Herbert", "DFN231");
        Book theWayOfKings = new Book("The Way of Kings", "Brandon Sanderson", "TBS786");

        LibraryMember larry = new LibraryMember("Larry Lee", 223);
        LibraryMember esmerala = new LibraryMember("Esmerald Earthe", 486);
        LibraryMember jurgen = new LibraryMember("Jurgen Klum", 666);


    }
}