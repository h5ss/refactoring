package Jungol.Loop.Loop3;

import java.util.Scanner;

public class Loop9061_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        int upNum = 0;
        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= i; j++) {
                upNum++;
                System.out.print(upNum + " ");
            }
            System.out.println();
        }
    }
}
