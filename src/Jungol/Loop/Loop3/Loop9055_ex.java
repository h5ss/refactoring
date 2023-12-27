package Jungol.Loop.Loop3;

import java.util.Scanner;

class CompareSum {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int inputNUm = sc.nextInt();
        int total = 0, count = 1;
        while (true) {
            total += count;
            if (total > inputNUm) {
                System.out.print(count + " " + total);
                break;
            }
            count++;
        }
    }
}

public class Loop9055_ex {
    public static void main(String[] args) {
        CompareSum cs = new CompareSum();
        cs.run();
    }
}
