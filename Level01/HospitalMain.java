import java.util.ArrayList;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " is consulting " + patient.getName());
    }

    public void displayPatients() {
        System.out.println(name + "'s patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Sakashi Sharma");
        Patient patient = new Patient("Ankit Patel");

        doctor.consult(patient);  // Communication between doctor and patient
        doctor.displayPatients();  // Display list of patients
    }
}
