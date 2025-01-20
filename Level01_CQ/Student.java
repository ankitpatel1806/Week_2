public class Student {
    // Static variable shared across all students
    private static String universityName = "Technocrats";
    
    // Static variable to track total number of students
    private static int totalStudents = 0;
    
    // Final variable for roll number (cannot be changed)
    private final String rollNumber;
    
    // Instance variables
    private String name;
    private String grade;
    
    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = generateRollNumber();  // Unique roll number
        totalStudents++;
    }
    
    // Method to generate a unique roll number (for demonstration)
    private String generateRollNumber() {
        return "RN" + (1000 + totalStudents);
    }
    
    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    
    // Instance method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNumber);
    }
    
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Ankit", "A");
        Student student2 = new Student("Anand", "A");
        
        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        // Display total students
        Student.displayTotalStudents();
        
        // Verify object instance
        if (student1 instanceof Student) {
            System.out.println("student1 is an instance of Student.");
        }
    }
}
