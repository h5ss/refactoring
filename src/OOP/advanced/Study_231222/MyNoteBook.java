package OOP.advanced.Study_231222;

public class MyNoteBook {
    private Wifi internet;
    public MyNoteBook(Wifi wifi){
        this.internet = wifi;
    }
    void openBrowser(){
    this.internet.connectionInternet();
    }
}
