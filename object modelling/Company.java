import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName, String department) {
        employees.add(new Employee(employeeName, department));
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee: " + name + " | Department: " + department);
    }
}

class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addEmployee("Alice", "IT");
        company.addEmployee("Bob", "IT");
        company.addEmployee("Charlie", "HR");

        company.displayCompanyDetails();
    }
}
