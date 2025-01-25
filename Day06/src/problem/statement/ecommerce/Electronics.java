package problem.statement.ecommerce;
public class Electronics extends Product implements Taxable {
    private double discountPercentage;

    public Electronics(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // Example 18% tax rate for electronics
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax for " + getName() + " is: " + calculateTax());
    }
}
