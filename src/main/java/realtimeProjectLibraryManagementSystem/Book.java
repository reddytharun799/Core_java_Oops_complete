package realtimeProjectLibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title,String author,boolean isAvailable){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}