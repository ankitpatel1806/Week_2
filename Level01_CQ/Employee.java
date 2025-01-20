public class Employee {
    // Static variable shared by all employees
    private static String companyName = "AnantShunyata Animatation";
    
    // Static variable to track total number of employees
    private static int totalEmployees = 0;
    
    // Final variable for employee ID (cannot be changed)
    private final String id;
    
    // Instance variables
    private String name;
    private String designation;
    
    // Constructor
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
        this.id = generateEmployeeId();  // Unique employee ID
        totalEmployees++;
    }
    
    // Method to generate a unique employee ID (for demonstration)
    private String generateEmployeeId() {
        return "EMP" + (1000 + totalEmployees);
    }
    
    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    // Instance method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Employee ID: " + id);
    }
    
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Ankit Patel", "CEO");
        Employee emp2 = new Employee("Anand Soni", "Developer");
        
        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        
        // Display total employees
        Employee.displayTotalEmployees();
        
        // Verify object instance
        if (emp1 instanceof Employee) {
            System.out.println("emp1 is an instance of Employee.");
        }
    }
}
