// Reservable interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;
    private String borrower;  // secured using encapsulation

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String getBorrower() {
        if (!isAvailable) return borrower;
        else return "Not borrowed";
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract int getLoanDuration(); // abstract method

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration (days): " + getLoanDuration());
        System.out.println("Availability: " + (isAvailable ? "Available" : "Reserved by " + borrower));
        System.out.println("-----------------------------------");
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            borrower = borrowerName;
            System.out.println(title + " has been reserved by " + borrowerName);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass: Book
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }
}

// Subclass: DVD
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }
}

// Main class
class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine("M202", "National Geographic", "Nat Geo Editors");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        // Polymorphic array
        LibraryItem[] items = {item1, item2, item3};

        // Reserve items
        item1.reserveItem("Alice");
        item2.reserveItem("Bob");

        // Display details
        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}
