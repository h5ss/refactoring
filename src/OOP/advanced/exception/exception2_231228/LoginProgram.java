package OOP.advanced.exception.exception2_231228;

import java.util.Scanner;

public class LoginProgram {
    static Scanner sc = new Scanner(System.in);
    private String userPassword;
    private String userId;

    public void setUserId(String userId) throws NoExitIdWrongPasswordException{
        if (userId == null){
            throw new NoExitIdWrongPasswordException("아이디는 null 일 수 없습니다.");
        }else if (userId.length() <  8 || userId.length() > 20){
            throw new NoExitIdWrongPasswordException("아이디는 8자 이상, 20자 이하만 가능합니다.");
        }
        this.userId = userId;
    }
    public void setPassword(String userPassword) throws NoExitIdWrongPasswordException{
        if (userPassword == null){
            throw new NoExitIdWrongPasswordException("패스워드는 null 일 수 없습니다.");
        }else if (userPassword.length() <= 5){
            throw new NoExitIdWrongPasswordException("패스워드는 6자 이상입니다.");
        } else if (userPassword.matches("^[a-zA-Z0-9]*$")) {
            throw new NoExitIdWrongPasswordException("문자열로만 이루어지면 안 됩니다!!");
        }
        this.userPassword = userPassword;
    }

    public static void main(String[] args) {
        LoginProgram test = new LoginProgram();
        String userId = null;
        String userPassword = null;
        System.out.println("[프로그램 실행]");

            try {
                System.out.println("아이디를 입력하세요 :");
                userId = sc.next();
                test.setUserId(userId);
                System.out.println("패스워드를 입력하세요 :");
                userPassword = sc.next();
                test.setPassword(userPassword);
            } catch (NoExitIdWrongPasswordException ie) {
                System.out.println(ie.getMessage());
            } catch (Exception e) {
                System.out.println("[프로그램 종료]");
            }

        if (NoExitIdWrongPasswordException.idPwTrueFalse(userId,userPassword))
            System.out.println("회원가입 완료");
    }
}
