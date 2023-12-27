package Jungol.Loop.Loop3;

import java.util.Scanner;

class engOutput {
    static Scanner sc = new Scanner(System.in);

    private void repeat(int num) {
        while (true) {
            if (num < 1 || num > 6) {
                System.out.println("1에서 6사이의 값 입력");
                run();
            } else {
                char c = 'A';
                for (int i = 1; i <= num; i++) {
                    for (int j = i; j <= num; j++) {
                        System.out.print(c++);
                    }
                    System.out.println();
                }
                break;
            }
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        repeat(inputNum);
    }
}

public class Loop553_self6 {
    public static void main(String[] args) {
        engOutput eo = new engOutput();
        eo.run();
    }

}
