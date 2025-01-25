package problem.statement.vehiclerental;
public class Car extends Vehicle implements Insurable {
    private double insuranceRate;

    public Car(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance cost for car (" + getVehicleNumber() + "): " + calculateInsurance());
    }
}
