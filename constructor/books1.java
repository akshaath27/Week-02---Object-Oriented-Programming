
public class books1 {
    private String title;
    private String author;
    private int price;

    public books1(){
        title="harry potter";
        author="jk.rowling";
        price=200;

    }

    public books1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("the title of the book:"+title);
        System.out.println("the author of the book:"+author);
        System.out.println("the price of the book:"+price);

    }
    public static void main(String[]args)
    {
        books1 first=new books1();
        System.out.println("the first book:");
        first.display();
        books1 second=new books1("ode","ash",200);
        System.out.println("second book:");
        second.display();


    }
}
