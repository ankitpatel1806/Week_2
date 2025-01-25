package problem.statement.ecommerce;
public class Groceries extends Product {
    private double discountAmount;

    public Groceries(int productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }
}
