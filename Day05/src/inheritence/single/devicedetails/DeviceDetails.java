package inheritence.single.devicedetails;

public class DeviceDetails {
    public static void main(String[] args) {
        Device device = new Device("D12345", "Active");
        device.displayStatus();
        Thermostat thermostat = new Thermostat("T67890", "Active", 22);
        thermostat.displayStatus();
    }
}
