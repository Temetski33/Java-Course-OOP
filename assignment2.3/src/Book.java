import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String year;
    private Double rating;
    private List<String> reviews;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public Double getRating() {
        return rating;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

}
