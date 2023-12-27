package OOP.advanced.interface_1_231226;

public interface RemoteControl {
    // 1. 상수 필드
    int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;

    // 2. 추상 메소드 abstract , {}바디가 없는 메소드(메소드 선언부만 작성)
    void turnOn();
    void turnOff();
    void setVolume(int volume);


    //3. 디폴트 메소드 (default method) 인터페이스에서 완전한 실행코드를 가진 유일한 메소드
    default void setMute(boolean mute){
        if (mute){
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("Mute Cancel");
        }
    }
    static void changeBattery(){
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}
