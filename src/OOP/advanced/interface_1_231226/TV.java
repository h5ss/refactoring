package OOP.advanced.interface_1_231226;
// RemoteControl 인터페이스를 기준으로 해당 TV 클래스를 구현하세요
//SAMSUNG TV 객체를 생성하여 다음과 같은 동작을 차례를 수행시키세요.
//1. 전원을 켠다
//2. 해당 TV의 기본 MAX, MIN 볼륨값을 확인한다
//3. TV의 볼륨을 20을 세팅하고 값을 확인한다.
//4. 전원을 끈다.
public class TV implements RemoteControl{
    private int volume;
    private int memoryVolume;

    @Override
    public void turnOn() {
        System.out.println("TV 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끔");
    }

    @Override
    public void setVolume(int volume) { // 추상 메소드 재정의(오버 라이딩)
        // 인터페이스 상수를 이용해서 MAX_VOLUME 과 LOW_VOLUME 을 사용하여 넘지 않게끔
        if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME - 15;
        else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
        else this.volume = volume;
        System.out.println("현재 볼륨값 :"+this.volume);
    }

    // 3. default method : setMute() 사용
    // RemoteControl 의 setMute() : 무음처리 기능을 TV 클래스에서 기존의 볼륭을 기억하여 복원시키는 기능을 재정의 하시오.


    @Override
    public void setMute(boolean mute) {
        if (mute){
            this.memoryVolume = this.volume;
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("Mute Cancel");
            this.volume = this.memoryVolume;
            System.out.println(this.volume);
        }
    }
}
