package Jungol.String2;

import java.util.Scanner;

public class String9126_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        if (str1.hashCode()>str2.hashCode())
            System.out.printf("%s 가(이) 더 큽니다.\n",str1);
        else
            System.out.printf("%s 가(이) 더 큽니다.\n",str2);

        if (str1.substring(0,4).equals(str2.substring(0,4)))
            System.out.println("앞의 세 문자가 같습니다.\n");
        else
            System.out.println("앞의 세 문자가 같지 않습니다.\n");
    }
}
