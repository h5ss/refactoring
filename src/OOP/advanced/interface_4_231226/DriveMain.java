package OOP.advanced.interface_4_231226;

import OOP.advanced.interface_3_231226.D;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  // 프로모션이 (됐기 때문에) ---> 오버라이딩 메소드 호출 ---> 다형성
        driver.drive(taxi); // 프로모션이 (됐기 때문에) ---> 오버라이딩 메소드 호출 ---> 다형성

    }
    //인터페이스 매개변수를 갖는 메소드
    public static void rider(Vehicle vehicle){
        if ((vehicle instanceof Bus)){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        if (vehicle instanceof Bus bus) bus.checkFare();
        vehicle.run();
    }
}
