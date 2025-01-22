import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Students enrolled:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignToCourse(Course course) {
        course.assignProfessor(this);
    }
}

class University {
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public University() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void viewCourses() {
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }
}

public class UniversityMain2 {
    public static void main(String[] args) {
        University university = new University();
        
        Student student1 = new Student("Zoro");
        Student student2 = new Student("Sanji");
        Professor professor = new Professor("Ray ley");
        
        university.addStudent(student1);
        university.addStudent(student2);
        university.addProfessor(professor);
        
        Course course = new Course("Computer Science 101");
        university.addCourse(course);
        
        course.assignProfessor(professor);
        student1.enrollInCourse(course);
        student2.enrollInCourse(course);
        
        university.viewCourses();  // Displays course details including enrolled students and professor
    }
}
