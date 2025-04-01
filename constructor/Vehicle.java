public class Vehicle {
    String ownername;
    String vehicletype;
    static int registrationfee=50000;

    public Vehicle(String ownername, String vehicletype) {
        this.ownername = ownername;
        this.vehicletype = vehicletype;

    }
    public void displayvehicledetails()
    {
        System.out.println("the name of the owner: "+ownername);
        System.out.println("the type of the vehicle"+vehicletype);
        System.out.println("the registration fee: "+registrationfee);
    }
    public static void updateRegistrationfee(int newfee)
    {
        registrationfee=newfee;
    }
    public static void main(String[]args)
    {
        Vehicle vehicle1=new Vehicle("akshaath","innova");
        Vehicle vehicle2=new Vehicle("ash","swift");
        System.out.println("first car: ");
        vehicle1.displayvehicledetails();
        System.out.println("second car: ");
        vehicle2.displayvehicledetails();

        Vehicle.updateRegistrationfee(60000);
        System.out.println("after updating");
        vehicle1.displayvehicledetails();
        vehicle2.displayvehicledetails();
    }
}
