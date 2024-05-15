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
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan nama peminjam: ");
        String borrowerName = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String address = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Masukkan tanggal peminjaman (YYYY-MM-DD): ");
        String borrowingDate = scanner.nextLine();
        System.out.print("Masukkan jumlah buku yang dipinjam: ");
        int numberOfBooksBorrowed = scanner.nextInt();
        scanner.nextLine();

        books[bookCount++] = new Books(title, borrowerName, address, phoneNumber, borrowingDate, numberOfBooksBorrowed);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void displayBooks() {
        System.out.println("=== Daftar Buku ===");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i]);
            System.out.println("--------------------");
        }
    }

    public void updateBook() {
        displayBooks();
        System.out.print("Masukkan nomor buku yang ingin diperbarui: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 1 && index <= bookCount) {
            System.out.print("Masukkan judul baru: ");
            String newTitle = scanner.nextLine();
            System.out.print("Masukkan nama peminjam baru: ");
            String newBorrowerName = scanner.nextLine();
            System.out.print("Masukkan alamat baru: ");
            String newAddress = scanner.nextLine();
            System.out.print("Masukkan nomor telepon baru: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("Masukkan tanggal peminjaman baru (YYYY-MM-DD): ");
            String newBorrowingDate = scanner.nextLine();
            System.out.print("Masukkan jumlah buku yang dipinjam baru: ");
            int newNumberOfBooksBorrowed = scanner.nextInt();
            scanner.nextLine();

            books[index - 1].setTitle(newTitle);
            books[index - 1].setBorrowerName(newBorrowerName);
            books[index - 1].setAddress(newAddress);
            books[index - 1].setPhoneNumber(newPhoneNumber);
            books[index - 1].setBorrowingDate(newBorrowingDate);
            books[index - 1].setNumberOfBooksBorrowed(newNumberOfBooksBorrowed);
            System.out.println("Buku berhasil diperbarui!");
        } else {
            System.out.println("Nomor buku tidak valid!");
        }
    }

    public void deleteBook() {
        displayBooks();
        System.out.print("Masukkan nomor buku yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 1 && index <= bookCount) {
            for (int i = index - 1; i < bookCount - 1; i++) {
                books[i] = books[i + 1];
            }
            bookCount--;
            System.out.println("Buku berhasil dihapus!");
        } else {
            System.out.println("Nomor buku tidak valid!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Daftar Buku ===\n");
        for (int i = 0; i < bookCount; i++) {
            sb.append((i + 1)).append(". ").append(books[i]).append("\n");
        }
        return sb.toString();
    }

    public void displayBooks(int startIndex, int endIndex) {
        System.out.println("=== Daftar Buku ===");
        for (int i = startIndex - 1; i < endIndex && i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}
