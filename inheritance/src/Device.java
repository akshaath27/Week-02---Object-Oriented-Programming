public class Device
{
     int deviceID;
     String status;

    public Device(int deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }
    public  void displayStatus(){
        System.out.println("the id of device: "+deviceID);
        System.out.println("the status of the device: "+status);
    }
}
class thermostat extends Device
{
    int temperaturesettings;

    public thermostat(int deviceID, String status, int temperaturesettings)
    {
        super(deviceID, status);
        this.temperaturesettings = temperaturesettings;
    }
    public void displayStatus()
    {
    super.displayStatus();
        System.out.println("the temperature in thermostat: "+temperaturesettings);

    }
}
class y
{
    public static void main(String[]args)
    {
        Device device1=new thermostat(12457,"working",23);
        Device device2=new thermostat(24332,"working",21);
        device1.displayStatus();
        device2.displayStatus();
    }
}

