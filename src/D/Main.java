package D;

public class Main {
    public static void main(String[] args) {
        Device bulb = new Bulb();
        Device fan = new Fan();

        Switch bulbSwitch = new Switch(bulb);
        bulbSwitch.press(); // Bulb is ON

        Switch fanSwitch = new Switch(fan);
        fanSwitch.press(); // Fan is ON
    }
}
