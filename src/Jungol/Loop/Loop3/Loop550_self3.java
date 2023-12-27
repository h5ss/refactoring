package Jungol.Loop.Loop3;

import java.util.Scanner;

class DownUpOutput {
    static Scanner sc = new Scanner(System.in);

    private void upOutput(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void downOutput(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        upOutput(inputNum);
        downOutput(inputNum);
    }
}

public class Loop550_self3 {
    public static void main(String[] args) {
        DownUpOutput duo = new DownUpOutput();
        duo.run();
    }
}
