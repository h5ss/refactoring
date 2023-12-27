package Jungol.Loop.Loop3;

import java.util.Scanner;

public class Loop634_self2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
