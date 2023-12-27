package OOP.advanced.Day4;

public class BabyCat extends ParentCat{
    private String color;
    BabyCat(){}
    BabyCat(String color){
        super("샴고양이");
        this.color=color;
    }
    public void meow(){
        System.out.println("냐옹");
    }
    public void printInfo(){
        getBreed();
        System.out.println(this.color);
    }
}
