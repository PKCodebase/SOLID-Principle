package D;

public class Switch {

    private Device device;

    Switch(Device device) {
        this.device = device;
    }

    void press() {
        device.turnOn();
    }
}
