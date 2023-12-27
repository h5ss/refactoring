package Jungol.Loop.Loop3;

import java.util.Scanner;

public class Loop9058_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= inputNum - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
