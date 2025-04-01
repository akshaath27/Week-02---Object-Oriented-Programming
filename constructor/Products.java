public class Products {
    String productname;
    int price;
    static int totalproduct;

    public Products(String productname, int price) {
        this.productname = productname;
        this.price = price;
        totalproduct++;
    }

    public void displaydetails() {
        System.out.println("product name:" + productname);
        System.out.println("the price:" + price);
    }

    public static void displaytotalstudents() {
        System.out.println("the total  number of products" + totalproduct);
    }


    public static void main(String[] args) {
        Products product1 = new Products("soap", 20);
        Products product2 = new Products("milk", 50);
        product1.displaydetails();
        product2.displaydetails();
        Products.displaytotalstudents();
    }
}





