class Distributor {
    String name;
    String company;

    // Constructor
    public Distributor(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void supplyGoods() {
        System.out.println(name + " from " + company + " is supplying goods to the shopkeeper.");
    }
}


class Shopkeeper {
    String name;
    String shopName;

    // Constructor
    public Shopkeeper(String name, String shopName) {
        this.name = name;
        this.shopName = shopName;
    }

    public void receiveGoods(Distributor distributor) {
        System.out.println(name + " at " + shopName + " received goods from " + distributor.name + ".");
    }

    public void sellGoods(Customer customer) {
        System.out.println(name + " at " + shopName + " is selling goods to " + customer.name + ".");
    }
}

// Class Customer
class Customer {
    String name;
    String purchaseItem;

    // Constructor
    public Customer(String name, String purchaseItem) {
        this.name = name;
        this.purchaseItem = purchaseItem;
    }

    public void buyGoods() {
        System.out.println(name + " is buying " + purchaseItem + " from the shopkeeper.");
    }
}

// Main class to test the relationships
class BusinessRelations {
    public static void main(String[] args) {
        // Creating objects for each entity
        Distributor distributor = new Distributor("Rajesh", "Fresh Supplies Ltd.");
        Shopkeeper shopkeeper = new Shopkeeper("Anand", "General Store");
        Customer customer = new Customer("Meena", "Rice");

        // Establishing relationships and interactions
        distributor.supplyGoods(); // Distributor supplies goods
        shopkeeper.receiveGoods(distributor); // Shopkeeper receives goods
        shopkeeper.sellGoods(customer); // Shopkeeper sells goods to customer
        customer.buyGoods(); // Customer buys goods
    }
}