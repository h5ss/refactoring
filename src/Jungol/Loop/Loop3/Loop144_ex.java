package Jungol.Loop.Loop3;

import java.util.Scanner;

class StarOutput5 {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 1) {
            System.out.println("자연수를 입력해주세요");
            run();
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < 2 * (num - 1) - 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        program(inputNum);
    }
}

public class Loop144_ex {
    public static void main(String[] args) {
        StarOutput5 so = new StarOutput5();
        so.run();
    }
}
