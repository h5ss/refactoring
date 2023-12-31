package OOP.advanced.exception.exception2_231228;

import java.util.Scanner;

public class IDFormatTest {
    static Scanner sc = new Scanner(System.in);

    public void setUserId(String userId) throws IDFormatException{
        if (userId == null){
            throw new IDFormatException("아이디는 null 일 수 없습니다.");
        }else if (userId.length() <  8 || userId.length() > 20){
            throw new IDFormatException("아이디는 8자 이상, 20자 이하만 가능합니다.");
        }
        this.userId = userId;
    }
    public String getUserId() {
        return userId;
    }
    private String userId;
    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userId;
        try{
            userId = sc.next();
            test.setUserId(userId);
        }catch (IDFormatException ie){
            System.out.println(ie.getMessage());
        }catch (Exception e){
            System.out.println("예외 발생 프로그램 다시 시작");
        }
        System.out.println(test.getUserId() +" 회원가입 완료");
    }
}
