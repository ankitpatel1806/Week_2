package problem.statement.hospitalsystem;

public class HospitalApp {
    public static void main(String[] args) {
        InPatient inPatient1 = new InPatient("P001", "Manoj Kumar", 45, 500, 7);
        OutPatient outPatient1 = new OutPatient("P002", "Sukuna", 30, 150);

        inPatient1.addRecord("Admitted for fever treatment.");
        inPatient1.addRecord("Underwent surgery for appendicitis.");

        outPatient1.addRecord("Consultation for cough and cold.");

        HospitalManagementSystem system = new HospitalManagementSystem();
        system.addPatient(inPatient1);
        system.addPatient(outPatient1);

        system.processBill();
        system.manageMedicalRecords();
    }
}
