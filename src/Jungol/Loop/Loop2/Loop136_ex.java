package Loop2;

import java.util.Scanner;

public class Loop136_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(inputNum * i + " ");
        }
    }
}
