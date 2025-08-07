import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        // Sample books
        try (Scanner sc = new Scanner(System.in)) {
            // Sample books
            library.addBook(new Book(1, "1984", "George Orwell"));
            library.addBook(new Book(2, "The Hobbit", "J.R.R. Tolkien"));
            
            int choice;
            
            do {
                System.out.println("\n=== Library Menu ===");
                System.out.println("1. Show Books");
                System.out.println("2. Issue Book");
                System.out.println("3. Return Book");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> library.showBooks();
                    case 2 -> {
                        System.out.print("Enter Book ID to issue: ");
                        int id = sc.nextInt();
                        library.issueBook(id);
                    }
                    case 3 -> {
                        System.out.print("Enter Book ID to return: ");
                        int id = sc.nextInt();
                        library.returnBook(id);
                    }
                    case 0 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid choice.");
                }
            } while (choice != 0);
        }
    }
}