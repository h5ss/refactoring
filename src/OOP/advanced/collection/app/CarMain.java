package OOP.advanced.collection.app;

import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("GENESIS", 3000);
        cars[1] = new Car("SOUL", 1500);
        cars[2] = new Car("Spark", 1800);
        Arrays.sort(cars);

        for (Car car : cars)
            System.out.println(car.getCar());
    }
}
