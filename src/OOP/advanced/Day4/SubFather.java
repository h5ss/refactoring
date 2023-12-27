package OOP.advanced.Day4;

public class SubFather extends GrandFather{
    private String familyName;
    private String houseAddress;

    public String getFamilyName() {
        return familyName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    SubFather(String familyName, String houseAddress){
        this.familyName = familyName;
        this.houseAddress = houseAddress;
    }
    public void printFatherInfo(){
        System.out.printf("나의 아버지는 %s\n", familyName);
        System.out.printf("나의 집은 %s\n", houseAddress);
    }
    public void printFather(){
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
    }

}
