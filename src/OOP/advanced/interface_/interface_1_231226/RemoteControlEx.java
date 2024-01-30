package OOP.advanced.interface_.interface_1_231226;

public class RemoteControlEx {
    public static void main(String[] args) {
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        RemoteControl remoteControl;
//        RemoteControl SAMSUNGTV = new TV();
        remoteControl = new TV(); // 객체를 생성하여 인터페이스 타입 변수에 주입(Injection)
       /* SAMSUNGTV.turnOn();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        SAMSUNGTV.setVolume(20);
        SAMSUNGTV.turnOff();*/
        remoteControl.turnOn();
        System.out.println(remoteControl.MAX_VOLUME + remoteControl.MIN_VOLUME);
        // System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        // remoteControl.turnOff();

        // remoteControl = new Radio();

        /*remoteControl.turnOn();
        System.out.println(remoteControl.MAX_VOLUME + remoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        remoteControl.turnOff();*/

        remoteControl.setMute(true);
        remoteControl.setMute(false);
        RemoteControl.changeBattery();
    }
}
