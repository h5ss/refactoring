package Loop2;

import java.util.Scanner;

class DecNum {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int scopeNum = sc.nextInt();
        int total = 0;
        int count = 0;
        for (int i = 0; i < scopeNum; i++) {
            int inputNum = sc.nextInt();
            if (inputNum > 100) {
                System.out.print("100 이하의 자연수!\n다시 입력!!");
                i--;
            } else {
                total += inputNum;
                count++;
            }
        }
        System.out.printf("%.2f", (double) total / count);

    }


}

public class Loop133_ex {

    public static void main(String[] args) {
        DecNum dec = new DecNum();
        dec.run();
    }
}
