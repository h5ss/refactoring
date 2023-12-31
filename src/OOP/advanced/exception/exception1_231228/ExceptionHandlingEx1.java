package OOP.advanced.exception.exception1_231228;

public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("자바프로그램입니다.");
        printLength(null);
        System.out.println("[프로그램 종료]"); // 예외가 발생해도 종료 되지 않도록 try-catch로 예외처리함
    }

    private static void printLength(String s) {
        try {
            int result = s.length();
            System.out.println("문자 수:" + result);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());// 예외 출력방식 1 : 에러의 원인을 간단하게 출력
            System.out.println("입력 데이터가 잘못되었습니다. ]다시 입력해 주세요!."); // 예외 출력방식1 : 사용자에게 보여주고 싶은 방식
            System.out.println(e.toString());// 예외 출력방식 2 : Exception 의 원인과 내용을 출력
            e.printStackTrace(); // 예외 출력방식3 : 에러의 발생 근원지를 찾아서 단계별로 에러를 출력
        }

    }
}
