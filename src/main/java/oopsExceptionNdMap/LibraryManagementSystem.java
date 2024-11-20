package oopsExceptionNdMap;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(101, new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(102, new Book("1984", "George Orwell"));
        library.addBook(103, new Book("To Kill a Mockingbird", "Harper Lee"));

        // Adding members
        library.addMember(1, new Member("Alice", 1));
        library.addMember(2, new Member("Bob", 2));

        // Display available books
        library.displayAvailableBooks();

        // Borrowing books
        try {
            library.borrowBook(101, 1);  // Alice borrows "The Great Gatsby"
            library.borrowBook(102, 2);  // Bob borrows "1984"
            library.borrowBook(101, 2);  // Bob tries to borrow "The Great Gatsby" (should throw an exception)
        } catch (BookUnavailableException | InvalidMemberException e) {
            System.out.println(e.getMessage());
        }

        // Return a book
        try {
            library.returnBook(101);  // Returning "The Great Gatsby"
            library.displayAvailableBooks();
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
