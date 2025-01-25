package inheritence.hybird.restaurantsystem;

public class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name +" With Id "+ id + " is cooking meals.");
    }
}