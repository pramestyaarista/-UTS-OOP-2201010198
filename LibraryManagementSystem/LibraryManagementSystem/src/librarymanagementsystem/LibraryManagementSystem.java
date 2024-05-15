package librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    private Scanner scanner;
    private BookManager bookManager;

    public LibraryManagementSystem() {
        this.scanner = new Scanner(System.in);
        this.bookManager = new BookManager(scanner);
    }

    public LibraryManagementSystem(Scanner scanner) {
        this.scanner = scanner;
        this.bookManager = new BookManager(scanner);
    }

    public LibraryManagementSystem(BookManager bookManager, Scanner scanner) {
        this.bookManager = bookManager;
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        libraryManagementSystem.run();
    }

    public void run() {
        String userChoice;

        System.out.println("=================================");
        System.out.println("|       Library Main Menu       |");
        System.out.println("=================================");
        System.out.println("| A. View Books                 |");
        System.out.println("| B. Add Book                   |");
        System.out.println("| C. Edit Book                  |");
        System.out.println("| D. Delete Book                |");
        System.out.println("| E. Exit                       |");
        System.out.println("=================================");

        do {
            System.out.print("Choose an option (A/B/C/D/E): ");
            userChoice = scanner.nextLine().toUpperCase();

            switch (userChoice) {
                case "A":
                    System.out.println("\nViewing Books...");
                    bookManager.displayBooks();
                    break;
                case "B":
                    System.out.println("\nAdding Book...");
                    bookManager.addBook();
                    break;
                case "C":
                    System.out.println("\nUpdating Book...");
                    bookManager.updateBook();
                    break;
                case "D":
                    System.out.println("\nDeleting Book...");
                    bookManager.deleteBook();
                    break;
                case "E":
                    System.out.println("\nThank you for using the Library Management System!");
                    break;
                default:
                    System.out.println("\nPlease enter a valid option (A/B/C/D/E)");
                    break;
            }
        } while (!userChoice.equals("E"));

        scanner.close();
    }
}
