package Jungol.String1;

import java.util.Scanner;

public class String9117_ex {
    public static String shift(String s) {
        return s.substring(1) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        for (int i = 0; i < inputStr.length(); i++) {
            inputStr = shift(inputStr);
            System.out.println(inputStr);
        }
    }
}
