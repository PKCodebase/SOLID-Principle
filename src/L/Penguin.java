package L;

public class Penguin implements Bird{
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
    // No fly() — because Penguin doesn't fly, and no one expects it to
}
