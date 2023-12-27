package OOP.advanced.Abstract_231221;

public class Dog extends AbstractDog{

    @Override
    public void printSound() {
        System.out.println("무어엉");
    }

    @Override
    public void tailing() {
        System.out.println("살랑살랑");
    }
}
