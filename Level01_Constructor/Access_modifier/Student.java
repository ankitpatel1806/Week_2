
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize student details
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
}

// PostgraduateStudent class demonstrating the use of protected members
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("CGPA: " + getCGPA()); // Accessing private member via getter
    }

    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(040, "Ankit", 9.3);
        pgStudent.displayDetails();
    }
}
