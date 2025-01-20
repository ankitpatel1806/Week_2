public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "General Hospital";
    
    // Static variable to track total number of patients
    private static int totalPatients = 0;
    
    // Final variable for patient ID (cannot be changed)
    private final String patientID;
    
    // Instance variables
    private String name;
    private int age;
    private String ailment;
    
    // Constructor
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = generatePatientID();  // Unique patient ID
        totalPatients++;
    }
    
    // Method to generate a unique patient ID (for demonstration)
    private String generatePatientID() {
        return "PID" + (1000 + totalPatients);
    }
    
    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
    
    // Instance method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }
    
    public static void main(String[] args) {
        // Create patients
        Patient patient1 = new Patient("Levi Ackerman", 30, "Seriouly Injured");
        Patient patient2 = new Patient("Eren Yeager", 24, "self-criticism");
        
        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        
        // Display total patients
        Patient.getTotalPatients();
        
        // Verify object instance
        if (patient1 instanceof Patient) {
            System.out.println("patient1 is an instance of Patient.");
        }
    }
}
