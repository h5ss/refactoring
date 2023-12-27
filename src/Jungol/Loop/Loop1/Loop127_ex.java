package Loop1;

import java.util.Scanner;

public class Loop127_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0, count = 0;
        while (true) {
            int inputNum = sc.nextInt();

            if (inputNum > 100 || inputNum < 0) {
                double avg = (double) total / count;
                System.out.printf("sum : %d\n", total);
                System.out.printf("avg : %.1f", avg);
                break;
            }
            count++;
            total += inputNum;

        }
    }
}
