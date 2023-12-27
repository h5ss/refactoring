package Jungol.Loop.Loop3;

import java.util.Scanner;

class TotalAvg {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int total = 0, count = 0;

        for (int i = 0; i < 20; i++) {
            int inputNum = sc.nextInt();
            if (inputNum == 0)
                break;
            total += inputNum;
            count++;
        }
        int avg = total / count;
        System.out.printf("%d %d", total, avg);
    }
}

public class Loop140_ex {
    public static void main(String[] args) {
        TotalAvg ta = new TotalAvg();
        ta.run();
    }
}
