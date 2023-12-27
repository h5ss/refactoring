package OOP.advanced.interface_test;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance += hours * speed;
    }

    @Override
    public void fly() {
        this.speed *= 2;
    }
}
