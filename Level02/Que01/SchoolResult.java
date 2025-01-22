import java.util.List;
import java.util.Arrays;

public class SchoolResult {

    // Student class
    static class Student {
        private String studentId;
        private String name;
        private List<Subject> subjects;

        // Constructor
        public Student(String studentId, String name, List<Subject> subjects) {
            this.studentId = studentId;
            this.name = name;
            this.subjects = subjects;
        }

        // Getter and Setter for studentId
        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for subjects
        public List<Subject> getSubjects() {
            return subjects;
        }

        public void setSubjects(List<Subject> subjects) {
            this.subjects = subjects;
        }
    }

    // Subject class
    static class Subject {
        private String subjectName;
        private double score;

        // Constructor
        public Subject(String subjectName, double score) {
            this.subjectName = subjectName;
            this.score = score;
        }

        // Getter and Setter for subjectName
        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        // Getter and Setter for score
        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }

    // GradeCalculator class
    static class GradeCalculator {
        private Student studentDetails;

        // Constructor
        public GradeCalculator(Student studentDetails) {
            this.studentDetails = studentDetails;
        }

        // Getter and Setter for studentDetails
        public Student getStudentDetails() {
            return studentDetails;
        }

        public void setStudentDetails(Student studentDetails) {
            this.studentDetails = studentDetails;
        }

        // Method to calculate grades for the student
        public void calculateGrades() {
            List<Subject> subjects = studentDetails.getSubjects();
            double totalScore = 0;
            for (Subject subject : subjects) {
                totalScore += subject.getScore();
            }
            double averageScore = totalScore / subjects.size();
            System.out.println("Student: " + studentDetails.getName());
            System.out.println("Average Score: " + averageScore);
            
            // Displaying grade based on average score
            if (averageScore >= 90) {
                System.out.println("Grade: A");
            } else if (averageScore >= 80) {
                System.out.println("Grade: B");
            } else if (averageScore >= 70) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F");
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating subjects
        Subject math = new Subject("Math", 85);
        Subject science = new Subject("Science", 92);
        Subject history = new Subject("History", 78);

        // Creating a student with subjects
        Student student = new Student("S123", "John Doe", Arrays.asList(math, science, history));

        // Creating a GradeCalculator for the student
        GradeCalculator gradeCalculator = new GradeCalculator(student);

        // Calculating grades for the student
        gradeCalculator.calculateGrades();
    }
}
