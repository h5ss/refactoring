package Jungol.Loop.Loop3;

import java.util.Scanner;

class NumEngOutput {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 1 || num > 6) {
            System.out.println("6이하의 자연수 입력");
            run();
        } else {
            char c = 'A';
            int increaseNum = 0;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print(c++ + " ");
                }
                for (int j = 0; j < i; j++) {
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

public class Loop146_ex {
    public static void main(String[] args) {
        NumEngOutput neo = new NumEngOutput();
        neo.run();
    }
}
