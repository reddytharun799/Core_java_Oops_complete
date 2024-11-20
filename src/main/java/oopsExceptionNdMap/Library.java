package oopsExceptionNdMap;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> bookCollection;  // Books stored by their ID
    private Map<Integer, Member> members;       // Members stored by their ID

    public Library() {
         bookCollection= new HashMap<>();
         members= new HashMap<>();
    }

    // Add books to the library
    public void addBook(int bookId, Book book) {
        bookCollection.put(bookId, book);
    }

    // Add members to the library
    public void addMember(int memberId, Member member) {
        members.put(memberId, member);
    }

    // Borrow a book
    public void borrowBook(int bookId, int memberId) throws BookUnavailableException, InvalidMemberException {
        if (!members.containsKey(memberId)) {
            throw new InvalidMemberException("Member ID " + memberId + " does not exist.");
        }

        if (!bookCollection.containsKey(bookId)) {
            throw new BookUnavailableException("Book ID " + bookId + " does not exist.");
        }

        Book book = bookCollection.get(bookId);

        if (!book.isAvailable()) {
            throw new BookUnavailableException("Book '" + book.getTitle() + "' is currently unavailable.");
        }

        // Mark the book as borrowed
        book.setAvailable(false);
        System.out.println(members.get(memberId).getName() + " borrowed the book: " + book.getTitle());
    }

    // Return a book
    public void returnBook(int bookId) throws BookUnavailableException {
        if (!bookCollection.containsKey(bookId)) {
            throw new BookUnavailableException("Book ID " + bookId + " does not exist.");
        }

        Book book = bookCollection.get(bookId);
        if (book.isAvailable()) {
            throw new BookUnavailableException("Book '" + book.getTitle() + "' is already available.");
        }

        // Mark the book as returned
        book.setAvailable(true);
        System.out.println("The book '" + book.getTitle() + "' has been returned.");
    }

    // Display available books
    public void displayAvailableBooks() {
        System.out.println("Available Books in the Library:");
        for (Map.Entry<Integer, Book> entry : bookCollection.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue());
            }
        }
    }
}
