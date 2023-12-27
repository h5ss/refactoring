package Jungol.Loop.Loop3;

import java.util.Scanner;

class StarOutput3 {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 1)
            run();
        else {
            for (int i = 1; i <= num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = num - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
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

public class Loop142_ex {
    public static void main(String[] args) {
        StarOutput3 so = new StarOutput3();
        so.run();
    }
}
