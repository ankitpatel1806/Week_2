package problem.assisted.employeemanagement;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
