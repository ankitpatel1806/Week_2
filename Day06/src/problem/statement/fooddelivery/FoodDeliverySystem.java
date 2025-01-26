package problem.statement.fooddelivery;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        VegItem vegItem1 = new VegItem("Paneer Butter Masala", 200, 2);
        VegItem vegItem2 = new VegItem("Dal Tadka", 150, 1);

        NonVegItem nonVegItem1 = new NonVegItem("Chicken Biryani", 250, 2, 50);
        NonVegItem nonVegItem2 = new NonVegItem("Mutton Korma", 300, 1, 60);

        OrderProcessing orderProcessing = new OrderProcessing();
        orderProcessing.addFoodItem(vegItem1);
        orderProcessing.addFoodItem(vegItem2);
        orderProcessing.addFoodItem(nonVegItem1);
        orderProcessing.addFoodItem(nonVegItem2);

        orderProcessing.processOrder();
    }
}
