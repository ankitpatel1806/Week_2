package inheritence.hybird.vehiclesystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
        System.out.println(maxSpeed + " Kmph of this model");
    }
}