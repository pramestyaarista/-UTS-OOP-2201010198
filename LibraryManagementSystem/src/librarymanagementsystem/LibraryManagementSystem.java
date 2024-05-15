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

        System.out.println("=======================================");
        System.out.println("|       Menu Utama Perpustakaan       |");
        System.out.println("=======================================");
        System.out.println("| A. Lihat Buku                       |");
        System.out.println("| B. Tambah Data Pinjam               |");
        System.out.println("| C. Edit Data Pinjam                 |");
        System.out.println("| D. Hapus Data Pinjam                |");
        System.out.println("| E. Keluar                           |");
        System.out.println("======================================");

        do {
            System.out.print("Pilih opsi (A/B/C/D/E): ");
            userChoice = scanner.nextLine().toUpperCase();

            switch (userChoice) {
                case "A":
                    System.out.println("\nLihat Buku...");
                    bookManager.displayBooks();
                    break;
                case "B":
                    System.out.println("\nTambah Data Pinjam...");
                    bookManager.addBook();
                    break;
                case "C":
                    System.out.println("\nPerbarui Data...");
                    bookManager.updateBook();
                    break;
                case "D":
                    System.out.println("\nHapus Data Pinjam...");
                    bookManager.deleteBook();
                    break;
                case "E":
                    System.out.println("\nTerima kasih sudah meminjam di Perpustakaan kami!");
                    break;
                default:
                    System.out.println("\nTolong masukan data yang valid (A/B/C/D/E)");
                    break;
            }
        } while (!userChoice.equals("E"));

        scanner.close();
    }
}
