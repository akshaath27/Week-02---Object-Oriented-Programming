class Student {
    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass demonstrating the use of protected members
class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Main class for execution
class ash{
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 3.8);
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 3.9, "Data Science");

        student1.displayStudentDetails();
        System.out.println();
        pgStudent.displayPostgraduateDetails();
    }
}
