import java.util.ArrayList;
import java.util.Scanner;
class CartItem {
    // Attributes of the cart item
    String itemName;
    double price;
    int quantity;
    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // Method to calculate total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }
}
public class {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        // Adding items to the cart
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        // Creating CartItem object and adding to the cart
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        // Displaying total cost
        double totalCost = 0;
        for (CartItem cartItem : cart) {
            totalCost += cartItem.getTotalCost();
        }
        System.out.println("Total Cost: " + totalCost);
        // Close the scanner
        scanner.close();
    }
}
