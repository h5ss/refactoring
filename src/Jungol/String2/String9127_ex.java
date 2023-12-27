package Jungol.String2;

import java.util.Scanner;

public class String9127_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = new String[5];
        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            strArray[i] = sc.next();
        }
        String tmp ;
        for (int i = 0; i < strArray.length-1; i++) {
            for (int j = 0; j < strArray.length-1-i; j++) {
                if (strArray[j].charAt(0)>strArray[j+1].charAt(0)){
                    tmp = strArray[j];
                    strArray[j] = strArray[j+1];
                    strArray[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(strArray[i]);
        }
    }
}
