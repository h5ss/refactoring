package Loop1;

import java.util.Scanner;

public class Loop126_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int oddNum = 0, evenNum = 0;

        while (true) {
            int inputNum = sc.nextInt();
            if (inputNum % 2 == 1)
                oddNum++;
            else if (inputNum % 2 == 0 && inputNum != 0)
                evenNum++;
            if (inputNum == 0) {
                System.out.printf("odd : %d\n", oddNum);
                System.out.printf("even : %d\n", evenNum);
                break;
            }
        }
    }
}
