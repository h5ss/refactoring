package Loop2;

import java.util.Scanner;

public class Loop9050_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        int outputNum = 0;
        for (int i = 1; i <= inputNum; i++) {
            outputNum += i;
        }
        System.out.println(outputNum);
    }
}
