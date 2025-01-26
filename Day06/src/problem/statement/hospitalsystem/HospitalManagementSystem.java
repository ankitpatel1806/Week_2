package problem.statement.hospitalsystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    private List<Patient> patients;

    public HospitalManagementSystem() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void processBill() {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails() + ", Total Bill: " + patient.calculateBill());
        }
    }

    public void manageMedicalRecords() {
        for (Patient patient : patients) {
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println("Medical Records for " + patient.getName() + ":\n" + medicalRecord.viewRecords());
            }
        }
    }
}
