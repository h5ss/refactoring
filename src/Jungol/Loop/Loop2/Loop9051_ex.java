package Loop2;

import java.util.Scanner;

public class Loop9051_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int evenNum = 0;
        while (count != 10) {
            int inputNum = sc.nextInt();
            if (inputNum % 2 == 0)
                evenNum++;
            count++;
        }
        System.out.printf("입력받은 짝수는 %d개입니다.", evenNum);
    }
}
