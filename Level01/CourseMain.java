import java.util.ArrayList;

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

public class CourseMain {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Ankit");
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        school.addStudent(student1);

        student1.displayCourses();  // Displays courses of the student
    }
}
