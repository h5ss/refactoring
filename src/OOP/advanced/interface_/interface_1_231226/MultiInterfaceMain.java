package OOP.advanced.interface_.interface_1_231226;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        Searchable searchable;

        remoteControl = new SmartTv();
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setVolume(20);
        remoteControl.setMute(true);

        searchable = new SmartTv();
        searchable.search("https://naver.com");

    }
}
