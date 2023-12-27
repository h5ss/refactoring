package Jungol.String2;

import java.util.Scanner;

public class String9122_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        if (str1.length()>str2.length()){
            System.out.println(str2);
            System.out.println(str1);
        }

        else if (str1.length()==str2.length()) {
            System.out.println(str1);
            System.out.println(str1);
        }
    }
}
