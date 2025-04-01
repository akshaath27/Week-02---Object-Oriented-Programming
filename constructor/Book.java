import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {

        ArrayList<Book> borrowedBook = new ArrayList<>();
        ArrayList<Book> availableBook = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();

        Book book = new Book(title, author, price);
        availableBook.add(book);

        System.out.println("\nBook Details:");
        book.displayBookDetails();

        System.out.println("\nAttempting to Borrow Book...");
        book.borrowBook();

        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();


    }

    public void b1(ArrayList<Book> a, ArrayList<Book> a2, String title){
        for(Book b1 : a){
            if(b1.title.equals(title)){
                a2.add(b1);
                a.remove(b1);
            }

        }
    }
}
