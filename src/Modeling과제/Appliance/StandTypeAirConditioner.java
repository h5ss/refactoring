package Modeling과제.Appliance;

public class StandTypeAirConditioner extends AirConditioner implements RemoteControl{
    public StandTypeAirConditioner() {
    }

    @Override
    public void turnOn() {
        System.out.println("스탠드형 에어컨 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("스탠드형 에어컨 켜짐");
    }
}
