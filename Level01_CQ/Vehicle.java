public class Vehicle {
    // Static variable shared by all vehicles
    private static double registrationFee = 200.0;
    
    // Final variable for vehicle registration number (cannot be changed)
    private final String registrationNumber;
    
    // Instance variables
    private String ownerName;
    private String vehicleType;
    
    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = generateRegistrationNumber();  // Unique registration number
    }
    
    // Method to generate a unique registration number (for demonstration)
    private String generateRegistrationNumber() {
        return "REG" + (1000 + Math.random() * 9999);
    }
    
    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated registration fee: $" + registrationFee);
    }
    
    // Instance method to display vehicle registration details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    
    public static void main(String[] args) {
        // Create vehicles
        Vehicle vehicle1 = new Vehicle("Monkey D. Luffy", "Thounsand Sunny");
        Vehicle vehicle2 = new Vehicle("Rononoa Zoro", "Lost");
        
        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        // Update registration fee
        Vehicle.updateRegistrationFee(250.0);
        
        // Verify object instance
        if (vehicle1 instanceof Vehicle) {
            System.out.println("vehicle1 is an instance of Vehicle.");
        }
    }
}
