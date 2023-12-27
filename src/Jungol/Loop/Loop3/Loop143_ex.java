package Jungol.Loop.Loop3;

import java.util.Scanner;

class StarOutput4 {
    static Scanner sc = new Scanner(System.in);

    public void sandClock(int num) {
        if (num < 1)
            run();
        else {

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 2 * i - 1; k <= 2 * num - 1; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
            int increaseNum = 3;
            for (int i = 1; i <= num - 1; i++) {
                for (int j = i; j <= num - 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= increaseNum; k++) {
                    System.out.print("*");
                }
                increaseNum += 2;
                for (int j = i; j <= num - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        sandClock(inputNum);
    }
}

public class Loop143_ex {
    public static void main(String[] args) {
        StarOutput4 so = new StarOutput4();
        so.run();
    }
}
