package problem.statement.ecommerce;
public class Clothing extends Product implements Taxable {
    private double discountAmount;

    public Clothing(int productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // Example 5% tax rate for clothing
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax for " + getName() + " is: " + calculateTax());
    }
}

