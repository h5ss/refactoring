package OOP.advanced.interface_1_231226;
// RemoteControl 인터페이스를 기준으로 해당 Radio 클래스를 구현하세요
//LG Radio 객체를 생성하여 다음과 같은 동작을 차례를 수행시키세요.
//1. 전원을 켠다
//2. 해당 Radio의 기본 MAX, MIN 볼륨값을 확인한다
//3. Radio의 볼륨을 20을 세팅하고 값을 확인한다.
//4. 전원을 끈다.
public class Radio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("라디오 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오 끔");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME - 15;
        else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
        else this.volume = volume;
    }
}
