package problem.statement.ridehailing;

import java.util.ArrayList;
import java.util.List;

public class RideHailingSystem {
    private List<Vehicle> vehicles;

    public RideHailingSystem() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void calculateFareForAllVehicles(double distance) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails() + ", Fare for " + distance + " km: " + vehicle.calculateFare(distance));
        }
    }

    public void updateVehicleLocation(String vehicleId, String newLocation) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation(newLocation);
                System.out.println("Location of " + vehicle.getVehicleId() + " updated to: " + newLocation);
            }
        }
    }
}
