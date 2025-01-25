package inheritence.multilevel.educationcourse;

public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Java", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Python Programming", 40, "Unaccademy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Mastering Data Science", 50, "GoogleLearn", false, 20000, 10);

        System.out.println("\nCourse Information (Basic):");
        course.displayCourseInfo();

        System.out.println("\nOnline Course Information:");
        onlineCourse.displayCourseInfo();

        System.out.println("\nPaid Online Course Information:");
        paidCourse.displayCourseInfo();
    }
}
