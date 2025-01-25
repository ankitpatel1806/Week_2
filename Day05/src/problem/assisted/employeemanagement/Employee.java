package problem.assisted.employeemanagement;

public class Employee {
    String name;
    String empId;
    double salary;

    public Employee(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}
