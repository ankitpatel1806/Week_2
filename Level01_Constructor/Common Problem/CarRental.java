import java.util.Scanner;
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 50.0; // Example cost per day
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Main function to demonstrate the CarRental system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for car rental details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();

        // Creating the CarRental object
        CarRental rental = new CarRental(customerName, carModel, rentalDays);

        // Printing the total rental cost
        System.out.println("\nTotal Rental Cost: " + rental.calculateTotalCost());

        scanner.close();
    }
}
