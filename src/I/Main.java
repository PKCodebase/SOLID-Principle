package I;

public class Main {
    public static void main(String[]args) {
        Animal a = new Animal();
        a.eat();
        a.run();

        Bird b = new Bird();
        b.eat();
        b.fly();

        Fish f = new Fish();
        f.eat();
    }

}
