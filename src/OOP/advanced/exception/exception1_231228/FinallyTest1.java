package OOP.advanced.exception.exception1_231228;

import java.util.Scanner;

public class FinallyTest1 {
    static Scanner sc = new Scanner(System.in);
    /*public static void main(String[] args) {
            System.out.print("2개의 정수를 입력 :");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            try {
                returnIntFinally(num1,num2);
            }catch (ArithmeticException e){
                System.out.println("0으로 나누면 안 됩니다~");
                e.printStackTrace();
            }finally {
                System.out.println("종료됨");
            }
    }
    public static void returnIntFinally(int number1, int number2) throws ArithmeticException{
        int divide = number1 / number2;
        System.out.println(divide);
    }*/
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        int num1, num2;
        System.out.println("두 수를 차례로 입력해주세요");
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            int checkn = FinallyTest1.returnFinally(num1, num2);
        }catch (Exception e){

        }
        System.out.println();
    }
    public static int returnFinally(int number1, int number2) {
        try {
            double result = number1 / number2;
            String data = String.format("%.2f", result);
            System.out.println(data);
            return 0;
        } catch (ArithmeticException ar) {
            ar.printStackTrace();
            return 1;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("catch 구문 출력");
        }finally {
            return 3;
        }
    }
}
