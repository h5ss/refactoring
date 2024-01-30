package OOP.advanced.interface_.interface_1_231226;

public class SmartTv implements RemoteControl, Searchable{
    private int volume;
    private int channel;
    @Override
    public void turnOn() {
        System.out.println("SmartTV 전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV 전원 Off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME - 15;
        else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
        else this.volume = volume;
        System.out.println("현재 볼륨값 :"+this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "검색합니다.");
    }

    @Override
    public void channelUp(int channel) {
        this.channel++;
    }

    @Override
    public void channelDown(int channel) {
        this.channel--;
    }
}
