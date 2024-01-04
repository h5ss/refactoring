package OOP.advanced.collection.app;

import java.sql.CallableStatement;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String car;
    private int price;

    public Car(String car, int price) {
        this.car = car;
        this.price = price;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        int comparePrice = o.getPrice();
        return comparePrice -this.price;
    }


}
