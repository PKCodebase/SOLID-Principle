package I;

public class Animal implements Eater,Runner{
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }
}
