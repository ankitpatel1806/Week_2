import java.util.Scanner;
class Employee {
    // Attributes
    String name;
    int empId;
    double salary;
    // Constructor to initialize the attributes
    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + salary);
    }
}
public class MainEmployee {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Take input for employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        // Create an Employee object
        Employee employee = new Employee(name, empId, salary);
        // Display the details
        employee.displayDetails();
        // Close the scanner
        scanner.close();
    }
}
