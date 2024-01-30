package OOP.advanced.interface_.interface_test;

public abstract class Animal {
    protected int speed;
    protected double distance;

    public Animal(int speed){
        this.speed = speed;
    }
    abstract void run(int hours);

    public double getDistance(){
        return distance;
    }
}
