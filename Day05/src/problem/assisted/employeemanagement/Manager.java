package problem.assisted.employeemanagement;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, String empId, double salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
