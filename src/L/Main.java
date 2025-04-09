package L;

public class Main {
    public static void main(String [] args){
        FlyingBird bird = new Parrot();
        bird.eat();
        bird.fly();

        Bird b = new Penguin();
        b.eat();
    }
}
