package problem.statement.vehiclerental;
import java.util.ArrayList;
import java.util.List;

public class VehicleRental {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle car = new Car("CAR123", 50, 0.1); // 10% insurance
        Vehicle bike = new Bike("BIKE321", 20, 0.05); // 5% insurance
        Vehicle truck = new Truck("TRUCK231", 100, 0.2); // 20% insurance

        // List to hold all vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Calculate rental and insurance costs for each vehicle
        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental cost for " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + "): " + rentalCost);

            // If the vehicle is insurable, calculate insurance
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                insurableVehicle.getInsuranceDetails();
            }

            System.out.println();
        }
    }
}