package inheritence.hybird.restaurantsystem;

public class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " With Id "+ id + " is serving food to customers.");
    }
}