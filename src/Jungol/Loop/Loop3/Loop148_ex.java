package Jungol.Loop.Loop3;

import java.util.Scanner;

class StrOutput {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 1) {
            System.out.println("자연수를 입력해주세요.");
            run();
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            for (int i = 1; i <= num - 1; i++) {
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= num - 1; j++) {
                    System.out.print("# ");
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

public class Loop148_ex {
    public static void main(String[] args) {
        StrOutput so = new StrOutput();
        so.run();
    }
}
