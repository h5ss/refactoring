package Loop2;

import java.util.Scanner;

public class Loop139_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        for (int i = 1; i <= 9; i++) {
            if (max == num1) {
                for (int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);
                }
                System.out.println();
            } else {
                for (int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);
                }
                System.out.println();
            }

        }
    }
}
