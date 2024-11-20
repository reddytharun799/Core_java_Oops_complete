package oopsExceptionNdMap;

public class Book extends LibraryItem{
    private String author;
    private boolean isAvailable;

    public Book(String title,String author){
        super(title);
        this.author=author;
        this.isAvailable=true;
    }

    public String getAuthor() {
        return author;
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
                "author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
