package inheritence.multilevel.ordermanagement;

public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate + ". Tracking number: " + trackingNumber;
    }
}