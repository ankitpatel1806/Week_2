package inheritence.multilevel.educationcourse;

public class PaidOnlineCourse extends OnlineCourse {
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