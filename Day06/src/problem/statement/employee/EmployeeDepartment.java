package problem.statement.employee;

public class EmployeeDepartment implements Department {
    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + departmentName);
    }
}
