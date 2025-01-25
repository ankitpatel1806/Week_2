package inheritence.hybird.vehiclesystem;

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle electricCar = new ElectricVehicle("Tesla", 150);
        PetrolVehicle petrolCar = new PetrolVehicle("Honda", 120);
        electricCar.charge();
        petrolCar.refuel();
    }
}
