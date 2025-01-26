package problem.statement.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessing {
    private List<FoodItem> orderItems = new ArrayList<>();

    public void addFoodItem(FoodItem item) {
        orderItems.add(item);
    }

    public void processOrder() {
        double totalOrderPrice = 0;

        for (FoodItem item : orderItems) {
            System.out.println(item.getItemDetails());
            totalOrderPrice += item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
            }
        }

        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}
