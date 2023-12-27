package Jungol.Loop.Loop3;

import java.util.Scanner;

class NumOutput3 {
    static Scanner sc = new Scanner(System.in);

    private void program(int num) {
        if (num < 1) {
            System.out.println("자연수를 입력해주세요.");
            run();
        } else {
            int oddNum = 1;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(oddNum + " ");
                    oddNum += 2;
                    if (oddNum == 11) oddNum = 1;
                }
                System.out.println();
            }
        }
    }

    public void run() {
        int inputNum = sc.nextInt();
        program(inputNum);
    }
}

public class Loop149_ex {
    public static void main(String[] args) {
        NumOutput3 no = new NumOutput3();
        no.run();
    }
}
