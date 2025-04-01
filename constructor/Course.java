public class Course {
    String name;
    int duration;
    int fee;
    static String institutename = "default name";

    public Course(String name, int duration, int fee) {
        this.name = name;
        this.duration = duration;
        this.fee = fee;
    }

    public void displaycoursedetails() {
        System.out.println("the institute name : " + institutename);
        System.out.println("the course name is : " + name);
        System.out.println("the duration of the course : " + duration);
        System.out.println("the fee of the course : " + fee);

    }

    public  static void updateInstitutename(String newname) {
        institutename = newname;
    }

    public static void main(String[] args) {
        Course course1 = new Course("python", 3, 1200);
        Course course2 = new Course("c++", 3, 1200);
        System.out.println("course details 1");
        course1.displaycoursedetails();
        System.out.println("course details2: ");
        course2.displaycoursedetails();

        Course.updateInstitutename("reyansh clg");
        System.out.println("after updating");
        course1.displaycoursedetails();
        course2.displaycoursedetails();
    }
}


