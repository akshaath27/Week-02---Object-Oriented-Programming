public class Order {
    private int orderID;
    private String orderDate;

    public Order(int orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public String getOrderStatus()
    {
        return "order placed";
    }
    public void displayorderdetails()
    {
        System.out.println("the order id: "+orderID);
        System.out.println("the order date :"+orderDate);
        System.out.println("Status :"+getOrderStatus());
    }
}
class ShippedOrder extends Order
{
    int Trackingnumber;

    public ShippedOrder(int orderID, String orderDate, int trackingnumber) {
        super(orderID, orderDate);
        Trackingnumber = trackingnumber;
    }
    public String getOrderStatus(){
        return "Shipped";
    }

    @Override
    public void displayorderdetails() {
        super.displayorderdetails();
        System.out.println("tracking number :"+Trackingnumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliverydate;

    public DeliveredOrder(int orderID, String orderDate, int trackingnumber, String deliverydate) {
        super(orderID, orderDate, trackingnumber);
        this.deliverydate = deliverydate;
    }
    public String getOrderStatus()
    {
        return "delivered";
    }

    @Override
    public void displayorderdetails() {
        super.displayorderdetails();
        System.out.println("delivery date"+deliverydate);
    }
}
class OrderManagement{
    public static void main(String[]args){
        Order order=new Order(101,"05-04-2024");
        ShippedOrder shipped=new ShippedOrder(102,"06-04-2025",565656);
        DeliveredOrder delivered=new DeliveredOrder(1003,"07-04-2025",565756,"09-04-2025");

        System.out.println("===Order===");
        order.displayorderdetails();
        System.out.println("===ShippedOrder===");
        shipped.displayorderdetails();
        System.out.println("===DeliveredOrder===");
        delivered.displayorderdetails();
    }
}