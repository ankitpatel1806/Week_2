import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private ArrayList<Employee> employees;

    public Department() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName());
        }
    }
}

class Company {
    private ArrayList<Department> departments;

    public Company() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartments() {
        departments.clear();  // When company is deleted, departments are deleted
    }

    public void displayDepartments() {
        for (Department department : departments) {
            department.displayEmployees();
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Company company = new Company();
        Department dept1 = new Department();
        dept1.addEmployee(new Employee("Anand Soni"));

        company.addDepartment(dept1);
        company.displayDepartments();  // Display employees in the departments

        company.removeDepartments();  // Remove all departments
    }
}
