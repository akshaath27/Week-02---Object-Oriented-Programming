public class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public void displaydetails()
    {
        System.out.println("the title of the book: "+title);
        System.out.println("th year of publication: "+year);
    }
}
class Author extends Book{
    private String  name;
    private String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("author name : "+name);
        System.out.println("about Author:"+bio);
    }
}
class z{
    public static void main(String[]args)
    {
        Book book1=new Author("ode",2019,"ash","studied in srm -age 27");

        book1.displaydetails();
    }
}
