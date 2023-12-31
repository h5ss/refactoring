package OOP.advanced.exception.exception2_231228;

public class NoExitIdWrongPasswordException extends Exception{
    private static String userIdHo = "dvbf1004";
    private static String userPasswordHo = "qwe123!@#";
    protected String userId;
    protected String userPassword;

    public NoExitIdWrongPasswordException(String message){
        super(message);
    }

    public static boolean idPwTrueFalse(String userId,String userPassword){
        return userId.equals(userIdHo) && userPassword.equals(userPasswordHo);
    }
}
