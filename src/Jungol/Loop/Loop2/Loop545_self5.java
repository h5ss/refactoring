package Loop2;

import java.util.Scanner;

public class Loop545_self5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int countThree = 0;
        int countFive = 0;
        for (int i = 0; i < 10; i++) {
            int inputNum = sc.nextInt();
            if (inputNum % 3 == 0)
                countThree++;
            if (inputNum % 5 == 0) {
                countFive++;
            }
        }
        System.out.printf("Multiples of 3 : %d\n", countThree);
        System.out.printf("Multiples of 5 : %d", countFive);

    }
}
