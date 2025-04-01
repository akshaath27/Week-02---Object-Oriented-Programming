public class Course {
    private String coursename;
    private int duration;

    public Course(String coursename, int duration) {
        this.coursename = coursename;
        this.duration = duration;
    }
    public void displaydetails()
    {
        System.out.println("the course name: "+coursename);
        System.out.println("the duration of the course :"+duration);
    }
}
class OnlineClass extends Course
{
    String Platform;
    String IsRecorded;

    public OnlineClass(String coursename, int duration, String platform, String isRecorded) {
        super(coursename, duration);
        Platform = platform;
        IsRecorded = isRecorded;
    }

    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("the platform: "+Platform);
        System.out.println("session are recorded or not"+IsRecorded);
    }
}
class PaidOnlineClass extends OnlineClass
{
    int fee;
    int discount;


    public PaidOnlineClass(String coursename, int duration, String platform, String isRecorded, int fee, int discount) {
        super(coursename, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;

    }


    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("discount :"+discount);
        System.out.println("fee: "+fee);
    }
}
class co
{
    public static void main(String[]args)
    {
        Course cou1=new Course("web development",8);
        Course cou2=new PaidOnlineClass("web development",8,"coursera","yes",5000,10);
        cou1.displaydetails();
        cou2.displaydetails();

    }
}