package Jungol.Loop.Loop3;

import java.util.Scanner;

class NumOutput {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 0) {
            System.out.println("자연수를 입력하세요");
            run();
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < 2 * (num - 1) - 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j + " ");
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

public class Loop145_ex {
    public static void main(String[] args) {
        NumOutput no = new NumOutput();
        no.run();
    }
}
