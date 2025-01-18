class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    static double registrationFee = 100;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    // Class method to update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ankit", "Car");
        Vehicle v2 = new Vehicle("Anand", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        System.out.println("Registration Fee: " + Vehicle.registrationFee);

        Vehicle.updateRegistrationFee(150);

        System.out.println("Updated Registration Fee: " + Vehicle.registrationFee);
    }
}
