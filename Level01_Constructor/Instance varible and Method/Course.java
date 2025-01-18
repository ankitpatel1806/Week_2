class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable
    static String instituteName = "Technocrats ";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Python", 13, 500);
        Course c2 = new Course("Java", 54, 700);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Technocrats Institue Of technology"); // Updating institute name

        System.out.println("Updated Institute Name: " + Course.instituteName);
    }
}
