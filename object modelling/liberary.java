import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }
}

class in {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Basics", "Jane Smith");

        Library library1 = new Library("Central Library");
        Library library2 = new Library("Community Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);

        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}
