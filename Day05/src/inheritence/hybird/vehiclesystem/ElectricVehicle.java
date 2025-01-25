package inheritence.hybird.vehiclesystem;

public class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    void charge() {
        System.out.println(model + " is charging.");
        System.out.println(maxSpeed + " Kmph of this model");

    }
}
