import java.util.ArrayList;
import java.time.LocalDateTime;

class Device {
    // Attributes
    String name;
    String type;
    boolean isOn;

    // Constructor
    public Device(String name, String type) {
        this.name = name;
        this.type = type;
        this.isOn = false; // Device is initially off
    }

    // Method to turn the device on/off
    public void turnOn() {
        this.isOn = true;
        System.out.println(this.name + " is now ON");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println(this.name + " is now OFF");
    }
}

class SmartHome {
    ArrayList<Device> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    // Add a new device to the system with a unique identifier
    public void addDevice(Device device) {
        for (Device d : devices) {
            if (device.name.equals(d.name)) {
                System.out.println("This device already exists");
                return;
            }
        }
        devices.add(device);
        System.out.println("Device " + device.name + " added successfully");
    }

    // Control individual devices (turn on/off) by name
    public void controlDevice(String name, boolean turnOn) {
        for (Device d : devices) {
            if (d.name.equals(name)) {
                if (turnOn) {
                    d.turnOn();
                } else {
                    d.turnOff();
                }
                return;
            }
        }
        System.out.println("Device " + name + " not found");
    }

    // Create schedules for specific devices (e.g., turn lights on at sunset)
    public void scheduleDevice(String name, boolean turnOn, LocalDateTime dateTime) {
        for (Device d : devices) {
            if (d.name.equals(name)) {
                while (LocalDateTime.now().isBefore(dateTime)) {
                    // Waiting until the scheduled time
                }
                if (turnOn) {
                    d.turnOn();
                } else {
                    d.turnOff();
                }
                return;
            }
        }
        System.out.println("Device " + name + " not found for scheduling");
    }
}

public class q8 {
    public static void main(String[] args) {
        Device lightBulb = new Device("Light Bulb", "Light");
        Device electricFan = new Device("Electric Fan", "Fan");

        SmartHome smartHome = new SmartHome();
        smartHome.addDevice(lightBulb);
        smartHome.addDevice(electricFan);

        smartHome.controlDevice("Light Bulb", true); // Turn on the light bulb
        smartHome.controlDevice("Electric Fan", true); // Turn on the electric fan

        // Schedule the light bulb to turn off in 5 seconds for demonstration purposes
        LocalDateTime futureTime = LocalDateTime.now().plusSeconds(5);
        smartHome.scheduleDevice("Light Bulb", false, futureTime);
    }
}
