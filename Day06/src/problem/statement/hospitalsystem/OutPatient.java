package problem.statement.hospitalsystem;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return medicalHistory.toString();
    }
}
