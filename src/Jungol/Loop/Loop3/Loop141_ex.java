package Jungol.Loop.Loop3;

import java.util.Scanner;

class MulOutput {
    static Scanner sc = new Scanner(System.in);

    private void tenMul(int num) {
        if (num < 1 || num > 100)
            run();
        else {
            int i = 1;
            while (num * i < 100) {
                System.out.print(num * i + " ");
                if ((num * i) % 10 == 0)
                    System.exit(0);
                i++;
            }
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        tenMul(inputNum);
    }
}

public class Loop141_ex {
    public static void main(String[] args) {
        MulOutput mo = new MulOutput();
        mo.run();
    }
}
