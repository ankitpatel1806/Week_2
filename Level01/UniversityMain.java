import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private ArrayList<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayFaculty() {
        System.out.println("Faculty in " + name + " department:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty.getName());
        }
    }
}

class University {
    private ArrayList<Department> departments;

    public University() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartments() {
        departments.clear();  // Deleting university also deletes departments
    }

    public void displayDepartments() {
        for (Department department : departments) {
            department.displayFaculty();
        }
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();
        Department department1 = new Department("Computer Science");
        Faculty faculty1 = new Faculty("Dr. Rajesh Boghey");

        department1.addFaculty(faculty1);
        university.addDepartment(department1);

        university.displayDepartments();  // Display faculty in the departments
        university.removeDepartments();  // Removes all departments when university is deleted
    }
}
