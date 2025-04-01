import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Order>orders;
    private ArrayList<Product>products;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
        this.products = new ArrayList<>();
    }
    public void addOrders(String ordername){
        orders.add(new Order(ordername));
    }
    public void addProducts(String productname){
        products.add(new Product(productname));
    }
    public void displayCustomer()
    {
        System.out.println("Customer name:"+name);
        System.out.println("Orders: ");
        for(Order order:orders){
            order.displayOrderdetails();
        }
        System.out.println("Product:");
        for(Product product:products){
            product.displayProductdetails();
        }
    }
}
class Order{
    private String name;

    public Order(String name) {
        this.name = name;
    }
    public void displayOrderdetails()
    {
        System.out.println("Order"+name);
    }
}
class Product{
    private String name;

    public Product(String name) {
        this.name = name;
    }
    public  void displayProductdetails()
    {
        System.out.println("Product:"+name);
    }
}
class random{
    public static void main(String[]args)
    {
        Customer customer=new Customer("ash");
        customer.addOrders("123");
        customer.addProducts("mouse");
        customer.displayCustomer();
    }
}
