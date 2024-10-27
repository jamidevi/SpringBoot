package bookclient;

public class BookModel {
	private String isbn;
    private String title;

    // Constructors
    public BookModel() {}

    public BookModel(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
	

}
