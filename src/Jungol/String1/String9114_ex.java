package Jungol.String1;

import java.util.Scanner;

public class String9114_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String inputStr = sc.next();
            if ((int)inputStr.charAt(0)>=65 && (int)inputStr.charAt(0)<=90)
                System.out.println("대문자입니다.");
            else if ((int)inputStr.charAt(0)>=97 && (int)inputStr.charAt(0)<=122 ) {
                System.out.println("소문자입니다.");
            }
            else if ((int)inputStr.charAt(0)>=48 && (int)inputStr.charAt(0)<=57){
                System.out.println("숫자문자입니다.");
            }else{
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
