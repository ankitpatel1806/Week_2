package problem.assisted.employeemanagement;

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Ankit", "E001", 90000, 10);
        Developer developer = new Developer("Anand", "E002", 70000, "Python");
        Intern intern = new Intern("Avinash", "I001", 20000, "10 months");

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
