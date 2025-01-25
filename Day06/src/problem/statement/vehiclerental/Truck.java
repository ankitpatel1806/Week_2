package problem.statement.vehiclerental;
public class Truck extends Vehicle implements Insurable {
    private double insuranceRate;

    public Truck(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
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
        System.out.println("Insurance cost for truck (" + getVehicleNumber() + "): " + calculateInsurance());
    }
}