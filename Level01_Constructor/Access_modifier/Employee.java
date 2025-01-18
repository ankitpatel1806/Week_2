// Employee class
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}

// Manager class demonstrating access to employeeID and department
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department); 
    }

    public static void main(String[] args) {
        Manager manager = new Manager(1001, "HR", 75000);
        manager.displayDetails();
        manager.setSalary(80000);  // Modifying salary using public method
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
