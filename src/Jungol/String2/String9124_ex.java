package Jungol.String2;

import java.util.Scanner;

public class String9124_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.replace(str1.substring(0,3),str2.substring(0,3)));
        System.out.println(str2.concat(str1.substring(0,3)));
    }
}
