public class Product {
    // Static variable shared by all products
    private static double discount = 10.0;
    
    // Final variable for product ID (cannot be changed)
    private final String productID;
    
    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    
    // Constructor
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = generateProductID();  // Unique product ID
    }
    
    // Method to generate a unique product ID (for demonstration)
    private String generateProductID() {
        return "PID" + (1000 + Math.random() * 9999);
    }
    
    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
    }
    
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println("Discount: " + discount + "%");
    }
    
    public static void main(String[] args) {
        // Create products
        Product prod1 = new Product("Laptop", 1200, 2);
        Product prod2 = new Product("Phone", 800, 3);
        
        // Display product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();
        
        // Update discount
        Product.updateDiscount(15.0);
        
        // Verify object instance
        if (prod1 instanceof Product) {
            System.out.println("prod1 is an instance of Product.");
        }
    }
}
