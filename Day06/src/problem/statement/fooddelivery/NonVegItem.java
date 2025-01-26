package problem.statement.fooddelivery;

public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public void applyDiscount() {
        double discount = 0.10; // Example 10% discount
        double totalPrice = calculateTotalPrice();
        double discountedPrice = totalPrice - (totalPrice * discount);
        System.out.println("Discounted Price for " + getItemName() + ": " + discountedPrice);
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Non-Veg items";
    }
}
