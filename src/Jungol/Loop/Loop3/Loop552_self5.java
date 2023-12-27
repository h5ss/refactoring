package Jungol.Loop.Loop3;

import java.util.Scanner;

class StarOutput2 {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int inputNum = sc.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (inputNum - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Loop552_self5 {
    public static void main(String[] args) {
        StarOutput2 so = new StarOutput2();
        so.run();
    }
}
