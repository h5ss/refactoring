package Jungol.String1;

import java.util.Scanner;

public class String9111_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputNum = new int[5];
        String inputStr = "jungol olympiad";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            inputNum[i] = sc.nextInt();
            if (inputNum[i]<0 || inputNum[i]>14){
                System.out.println("잘못된 범위! 다시 입력해주세요");
                i--;
            } else {
                sb.append(inputStr.charAt(inputNum[i]));
            }
        }
        System.out.println(sb);
    }
}
