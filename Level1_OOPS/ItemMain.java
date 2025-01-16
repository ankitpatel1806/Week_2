import java.util.Scanner;
class Item {
    // Attributes of the item
    String itemCode;
    String itemName;
    double price;
    // Constructor to initialize the attributes
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity; // Total cost = price * quantity
    }
    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}
public class ItemMain {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Taking input for item details
        System.out.print("Enter item code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        // Create an Item object with the provided details
        Item item = new Item(itemCode, itemName, price);
        // Taking input for quantity
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        // Display item details
        item.displayItemDetails();
        // Calculate and display total cost for the given quantity
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
        // Close the scanner
        scanner.close();
    }
}
