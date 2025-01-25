package inheritence.multilevel.ordermanagement;

public class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus() {
        return "Order shipped. Tracking number: " + trackingNumber;
    }
}
