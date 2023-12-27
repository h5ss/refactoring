package Loop2;

import java.util.Scanner;

public class Loop130_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int inputNum = sc.nextInt();
            if (inputNum > 10) {
                System.out.println("10 이하의 자연수 입력!");
                continue;
            } else {
                for (int i = 0; i < inputNum; i++)
                    System.out.println("JUNGOL");
                break;
            }

        }
    }
}
