package Loop2;

import java.util.Scanner;

public class Loop9052_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int inputNum = sc.nextInt();
            total += inputNum;
        }
        double avg = total / 5.0;
        System.out.printf("총점 : %d\n", total);
        System.out.printf("평균 : %.1f", avg);
    }
}
