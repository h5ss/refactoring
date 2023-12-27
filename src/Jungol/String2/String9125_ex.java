package Jungol.String2;

import java.util.Scanner;

public class String9125_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = {"champion", "tel", "pencil", "jungol",
                "olympiad", "class", "information", "lesson", "book", "lion"};
        while (true) {
            int count = 0, count2 = 0;

            System.out.print("문자를 입력하세요. ");
            char inputStr = sc.next().charAt(0);

            for (int i = 0; i < 10; i++){
                if (strArray[i].contains(Character.toString(inputStr))) {
                    System.out.println(strArray[i]);
                    count++;
                }
            }
            System.out.println();
            if (count == 0) {
                System.out.println("찾는 단어가 없습니다.");
                break;
            }

            System.out.print("문자열을 입력하세요. ");
            char inputStr2 = sc.next().charAt(0);

            for (int i = 0; i < 10; i++){
                if (strArray[i].contains(Character.toString(inputStr2))) {
                    System.out.println(strArray[i]);
                    count2++;
                }
            }
            System.out.println();

            if (count2 == 0) {
                System.out.println("찾는 단어가 없습니다.");
                break;
            }
        }
    }
}
