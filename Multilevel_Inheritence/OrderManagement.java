class Order {
    String orderId;
    String orderDate;
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() {
        return "Order placed. Waiting for shipment.";
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus() {
        return "Order shipped. Tracking number: " + trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate + ". Tracking number: " + trackingNumber;
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("O12345", "2025-01-20");
        ShippedOrder shippedOrder = new ShippedOrder("O12346", "2025-01-18", "T1234");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O12347", "2025-01-15", "T5678", "2025-01-22");
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
