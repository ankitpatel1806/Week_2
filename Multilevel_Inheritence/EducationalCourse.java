class Course {
    String courseName;
    int duration;
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price after discount: " + finalPrice);
    }
}
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
