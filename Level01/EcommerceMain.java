import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private ArrayList<Product> products;
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + " Price: " + product.getPrice());
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

public class EcommerceMain {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);
        
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);
        
        Customer customer = new Customer("Alice");
        customer.placeOrder(order1);
        
        customer.viewOrders();  // Displays the order details
    }
}
