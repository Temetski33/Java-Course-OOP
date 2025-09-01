import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String age;
    private List<String> borrowedBooks;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void addBorrowedBook(String book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(String book) {
        borrowedBooks.remove(book);
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}
