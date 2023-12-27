package Loop2;

import java.util.Scanner;

public class Loop131_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 > 100 || num2 > 100) {
                System.out.println("100 이하의 두 개의 정수!");
                continue;
            } else {
                int min = (num1 < num2) ? num1 : num2;
                int max = (num1 > num2) ? num1 : num2;
                for (int i = min; i <= max; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }
}
