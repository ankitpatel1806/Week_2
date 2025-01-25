package problem.statement.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetail {
    public static void main(String[] args) {
        // Creating employee objects
        Employee fullTimeEmployee = new FullTimeEmployee(101, "Monkey D. Luffy", 50000, 5000);
        Employee partTimeEmployee = new PartTimeEmployee(102, "Sanji ", 20000, 120, 20);

        // Creating department object
        EmployeeDepartment department = new EmployeeDepartment();
        department.assignDepartment("HR");

        // List of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Display employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            department.getDepartmentDetails();
            System.out.println();
        }
    }
}
