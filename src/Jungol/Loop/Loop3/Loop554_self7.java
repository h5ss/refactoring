package Jungol.Loop.Loop3;

import java.util.Scanner;

class OutputCharNum {
    static Scanner sc = new Scanner(System.in);

    private void output(int num) {
        while (true) {
            if (num < 0)
                run();
            else {
                int upNum = 1;
                char upChar = 'A';
                for (int i = 1; i <= num; i++) {
                    for (int j = i; j <= num; j++) {
                        System.out.print(upNum++ + " ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(upChar++ + " ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        output(inputNum);
    }
}

public class Loop554_self7 {
    public static void main(String[] args) {
        OutputCharNum ocn = new OutputCharNum();
        ocn.run();
    }
}
