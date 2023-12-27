package 내가만든프로젝트;

public class UserService extends Person{

    public UserService(String cusName, String cusTel) {
        super(cusName, cusTel);
    }
    public void printFirst(){
        System.out.print("당신의 이름을 입력하세요 : ");
        String yourName = sc.next();
        System.out.print("연락처를 입력하세요 : ");
        String yourTel = sc.next();
    }
}
