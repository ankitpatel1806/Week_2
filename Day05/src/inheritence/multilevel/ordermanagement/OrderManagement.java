package inheritence.multilevel.ordermanagement;

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
