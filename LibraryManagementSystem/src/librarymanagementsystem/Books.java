package librarymanagementsystem;

public class Books {
    private String title;
    private String borrowerName;
    private String address;
    private String phoneNumber;
    private String borrowingDate;
    private int numberOfBooksBorrowed;

    public Books(String title, String borrowerName, String address, String phoneNumber, String borrowingDate, int numberOfBooksBorrowed) {
        this.title = title;
        this.borrowerName = borrowerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowingDate = borrowingDate;
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public int getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }

    public void setNumberOfBooksBorrowed(int numberOfBooksBorrowed) {
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
    }

    @Override
    public String toString() {
        return "Judul: " + title + "\n" +
                "Nama Peminjam: " + borrowerName + "\n" +
                "Alamat: " + address + "\n" +
                "Nomor Telepon: " + phoneNumber + "\n" +
                "Tanggal Peminjaman: " + borrowingDate + "\n" +
                "Jumlah Buku yang Dipinjam: " + numberOfBooksBorrowed;
    }
}
