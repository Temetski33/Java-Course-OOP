public class Book {
    private String title;
    private String author;
    private String year;
    private Double rating;
    private String review;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 0.0;
        this.review = "";
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

    void setRating(double rating) {
        this.rating = rating;
    }

    public Double getRating() {
        return rating;
    }
}
