import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.issue();
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }
}