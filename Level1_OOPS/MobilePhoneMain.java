import java.util.Scanner;
class MobilePhone {
    // Attributes of the mobile phone
    String brand;
    String model;
    double price;
    // Constructor to initialize the attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Method to display all the details of the mobile phone
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class MobliePhoneMain {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Taking input for mobile phone details
        System.out.print("Enter phone brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter phone model: ");
        String model = scanner.nextLine();
        System.out.print("Enter phone price: ");
        double price = scanner.nextDouble();
        // Create a MobilePhone object with the provided details
        MobilePhone phone = new MobilePhone(brand, model, price);
        // Display the phone details
        phone.displayPhoneDetails();
        // Close the scanner
        scanner.close();
    }
}
