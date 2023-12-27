package Jungol.String2;

import java.util.Scanner;

public class String9121_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = {"apple","airplane","banana","baseball","champion","class"};
        System.out.print("문자를 입력하세요. ");
        String str = sc.next();
        for (String s : strArray) {
            if (s.contains(str))
                System.out.println(s);
        }
    }
}
