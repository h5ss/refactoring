package Modeling과제.Appliance;

public class WallMounteAirConditioner extends AirConditioner implements RemoteControl{
    public WallMounteAirConditioner() {
    }

    @Override
    public void turnOn() {
        System.out.println("벽걸이형 에어컨 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("벽걸이형 에어컨 꺼짐");
    }
}
