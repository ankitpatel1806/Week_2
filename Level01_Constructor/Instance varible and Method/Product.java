class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total products created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 86000);
        Product p2 = new Product("Phone", 2000);
        
        p1.displayProductDetails();
        p2.displayProductDetails();
        
        Product.displayTotalProducts();  // Class method called on class
    }
}
