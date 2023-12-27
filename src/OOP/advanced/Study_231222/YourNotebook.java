package OOP.advanced.Study_231222;

public class YourNotebook {
    private Wifi internet;
    public YourNotebook(Wifi wifi){
        this.internet = wifi;
    }
    void openKakaoTalk(){
        this.internet.connectionInternet();
    }
}
