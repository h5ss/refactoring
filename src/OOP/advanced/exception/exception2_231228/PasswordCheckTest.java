package OOP.advanced.exception.exception2_231228;

import java.util.Scanner;

public class PasswordCheckTest extends Exception{
    static Scanner sc = new Scanner(System.in);
    private String userPassword;
    public String getPassword(){
        return userPassword;
    }

    public void setPassword(String userPassword) throws PasswordCheckException{
        if (userPassword == null){
            throw new PasswordCheckException("패스워드는 null 일 수 없습니다.");
        }else if (userPassword.length() <= 5){
            throw new PasswordCheckException("패스워드는 6자 이상입니다.");
        } else if (userPassword.matches("^[a-zA-Z0-9]*$")) {
            throw new PasswordCheckException("문자열로만 이루어지면 안 됩니다!!");
        }
        this.userPassword = userPassword;
    }
    public static void main(String[] args) {
        PasswordCheckTest test = new PasswordCheckTest();
        String userPassword;
        System.out.println("[프로그램 실행]\n패스워드를 입력하세요.\n");

        try{
            userPassword = sc.next();
            test.setPassword(userPassword);
        }catch (PasswordCheckException pe){
            System.out.println(pe.getMessage());
            pe.printStackTrace();
        }catch (Exception e){
            System.out.println("[프로그램 종료]");
            e.printStackTrace();
        }finally {
            System.out.println("[입력 완료]");
            System.out.println("[프로그램 종료]");
        }
    }

}
