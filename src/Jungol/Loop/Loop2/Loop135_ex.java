package Loop2;

import java.util.Scanner;

class ThreeFive {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int threeCount = 0, fiveCount = 0, total = 0, count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
                count++;
            }
        }
        double avg = (double) total / count;
        System.out.printf("sum : %d\n", total);
        System.out.printf("avg : %.1f", avg);
    }
}

public class Loop135_ex {
    public static void main(String[] args) {
        ThreeFive tf = new ThreeFive();
        tf.run();
    }
}
