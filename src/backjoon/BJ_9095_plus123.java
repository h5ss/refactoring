package backjoon;

import java.util.Scanner;

public class BJ_9095_plus123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testTimes = sc.nextInt();
        int[] testArray = new int[11];
        int[] printTest = new int[testTimes];

        testArray[0] = 0;
        testArray[1] = 1;
        testArray[2] = 2;
        testArray[3] = 4;

        for (int i = 4; i < 11; i++) {
            testArray[i] = testArray[i-1] + testArray[i-2] + testArray[i-3];
        }

        for (int i = 0; i < testTimes; i++) {
            printTest[i] = sc.nextInt();
        }
        for (int i = 0; i < testTimes; i++) {
            System.out.println(testArray[printTest[i]]);
        }

    }
}
