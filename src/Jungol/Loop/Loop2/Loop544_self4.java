package Loop2;

import java.util.Scanner;

public class Loop544_self4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        int total = 0;
        if (inputNum > 100)
            System.out.println("다시 입력해주세요.");
        else {
            for (int i = inputNum; i <= 100; i++)
                total += i;
        }
        System.out.println(total);
    }
}
