package Loop2;

import java.util.Scanner;

public class Loop132_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        int sumFive = 0;
        for (int i = 1; i <= inputNum; i++) {
            if (i % 5 == 0) {
                sumFive += i;
            }
        }
        System.out.println(sumFive);
    }
}
