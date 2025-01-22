import java.util.ArrayList;
import java.util.List;

// Customer class
class Customer {
    private String customerId;
    private String name;
    private List<Product> products;

    // Constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Methods to get customer details
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    // Method to add products to the customer's list
    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Product class
class Product {
    private String productId;
    private String productName;
    private double price;

    // Constructor
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Methods to get product details
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// BillGenerator class
class BillGenerator {
    private Customer customerDetails;

    // Constructor
    public BillGenerator(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    // Method to calculate total bill for the customer
    public double calculateTotal() {
        double total = 0.0;
        for (Product product : customerDetails.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }
}

// Main class for the application
public class GroceryStore {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("P001", "Apple", 1.50);
        Product product2 = new Product("P002", "Banana", 0.75);
        Product product3 = new Product("P003", "Orange", 1.25);

        // Create a customer and add products to the customer's list
        Customer customer = new Customer("C001", "John Doe");
        customer.addProduct(product1);
        customer.addProduct(product2);
        customer.addProduct(product3);

        // Create a BillGenerator object for the customer
        BillGenerator billGenerator = new BillGenerator(customer);

        // Calculate and display the total bill
        double totalBill = billGenerator.calculateTotal();
        System.out.println("Total bill for " + customer.getName() + " (Customer ID: " + customer.getCustomerId() + "): " + totalBill);
    }
}
