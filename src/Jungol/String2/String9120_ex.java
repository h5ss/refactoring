package Jungol.String2;

import java.util.Scanner;

public class String9120_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I like you better than him.";
        String[] strArray = str.split(" ");
        for (int i = 0; i < 6; i++) {
            System.out.println(strArray[i]);
        }
    }
}
