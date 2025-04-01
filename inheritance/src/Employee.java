// Main.java

class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size  : " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language   : " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String school;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("School     : " + school);
    }
}

 class M{
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", 101, 95000, 5);
        Employee emp2 = new Developer("Bob", 102, 85000, "Java");
        Employee emp3 = new Intern("Charlie", 103, 30000, "MIT");

        Employee[] employees = {emp1, emp2, emp3};

        for (Employee emp : employees) {
            System.out.println("===============");
            emp.displayDetails();
            System.out.println();
        }
    }
}
