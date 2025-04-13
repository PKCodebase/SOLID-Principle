package D;

public class Bulb implements Device{
    @Override
    public void turnOn() {
        System.out.println("Bulb is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb is OFF");
    }
}
