package Loop1;

import java.util.Scanner;

public class Loop9044_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        while (true) {
            int num = sc.nextInt();
            if (num % 2 == 1) {
                total += num;
                count++;
            } else if (num == 0)
                break;
        }
        double avg = total / count;
        System.out.printf("홀수의 합 = %d\n", total);
        System.out.printf("홀수의 평균 = %.0f", avg);
    }
}
