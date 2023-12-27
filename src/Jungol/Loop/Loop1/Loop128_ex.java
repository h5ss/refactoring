package Loop1;

import java.util.Scanner;

public class Loop128_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int countThree = 0;
        int countFive = 0;
        int countAll = 0;
        while (true) {
            int inputNum = sc.nextInt();
            if (inputNum == 0) {
                int output = countAll - (countFive + countThree);
                System.out.printf("%d ", output);
                break;
            }
            countAll++;
            if (inputNum % 3 == 0)
                countThree++;
            else if (inputNum % 5 == 0)
                countFive++;
        }
    }
}
