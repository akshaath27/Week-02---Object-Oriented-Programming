import java.util.ArrayList;
import java.util.List;

interface Taxable{
     double calculateTax();
     String getTaxdetails();
}

abstract class Product {
    int productId;
    String name;
    int price;

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public abstract double calculateDiscount();

    public void displayDetails(){
        System.out.println("product id: "+productId);
        System.out.println("name: "+name);
        System.out.println("price :"+price);
    }
}
class Electronics extends Product implements Taxable
{
    public Electronics(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.15;
    }

    @Override
    public String getTaxdetails() {
        return "tax:15%";
    }
}
class Clothing extends Product implements Taxable
{
    public Clothing(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.05;
    }

    @Override
    public String getTaxdetails() {
        return "tax :5%";
    }
}
class Groceries extends Product
{
    public Groceries(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.10;
    }
}
class ecommerceplatform
{
    public static void main(String[]args)
    {
        List<Product>products=new ArrayList<>();
        products.add(new Electronics(1,"phone",40000));
        products.add(new Clothing(2,"pant",1500));
        products.add(new Groceries(3,"fish",600));
        for(Product p:products){
            p.displayDetails();
            double discount=p.calculateDiscount();
            double tax=(p instanceof Taxable)?((Taxable)p).calculateTax():0.0;
            double finalprice=p.getPrice()+tax-discount;
            System.out.println("Discount="+discount);
            System.out.println("Tax="+tax);
            if(p instanceof Taxable)
            {
                System.out.println(((Taxable)p).getTaxdetails());
            }
            else {
                System.out.println("no tax");
            }
            System.out.println("Final price:"+finalprice);
        }
    }
}