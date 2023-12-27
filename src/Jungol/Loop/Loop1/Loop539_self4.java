package Loop1;

import java.util.Scanner;

public class Loop539_self4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        while (true) {
            int num = sc.nextInt();
            total += num;
            count++;
            if (num >= 100) {
                double avg = (double) total / count;
                System.out.println(total);
                System.out.printf("%.1f", avg);
                break;
            }
        }
    }
}
