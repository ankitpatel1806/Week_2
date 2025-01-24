class Employee {
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

class Manager extends Employee {
    int teamSize;

    public Manager(String name, String empId, double salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;

    public Intern(String name, String empId, double salary, String duration) {
        super(name, empId, salary);
        this.duration = duration;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}
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
