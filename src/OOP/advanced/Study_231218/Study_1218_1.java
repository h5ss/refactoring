package OOP.advanced.Study_231218;
class Student{
    private int id = 0 ;
    private String name = "" ;
    public void insertRecord(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void printInfo(){
        System.out.printf("id는 %d 이름은 %s",this.id, this.name );
    }
}
public class Study_1218_1 {
    public static void main(String[] args) {
        Student setObj1 = new Student();
        setObj1.insertRecord(20211004,"홍길순");
        setObj1.printInfo();
    }
}
