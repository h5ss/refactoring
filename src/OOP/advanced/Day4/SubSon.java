package OOP.advanced.Day4;

public class SubSon extends SubFather{
    SubSon(String familyName, String houseAddress){
        super(familyName, houseAddress);
    }
    public void printSon(){
        System.out.println("나는 아들입니다.\n나는 아버지로부터 상속받습니다.");
    }
    public static void main(String[] args) {
        SubSon objSon = new SubSon("프로그래머","인천");
        objSon.printSon();
        objSon.printFatherInfo();
        objSon.printFather();
        objSon.printGrandFather();
    }
}
