package Loop2;

import java.util.Scanner;

class OddOutput {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int inputNum = sc.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Loop543_self3 {

    public static void main(String[] args) {
        OddOutput oo = new OddOutput();
        oo.run();
    }
}
