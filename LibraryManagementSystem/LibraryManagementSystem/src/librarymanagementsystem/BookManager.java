package librarymanagementsystem;

import java.util.Scanner;

public class BookManager {
    private Scanner scanner;
    private Books[] books;
    private int bookCount;

    public BookManager(Scanner scanner) {
        this.scanner = scanner;
        this.books = new Books[100];
        this.bookCount = 0;
    }

    public void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter borrower's name: ");
        String borrowerName = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter borrowing date (YYYY-MM-DD): ");
        String borrowingDate = scanner.nextLine();
        System.out.print("Enter number of books borrowed: ");
        int numberOfBooksBorrowed = scanner.nextInt();
        scanner.nextLine();

        books[bookCount++] = new Books(title, borrowerName, address, phoneNumber, borrowingDate, numberOfBooksBorrowed);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        System.out.println("=== Book List ===");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public void updateBook() {
        displayBooks();
        System.out.print("Enter the book number to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 1 && index <= bookCount) {
            System.out.print("Enter new title: ");
            String newTitle = scanner.nextLine();
            System.out.print("Enter new borrower's name: ");
            String newBorrowerName = scanner.nextLine();
            System.out.print("Enter new address: ");
            String newAddress = scanner.nextLine();
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("Enter new borrowing date (YYYY-MM-DD): ");
            String newBorrowingDate = scanner.nextLine();
            System.out.print("Enter new number of books borrowed: ");
            int newNumberOfBooksBorrowed = scanner.nextInt();
            scanner.nextLine();

            books[index - 1].setTitle(newTitle);
            books[index - 1].setBorrowerName(newBorrowerName);
            books[index - 1].setAddress(newAddress);
            books[index - 1].setPhoneNumber(newPhoneNumber);
            books[index - 1].setBorrowingDate(newBorrowingDate);
            books[index - 1].setNumberOfBooksBorrowed(newNumberOfBooksBorrowed);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Invalid book number!");
        }
    }

    public void deleteBook() {
        displayBooks();
        System.out.print("Enter the book number to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 1 && index <= bookCount) {
            for (int i = index - 1; i < bookCount - 1; i++) {
                books[i] = books[i + 1];
            }
            bookCount--;
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Invalid book number!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Book List ===\n");
        for (int i = 0; i < bookCount; i++) {
            sb.append((i + 1)).append(". ").append(books[i]).append("\n");
        }
        return sb.toString();
    }

    public void displayBooks(int startIndex, int endIndex) {
        System.out.println("=== Book List ===");
        for (int i = startIndex - 1; i < endIndex && i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}
