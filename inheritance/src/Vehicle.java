public class Vehicle
{
    int MaxSpeed;
    String Fueltype;

    public Vehicle(int maxSpeed, String fueltype) {
        MaxSpeed = maxSpeed;
        Fueltype = fueltype;
    }
    public void displayInfo(){
        System.out.println("the max speed is : "+ MaxSpeed);
        System.out.println("the fuel type is :"+Fueltype);

    }
}
class Car extends Vehicle{
    int seatcapacity;
    public Car(int maxSpeed, String fueltype, int seatcapacity) {
        super(maxSpeed, fueltype);
        this.seatcapacity = seatcapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("seat capacity: "+seatcapacity);
    }
}
class Truck extends Vehicle{
    public Truck(int maxSpeed, String fueltype) {
        super(maxSpeed, fueltype);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(int maxSpeed, String fueltype) {
        super(maxSpeed, fueltype);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
class h
{
    public static void main(String[]args)
    {
        Vehicle vh1=new Car(89,"diesel",8);
        Vehicle vh2=new Truck(65,"petrol");
        Vehicle vh3=new Motorcycle(100,"diesel");
        Vehicle[] vehicles={vh1,vh2,vh3};
        for(Vehicle vh:vehicles)
        {
            vh.displayInfo();
        }
    }
}


