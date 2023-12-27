import java.util.*;
class OutputProgram{
    static Scanner sc = new Scanner(System.in);
    private int year,month,day;
    private String gender;
    int backNum = 0;
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    //    ------------------------------------------
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public String getGender() {
        return gender;
    }
    //    ------------------------------------------
    public int genderReturnNum(){
        if (gender.equalsIgnoreCase("m")){
            backNum =3;
            return backNum;
        }
        else if (gender.equalsIgnoreCase("f")) {
            backNum =4;
            return backNum;
        }
        else{
            System.out.print("성별을 다시 입력해 주세요.(m/f):");
            gender = sc.next();
            return genderReturnNum();
        }
    }
    public long randomNum(){
        long randomBack = (long)(Math.random()*999999);
        return randomBack;
    }
    //    -------------------------------------------
    public void inputProgram(){
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        year = sc.nextInt();
        System.out.print("출생월를 입력해 주세요.(mm):");
        month = sc.nextInt();
        System.out.print("출생일를 입력해 주세요.(dd):");
        day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        gender = sc.next();
        setYear(year);
        setMonth(month);
        setDay(day);
        setGender(gender);
    }
    public void outputProgram(){

        System.out.printf("%02d%2d%02d-%d%d",getYear()%100,getMonth(),getDay(),genderReturnNum(),randomNum());
    }
}
public class HumanNo {
    public static void main(String[] args) {
        OutputProgram op = new OutputProgram();
        op.inputProgram();
        op.outputProgram();
    }
}
