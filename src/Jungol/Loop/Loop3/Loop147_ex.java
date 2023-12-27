package Jungol.Loop.Loop3;

import java.util.Scanner;

class NumOutput2 {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 1) {
            System.out.println("자연수 n을 입력하세요.");
            run();
        } else {
            int increaseNum = 1;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(increaseNum++ + " ");
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

public class Loop147_ex {
    public static void main(String[] args) {
        NumOutput2 no = new NumOutput2();
        no.run();
    }
}
