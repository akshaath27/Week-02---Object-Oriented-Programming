import java.util.ArrayList;
public class University {
    private String name;
    private ArrayList<Department>departments;
    private ArrayList<Faculty>faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
    public void addDepartment(String departmentName)
    {
        departments.add(new Department(departmentName));
    }
    public void addFaculty(String facultyname)
    {
        faculties.add(new Faculty(facultyname));
    }
    public void displayuniversity()
    {
        System.out.println("university: "+name);
        System.out.println("departments: ");
        for (Department department:departments){
            department.displayDepartmentdetails();
        }
        for(Faculty faculty:faculties){
            faculty.displayFacultydetails();
        }
    }
}
class Department{
    private String name;

    public Department(String name) {
        this.name = name;
    }
    public void displayDepartmentdetails(){
        System.out.println("Department: "+name);
    }
}
class Faculty{
    private String name;

    public Faculty(String name) {
        this.name = name;
    }
    public void displayFacultydetails(){
        System.out.println("FAculty :"+name);
    }
}
class ink {
    public static void main(String[] args){
        University university=new University("SRM");
        university.addDepartment("maths");
        university.addFaculty("ash");
        university.displayuniversity();
    }
}
