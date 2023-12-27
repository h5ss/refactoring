package OOP.advanced.Day4;

public class CatMain {
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat("brown");
        babyCat.eat();
        babyCat.meow();
        babyCat.printInfo();
        Object object = babyCat;
        BabyCat  baby = (BabyCat) object;
    }
}
