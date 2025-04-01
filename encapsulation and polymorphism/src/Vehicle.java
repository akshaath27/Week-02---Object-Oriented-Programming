import java.util.ArrayList;
import java.util.List;

interface Insurable
{
    double calculateInsurance();
    void getInsuranceDetails();
}
abstract class Vehicle {
    String vehicleNumber;
    String  type;
    double rentalrate;

    public Vehicle(double rentalrate, String type, String vehicleNumber) {
        this.rentalrate = rentalrate;
        this.type = type;
        this.vehicleNumber = vehicleNumber;
    }
    public String getVehicleNumber()
    {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalrate() {
        return rentalrate;
    }

    public void setRentalrate(double rentalrate) {
        this.rentalrate = rentalrate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails(int days)
    {
        System.out.println("vehicle number:  "+vehicleNumber);
        System.out.println("type:  "+type);
        System.out.println("daily rental rate: "+rentalrate);

    }
}
class Car extends Vehicle implements Insurable{
    public Car(double rentalrate, String type, String vehicleNumber) {
        super(rentalrate, type, vehicleNumber);
    }
    public double calculateRentalCost(int days){
        return getRentalrate()*days;
    }
    public double calculateInsurance(){
        return 5000.0;
    }
    public void getInsuranceDetails(){
        System.out.println("is insured");
    }
}
class Truck extends Vehicle implements Insurable{
    public Truck(double rentalrate, String type, String vehicleNumber) {
        super(rentalrate, type, vehicleNumber);
    }
    public double calculateRentalCost(int days){
        return getRentalrate()*days*0.9;
    }
    public double calculateInsurance(){
        return 8000.0;
    }
    public void getInsuranceDetails(){
        System.out.println("is insured");
    }
}
class Bike extends Vehicle implements Insurable{
    public Bike(double rentalrate, String type, String vehicleNumber) {
        super(rentalrate, type, vehicleNumber);
    }
    public double calculateRentalCost(int days){
        return getRentalrate()*days;
    }
    public double calculateInsurance(){
        return 5000.0;
    }
    public void getInsuranceDetails(){
        System.out.println("is insured");
    }
}

class VehicleRentalSystem{
    public static void main(String[]args)
    {
        Car car1=new Car(10000,"honda","tn07g1234");
        Truck truck1=new Truck(9000,"LANDT","76597");
        Bike bike1=new Bike(8999,"rx","8989");
        System.out.println("rental cost of car"+car1.calculateRentalCost(7));
        System.out.println("insurance of car"+car1.calculateInsurance());
        System.out.println("truck rental" +truck1.calculateRentalCost(7));
        System.out.println("insurance of truck"+truck1.calculateInsurance());
        System.out.println("rental of bike"+bike1.calculateRentalCost(7));
        System.out.println("insurance of bike"+bike1.calculateInsurance());

        car1.getInsuranceDetails();
        truck1.getInsuranceDetails();
        bike1.getInsuranceDetails();
    }
}
