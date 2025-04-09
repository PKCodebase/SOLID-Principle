package I;

public class Bird implements Eater,Flyer {
    @Override
    public void eat() {
        System.out.println("Bird is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
