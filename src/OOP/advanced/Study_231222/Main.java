package OOP.advanced.Study_231222;

public class Main {
    public static void main(String[] args) {
        Wifi internet = new Wifi();

        MyNoteBook myNoteBok = new MyNoteBook(internet);
        YourNotebook yourNotebook = new YourNotebook(internet);
        myNoteBok.openBrowser();
        yourNotebook.openKakaoTalk();

    }
}
