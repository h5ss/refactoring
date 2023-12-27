package Jungol.Loop.Loop3;

import java.util.Scanner;

class OutputOdd {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int inputNum = sc.nextInt();
        int oddTotal = 0;
        int oddCount = 0;
        for (int i = 1; i <= inputNum; i++) {
            if (i % 2 == 1) {
                oddTotal += i;
                oddCount++;
                if (oddTotal >= inputNum) {
                    System.out.print(oddCount + " " + oddTotal);
                    break;
                }
            }
        }
    }
}

public class Loop549_self1 {
    public static void main(String[] args) {
        OutputOdd oo = new OutputOdd();
        oo.run();
    }
}
