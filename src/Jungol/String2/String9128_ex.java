package Jungol.String2;

import java.util.Scanner;

public class String9128_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr1 = sc.next();
        int changeInt1 = Integer.parseInt(inputStr1);
        String inputStr2 = sc.next();
        int changeInt2 = Integer.parseInt(inputStr2);
        String inputStr3 = sc.next();
        double changeDouble3 = Double.parseDouble(inputStr3);
        String inputStr4 = sc.next();
        double changeDouble4 = Double.parseDouble(inputStr4);

        System.out.printf("%d + %d = %d\n",changeInt1,changeInt2,changeInt1+changeInt2);
        System.out.printf("%.2f + %.2f = %.2f",changeDouble3,changeDouble4,changeDouble3+changeDouble4);
    }
}
