package realtimeProjectLibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
    private List<Book>books;

    public Admin(String username, String password) {
        super(username, password);
        this.books=new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Books added by admin:"+book);

    }
    public void remove(Book book){
        books.remove(book);
        System.out.println("books removed by admin:"+book);

    }
}
