// Interface for discount-related methods
interface Discountable {
    void applyDiscount(double discountPercent);
    String getDiscountDetails();
}

// Abstract class representing a food item
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;
    private double discount = 0.0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent >= 0 && discountPercent <= 100) {
            this.discount = discountPercent;
        }
    }

    public String getDiscountDetails() {
        return discount + "% discount applied";
    }

    public double getDiscount() {
        return discount;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("----------------------------------");
    }
}

// Subclass for vegetarian items
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        double discountAmount = total * (getDiscount() / 100);
        return total - discountAmount;
    }
}

// Subclass for non-vegetarian items (extra charge)
class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        double nonVegCharge = baseTotal * 0.10;  // 10% extra for non-veg
        double total = baseTotal + nonVegCharge;
        double discountAmount = total * (getDiscount() / 100);
        return total - discountAmount;
    }
}

// Main class to test the system
class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Tikka", 150, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 200, 1);

        item1.applyDiscount(10);  // 10% discount
        item2.applyDiscount(5);   // 5% discount

        processOrder(item1);
        processOrder(item2);
    }

    public static void processOrder(FoodItem item) {
        item.getItemDetails();
    }
}
