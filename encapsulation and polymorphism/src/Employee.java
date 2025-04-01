import java.util.ArrayList;
import java.util.List;
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    int employeeId;
    String name;
    int baseSalary;
    private String department;

    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    public abstract int calculateSalary();
    public void displayDetails()
    {
        System.out.println("Employee id  : "+employeeId);
        System.out.println("name : "+name);
        System.out.println("Base Salary :"+baseSalary);
        System.out.println("calculated Salary : "+calculateSalary());
        System.out.println("department :"+getDepartmentDetails());
    }

     @Override
     public void assignDepartment(String departmentName)
     {
       this.department= departmentName;
     }
      @Override
      public String getDepartmentDetails() {
          return department;
      }
}
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return getBaseSalary();
    }
}
class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return getBaseSalary();
    }
}
 class employeemanagement{
    public static void main(String[]args)
    {
        Employee emp1=new FullTimeEmployee(1,"ash",50000);
        emp1.assignDepartment("HR");
        Employee emp2=new PartTimeEmployee(2,"akshaath",9000);
        emp2.assignDepartment("testing");
        Employee[] employees={emp1,emp2};
        for(Employee emp:employees){
            emp.displayDetails();
        }
    }
 }
