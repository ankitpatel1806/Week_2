package problem.statement.ridehailing;

public class RideHailingApp {
    public static void main(String[] args) {
        Car car1 = new Car("V001", "John", 15, "Downtown");
        Bike bike1 = new Bike("V002", "Alice", 10, "Uptown");
        Auto auto1 = new Auto("V003", "Bob", 12, "Midtown");

        RideHailingSystem system = new RideHailingSystem();
        system.addVehicle(car1);
        system.addVehicle(bike1);
        system.addVehicle(auto1);

        double distance = 5.0;  // Example distance

        system.calculateFareForAllVehicles(distance);

        system.updateVehicleLocation("V001", "Airport");
        system.updateVehicleLocation("V002", "Suburbs");
    }
}
