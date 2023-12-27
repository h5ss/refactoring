package OOP.advanced.interface_test;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }
    @Override
    void run(int hours) {
        distance += hours * speed * 0.5;
    }
}
