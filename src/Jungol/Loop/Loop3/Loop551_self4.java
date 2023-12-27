package Jungol.Loop.Loop3;

import java.util.Scanner;

class StarOutput {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int inputNum = sc.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= inputNum; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Loop551_self4 {
    public static void main(String[] args) {
        StarOutput so = new StarOutput();
        so.run();
    }
}
