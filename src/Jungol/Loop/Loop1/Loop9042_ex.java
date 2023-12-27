package Loop1;

import java.util.Scanner;

public class Loop9042_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int total = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0)
                break;
            count++;
            total += num;
        }
        double avg = (double) total / count;
        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n", total);
        System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
    }
}
