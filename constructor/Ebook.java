class Ebook {
    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    public Ebook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display Ebook details
    public void displayEbookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass demonstrating access to ISBN and title
class EBooks extends Ebook {
    public EBooks(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookInfo() {
        System.out.println("Accessing protected and public members from subclass:");
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
    }
}

// Main class for execution
class main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("123-456-789", "Java Programming", "John Doe");
        EBooks ebook2 = new EBooks("987-654-321", "Advanced Java", "Jane Smith");

        ebook1.displayEbookDetails();
        System.out.println();
        ebook2.displayEBookInfo();
    }
}
