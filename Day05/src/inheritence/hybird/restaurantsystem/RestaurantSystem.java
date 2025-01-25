package inheritence.hybird.restaurantsystem;

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ankit", 101);
        Waiter waiter = new Waiter("Sakshi", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
