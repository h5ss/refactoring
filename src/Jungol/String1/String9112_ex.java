package Jungol.String1;

import java.util.Scanner;

public class String9112_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        String[] strArray = new String[inputStr.length()];
        for (int i = 0; i < inputStr.length(); i++) {
            strArray[i] = String.valueOf(inputStr.charAt(i));
        }
        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n",inputStr.length());
        for (int i = inputStr.length()-1; i >=0; i--) {
            System.out.print(strArray[i]);
        }
    }
}
