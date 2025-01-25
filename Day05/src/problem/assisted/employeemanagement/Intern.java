package problem.assisted.employeemanagement;

public class Intern extends Employee {
    String duration;

    public Intern(String name, String empId, double salary, String duration) {
        super(name, empId, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}
